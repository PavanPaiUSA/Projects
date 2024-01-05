CREATE DATABASE GymManagement;
USE GymManagement;

CREATE TABLE Members (
    Member_ID INT NOT NULL PRIMARY KEY IDENTITY(100,1),
    Member_name VARCHAR(255) NOT NULL,
    Member_Startdate DATE NOT NULL,
    Member_Gender VARCHAR(50) NOT NULL,
    Member_Contact VARCHAR(255) NOT NULL,
    Member_weight INT NOT NULL,
    Member_height INT NOT NULL,
    Member_birthday DATE NOT NULL,
    Member_emailid VARCHAR(255) NOT NULL,
    CONSTRAINT CK_Member_Gender CHECK (Member_Gender IN('Male','Female','Others'))
);


CREATE TABLE Exercise (
    Exercise_ID INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    Exercise_Name VARCHAR(255) NOT NULL,
    Exercise_Type VARCHAR(50) NOT NULL,
    Exercise_Timeslot TIME NOT NULL,
    Exercise_Number_Attending INT NOT NULL,
    CONSTRAINT CK_Exercise_Type CHECK (Exercise_Type IN('Regular','Customized'))
);

CREATE TABLE Merchandise (
    Merchandise_ID INT NOT NULL PRIMARY KEY IDENTITY(100,1),
    Merch_Color VARCHAR(50) NOT NULL,
    Merch_Price DECIMAL(10, 2) NOT NULL,
    Merch_Size VARCHAR(50) NOT NULL,
    Merch_Style VARCHAR(50) NOT NULL,
    Merch_Sold INT NOT NULL,
    Merch_Instock INT NOT NULL,
    CONSTRAINT CK_Merch_Size CHECK (Merch_Size IN('S','M','L','XL'))
);

CREATE TABLE Trainer (
    Trainer_ID INT PRIMARY KEY NOT NULL IDENTITY(1000,1),
    Trainer_Name VARCHAR(255) NOT NULL,
    Trainer_Email VARCHAR(255) NOT NULL,
    Trainer_Gender VARCHAR(50) NOT NULL ,
    Trainer_StartDate DATE NOT NULL,
    Trainer_Experience INT NOT NULL,
    Trainer_Salary DECIMAL(10, 2) NOT NULL,
    Trainer_Contact VARCHAR(255) NOT NULL,
    CONSTRAINT CK_Trainer_Gender CHECK (Trainer_Gender IN ('Male', 'Female', 'Other'))
);

CREATE TABLE Selection (
    Selection_ID INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    Member_ID INT NOT NULL,
    Exercise_ID INT NOT NULL,
    Sel_Date DATE,
    FOREIGN KEY (Member_ID) REFERENCES Members(Member_ID),
    FOREIGN KEY (Exercise_ID) REFERENCES Exercise(Exercise_ID)
);

CREATE TABLE Subscriptions (
    Subscription_ID INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    Sub_StartDate DATE NOT NULL,
    Sub_DurationDays INT NOT NULL,
    Sub_Plan VARCHAR(255) NOT NULL,
    Sub_Renewal DATE,
    Sub_AccountDetails TEXT NOT NULL,
    Sub_Cancellation DATE,
    No_of_Sub INT NOT NULL,
    CONSTRAINT CK_Sub_Plan CHECK (Sub_Plan IN ('Basic', 'Standard', 'Premium'))
);

CREATE TABLE Session (
    Session_ID INT PRIMARY KEY IDENTITY(1000,1),
    Exercise_ID INT NOT NULL,
    Trainer_ID INT NOT NULL,
    Subscription_ID INT NOT NULL,
    FOREIGN KEY (Exercise_ID) REFERENCES Exercise(Exercise_ID),
    FOREIGN KEY (Trainer_ID) REFERENCES Trainer(Trainer_ID),
    FOREIGN KEY (Subscription_ID) REFERENCES Subscriptions(Subscription_ID)
);

CREATE TABLE Purchase (
    Purchase_ID INT NOT NULL PRIMARY KEY IDENTITY(100,1),
    Member_ID INT NOT NULL,
    Merchandise_ID INT NOT NULL,
    Pur_Date DATE NOT NULL,
    FOREIGN KEY (Member_ID) REFERENCES Members(Member_ID),
    FOREIGN KEY (Merchandise_ID) REFERENCES Merchandise(Merchandise_ID)
);

CREATE TABLE Subscribes (
    Member_ID INT NOT NULL,
    Subscription_ID INT NOT NULL,
    Sub_Date DATE NOT NULL,
    CONSTRAINT PK_Subscribes PRIMARY KEY(Member_ID,Subscription_ID,Sub_Date),
    FOREIGN KEY (Member_ID) REFERENCES Members(Member_ID),
    FOREIGN KEY (Subscription_ID) REFERENCES Subscriptions(Subscription_ID)
);

