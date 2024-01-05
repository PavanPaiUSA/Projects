--This procedure retrieves member details based on the subscription plan.
CREATE PROCEDURE GetMembersBySubscriptionPlan
    @SubscriptionPlan VARCHAR(50),
    @MemberCount INT OUTPUT
AS
BEGIN
    SELECT M.Member_name, M.Member_Gender
    FROM Members AS M
    INNER JOIN Subscribes AS SB ON M.Member_ID = SB.Member_ID
    INNER JOIN Subscriptions AS S ON SB.Subscription_ID = S.Subscription_ID
    WHERE S.Sub_Plan = @SubscriptionPlan;

    SET @MemberCount = @@ROWCOUNT;
END;

--Execution
DECLARE @Count INT

EXEC GetMembersBySubscriptionPlan @SubscriptionPlan = 'Basic', @MemberCount = @Count OUTPUT

SELECT @Count AS 'MemberCount'

--This procedure retrieves trainer details along with the count of sessions they've conducted and capture the count of trainers meeting the specified session count criteria:
CREATE PROCEDURE GetTrainersWithSessionCount
    @MinSessionCount INT,
    @TrainerCount INT OUTPUT
AS
BEGIN
    SELECT T.Trainer_Name, T.Trainer_Experience, COUNT(S.Session_ID) AS SessionCount
    FROM Trainer AS T
    LEFT JOIN Session AS S ON T.Trainer_ID = S.Trainer_ID
    GROUP BY T.Trainer_Name, T.Trainer_Experience
    HAVING COUNT(S.Session_ID) >= @MinSessionCount;

    SET @TrainerCount = @@ROWCOUNT;
END;

--Execution
DECLARE @Count INT

EXEC GetTrainersWithSessionCount @MinSessionCount = 1, @TrainerCount = @Count OUTPUT

SELECT @Count AS 'TrainerCount'

--This procedure retrieves merchandise details purchased by a specific member with added output parameters to capture the count of merchandise items retrieved
CREATE PROCEDURE GetMerchandiseByMember
    @MemberID INT,
    @MerchandiseCount INT OUTPUT
AS
BEGIN
    SELECT DISTINCT M.Merch_Color, M.Merch_Price
    FROM Merchandise AS M
    INNER JOIN Purchase AS P ON M.Merchandise_ID = P.Merchandise_ID
    WHERE P.Member_ID = @MemberID;

    SET @MerchandiseCount = @@ROWCOUNT;
END;

--EXECUTION
DECLARE @Count INT

EXEC GetMerchandiseByMember @MemberID = 102, @MerchandiseCount = @Count OUTPUT

SELECT @Count AS 'MerchandiseCount'

--stored procedure that uses the MemberDetailsView to retrieve member information based on a specified gender:
CREATE PROCEDURE GetMembersByGender
    @Gender VARCHAR(50)
AS
BEGIN
    SELECT Member_name, Member_Contact
    FROM MemberDetailsView
    WHERE Member_Gender = @Gender;
END;

EXEC GetMembersByGender @Gender = 'Female';

--This procedure retrieves merchandise sold along with the details of the purchasing members.
CREATE PROCEDURE GetMerchandiseSoldWithMembers
AS
BEGIN
    SELECT M.Merch_Color, M.Merch_Price, Me.Member_name, Me.Member_Contact
    FROM Merchandise AS M
    INNER JOIN Purchase AS P ON M.Merchandise_ID = P.Merchandise_ID
    INNER JOIN Members AS Me ON P.Member_ID = Me.Member_ID;
END;

EXEC GetMerchandiseSoldWithMembers;


--This trigger uses the INSERTED and DELETED pseudo-tables to access the old and new values for the rows affected by the UPDATE operation on the Members table. 
--It compares these values and inserts a record into MemberChanges if there's a change in the Member_name, Member_Gender, or Member_Contact fields.

CREATE TRIGGER trg_Members_Audit
ON Members
AFTER UPDATE
AS
BEGIN
    SET NOCOUNT ON;
    CREATE TABLE MemberChanges (
    Change_ID INT PRIMARY KEY IDENTITY(1,1),
    Member_ID INT,
    Old_Values NVARCHAR(MAX),
    New_Values NVARCHAR(MAX),
    Change_Date DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (Member_ID) REFERENCES Members(Member_ID)
    )
    INSERT INTO MemberChanges (Member_ID, Old_Values, New_Values)
    SELECT 
        COALESCE(i.Member_ID, d.Member_ID),
        CONCAT('Name: ', COALESCE(d.Member_name, ''), ', Gender: ', COALESCE(d.Member_Gender, ''), ', Contact: ', COALESCE(d.Member_Contact, '')),
        CONCAT('Name: ', COALESCE(i.Member_name, ''), ', Gender: ', COALESCE(i.Member_Gender, ''), ', Contact: ', COALESCE(i.Member_Contact, ''))
    FROM 
        INSERTED i
    FULL OUTER JOIN 
        DELETED d ON i.Member_ID = d.Member_ID
    WHERE 
        COALESCE(i.Member_name, i.Member_Gender, i.Member_Contact) <> COALESCE(d.Member_name, d.Member_Gender, d.Member_Contact);
END;

UPDATE Members
SET Member_Name = 'John Smith'
WHERE Member_name = 'John Doe';


Select * from MemberChanges

--This trigger uses the INSERTED and DELETED pseudo-tables to access the old and new values for the rows affected by the UPDATE operation on the Trainer table. 
--It compares these values and inserts a record into TrainerChanges if there's a change in the Trainer_Name, Trainer_Gender, or Trainer_Contact fields.

ALTER TRIGGER trg_Trainer_Audit
ON Trainer
AFTER UPDATE
AS
BEGIN
    SET NOCOUNT ON;
    CREATE TABLE TrainerChanges (
    Change_ID INT PRIMARY KEY IDENTITY(1,1),
    Trainer_ID INT,
    Old_Values NVARCHAR(MAX),
    New_Values NVARCHAR(MAX),
    Change_Date DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (Trainer_ID) REFERENCES Trainer(Trainer_ID)
    )
    INSERT INTO TrainerChanges (Trainer_ID, Old_Values, New_Values)
    SELECT 
        COALESCE(i.Trainer_ID, d.Trainer_ID),
        CONCAT('Name: ', COALESCE(d.Trainer_Name, ''), ', Gender: ', COALESCE(d.Trainer_Gender, ''), ', Contact: ', COALESCE(d.Trainer_Contact, '')),
        CONCAT('Name: ', COALESCE(i.Trainer_Name, ''), ', Gender: ', COALESCE(i.Trainer_Gender, ''), ', Contact: ', COALESCE(i.Trainer_Contact, ''))
    FROM 
        INSERTED i
    FULL OUTER JOIN 
        DELETED d ON i.Trainer_ID = d.Trainer_ID
    WHERE 
        COALESCE(i.Trainer_Name, i.Trainer_Gender, i.Trainer_Contact) <> COALESCE(d.Trainer_Name, d.Trainer_Gender, d.Trainer_Contact);
END;

UPDATE Trainer
SET Trainer_Name = 'Belagali'
WHERE Trainer_name = 'Govind';

SELECT * FROM TrainerChanges

--Create a user-defined function CalculateBMI to compute the BMI based on weight and height:
CREATE FUNCTION CalculateBMI
(
    @Weight INT,
    @Height INT
)
RETURNS DECIMAL(5, 2)
AS
BEGIN
    DECLARE @BMI DECIMAL(5, 2)
    SET @BMI = (@Weight / (CONVERT(DECIMAL(10, 2), @Height) / 100) / (CONVERT(DECIMAL(10, 2), @Height) / 100))
    RETURN @BMI
END;

--adds a computed column BMI to the Members table based on the CalculateBMI UDF using the Member_weight and Member_height columns:
ALTER TABLE Members
ADD BMI AS dbo.CalculateBMI(Member_weight, Member_height);

Select * from Members