CREATE TABLE ContactInfo (
    Contact_ID INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    Trainer_ID INT NOT NULL,
    Member_ID INT NOT NULL,
    Trainer_Assigned_Date DATE,
    FOREIGN KEY (Trainer_ID) REFERENCES Trainer(Trainer_ID),
    FOREIGN KEY (Member_ID) REFERENCES Members(Member_ID)
);

CREATE TABLE Equipment (
    Equip_ID INT PRIMARY KEY NOT NULL IDENTITY(1,1),
    Equip_Quantity INT NOT NULL,
    Equip_Cost DECIMAL(10, 2) NOT NULL,
    Equip_Name VARCHAR(255) NOT NULL
);

CREATE TABLE Usage (
    Member_ID INT NOT NULL,
    Equip_ID INT NOT NULL,
    Usage_Date DATE NOT NULL,
    CONSTRAINT PK_Usage PRIMARY KEY(Member_ID,Equip_ID,Usage_Date),
    FOREIGN KEY (Member_ID) REFERENCES Members(Member_ID),
    FOREIGN KEY (Equip_ID) REFERENCES Equipment(Equip_ID)
);

CREATE TABLE Performs(
    Member_ID INT NOT NULL,
    Subscription_ID INT NOT NULL,
    Exercise_ID INT NOT NULL,
    CONSTRAINT PK_Performs PRIMARY KEY(Member_ID,Subscription_ID,Exercise_ID),
    FOREIGN KEY (Member_ID) REFERENCES Members(Member_ID),
    FOREIGN KEY (Subscription_ID) REFERENCES Subscriptions(Subscription_ID),
    FOREIGN KEY (Exercise_ID) REFERENCES Exercise(Exercise_ID),
)


-- Members Table Non-Clustered Index
CREATE NONCLUSTERED INDEX IX_Members_MemberName
ON Members (Member_name);

-- Subscriptions Table Non-Clustered Index
CREATE NONCLUSTERED INDEX IX_Subscriptions_SubPlan
ON Subscriptions (Sub_Plan);

--Exercise Table Non-Clustered Index
CREATE NONCLUSTERED INDEX IX_Exercise_ExerciseType
ON Exercise (Exercise_Type);


--Member Details View
CREATE VIEW MemberDetailsView AS
SELECT Member_ID, Member_name, Member_Gender, Member_Contact
FROM Members;

--Subscription details View
CREATE VIEW SubscriptionDetailsView AS
SELECT Subscription_ID, Sub_StartDate, Sub_Plan
FROM Subscriptions;

--Session details view
CREATE VIEW SessionDetailsView AS
SELECT Session_ID, Exercise_ID, Trainer_ID, Subscription_ID
FROM Session;

--View of Active Members:
CREATE VIEW ActiveMembers AS
SELECT Member_ID, Member_name, Member_Startdate, Member_Contact
FROM Members
WHERE Member_Startdate <= GETDATE();

--View of Trainer Profiles:
CREATE VIEW TrainerProfiles AS
SELECT Trainer_ID, Trainer_Name, Trainer_Email, Trainer_Gender, Trainer_Experience
FROM Trainer;

--View of Equipment Usage:
CREATE VIEW EquipmentUsageView AS
SELECT e.Equip_Name, u.Usage_Date, m.Member_name
FROM Equipment e
JOIN Usage u ON e.Equip_ID = u.Equip_ID
JOIN Members m ON u.Member_ID = m.Member_ID;

--View of Member Subscriptions:
CREATE VIEW MemberSubscriptions AS
SELECT m.Member_name, s.Sub_StartDate, s.Sub_Plan, s.Sub_DurationDays
FROM Members m
JOIN Subscribes sb ON m.Member_ID = sb.Member_ID
JOIN Subscriptions s ON sb.Subscription_ID = s.Subscription_ID;

--View of Daily Exercise Sessions:
CREATE VIEW DailyExerciseSessions AS
SELECT e.Exercise_Name, s.Session_ID, t.Trainer_Name
FROM Exercise e
JOIN Session s ON e.Exercise_ID = s.Exercise_ID
JOIN Trainer t ON s.Trainer_ID = t.Trainer_ID;

--View of Merchandise Sales:
CREATE VIEW MerchandiseSales AS
SELECT Merch_Color, SUM(Merch_Sold) AS TotalSold, SUM(Merch_Instock) AS TotalInStock
FROM Merchandise
GROUP BY Merch_Color;

--View of Member Exercise History:
CREATE VIEW MemberExerciseHistory AS
SELECT m.Member_name, e.Exercise_Name, s.Sel_Date
FROM Members m
JOIN Selection s ON m.Member_ID = s.Member_ID
JOIN Exercise e ON s.Exercise_ID = e.Exercise_ID;