--the user-defined function CalculateAge to determine the age based on the birthdate:
CREATE FUNCTION CalculateAge
(
    @Birthdate DATE
)
RETURNS INT
AS
BEGIN
    DECLARE @Age INT
    SET @Age = DATEDIFF(YEAR, @Birthdate, GETDATE()) - CASE WHEN DATEADD(YEAR, DATEDIFF(YEAR, @Birthdate, GETDATE()), @Birthdate) > GETDATE() THEN 1 ELSE 0 END
    RETURN @Age
END;

SELECT * FROM Members

--adds a computed column Age to the Members table, which calculates the age using the CalculateAge UDF based on the Member_birthday column.
ALTER TABLE Members
ADD Age AS dbo.CalculateAge(Member_birthday);

--a user-defined function CalculateRemainingDays to calculate the remaining days until renewal:
CREATE FUNCTION CalculateRemainingDays
(
    @RenewalDate DATE
)
RETURNS INT
AS
BEGIN
    DECLARE @RemainingDays INT
    SET @RemainingDays = ABS(DATEDIFF(DAY, GETDATE(), @RenewalDate))
    RETURN @RemainingDays
END;

ALTER TABLE Subscriptions
ADD RemainingDaysUntilRenewal AS dbo.CalculateRemainingDays(Sub_Renewal);

Select * from Subscriptions

--a user-defined function CalculateTotalSales to calculate total sales of merchandise
CREATE FUNCTION CalculateTotalSales()
RETURNS DECIMAL(18, 2)
AS
BEGIN
    DECLARE @TotalSales DECIMAL(18, 2);

    SELECT @TotalSales = SUM(Merch_Price * Merch_Sold)
    FROM Merchandise;

    RETURN @TotalSales;
END;

--Execution of the function
SELECT dbo.CalculateTotalSales() AS TotalSalesRevenue;


--a user-defined function GetMemberAgeCategory to get Member Age category based on their Birth date
CREATE FUNCTION GetMemberAgeCategory(@Member_ID INT)
RETURNS VARCHAR(50)
AS
BEGIN
    DECLARE @AgeCategory VARCHAR(50);
    DECLARE @Age INT;

    SELECT @Age = DATEDIFF(YEAR, Member_birthday, GETDATE()) - CASE 
        WHEN DATEADD(YEAR, DATEDIFF(YEAR, Member_birthday, GETDATE()), Member_birthday) > GETDATE() THEN 1 
        ELSE 0 
    END
    FROM Members
    WHERE Member_ID = @Member_ID;

    IF @Age < 18
        SET @AgeCategory = 'Youth'
    ELSE IF @Age >= 18 AND @Age < 60
        SET @AgeCategory = 'Adult'
    ELSE
        SET @AgeCategory = 'Senior'

    RETURN @AgeCategory;
END;

--Execution of the udf
 SELECT dbo.GetMemberAgeCategory(100) as AgeCategory

--This query returns the names of members who have subscribed to the 'Premium' plan
SELECT Member_name
FROM Members AS M
WHERE EXISTS (
    SELECT *
    FROM Subscribes AS SB
    INNER JOIN Subscriptions AS S ON SB.Subscription_ID = S.Subscription_ID
    WHERE SB.Member_ID = M.Member_ID
    AND S.Sub_Plan = 'Premium'
);

Select * From Members
Select * from Subscriptions
Select * from Subscribes



--This query calculates the average age of members using a derived table that computes the age based on their birth dates.
SELECT AVG(Age) AS Average_Age
FROM (
    SELECT DATEDIFF(YEAR, Member_birthday, GETDATE()) AS Age
    FROM Members
) AS AgeDetails;

--This query uses the Subscribes table to count the number of subscriptions each member has by joining Members with Subscribes on the Member_ID field
SELECT Member_name,
       (SELECT COUNT(*)
        FROM Subscribes
        WHERE Subscribes.Member_ID = Members.Member_ID) AS Subscription_Count
FROM Members;

--To check the output added one more subscription to the Subscribes table for John Smith
INSERT INTO Subscribes (Member_ID, Subscription_ID, Sub_Date)
VALUES
(100, 2, '2023-10-01');
