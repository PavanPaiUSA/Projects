-- Inserting into Members table
INSERT INTO Members (Member_name, Member_Startdate, Member_Gender, Member_Contact, Member_weight, Member_height, Member_birthday, Member_emailid)
VALUES
('John Doe', '2023-01-01', 'Male', '123-456-7890', 75, 180, '1990-05-15', 'john@example.com'),
('Alice Smith', '2023-02-15', 'Female', '987-654-3210', 60, 165, '1995-09-20', 'alice@example.com'),
('Emma Johnson', '2023-03-20', 'Female', '222-333-4444', 55, 170, '1998-11-10', 'emma@example.com'),
('Michael Brown', '2023-04-10', 'Male', '555-666-7777', 80, 185, '1985-07-25', 'michael@example.com'),
('Sophia Garcia', '2023-05-05', 'Female', '777-888-9999', 62, 160, '1993-12-30', 'sophia@example.com'),
('William Martinez', '2023-06-12', 'Male', '333-111-2222', 68, 175, '1991-08-18', 'william@example.com'),
('Olivia Wilson', '2023-07-08', 'Female', '999-000-1111', 57, 163, '1996-04-05', 'olivia@example.com'),
('Ethan Thompson', '2023-08-25', 'Male', '444-999-6666', 70, 178, '1988-09-12', 'ethan@example.com'),
('Ava Anderson', '2023-09-14', 'Female', '666-333-1111', 58, 162, '1997-02-28', 'ava@example.com'),
('Daniel White', '2023-10-30', 'Male', '111-777-5555', 72, 181, '1992-06-22', 'daniel@example.com'),
('Sophie Davis', '2023-11-01', 'Female', '111-222-3333', 58, 166, '1994-03-12', 'sophie@example.com'),
('Liam Wilson', '2023-11-15', 'Male', '333-444-5555', 72, 178, '1990-08-25', 'liam@example.com'),
('Ella Moore', '2023-11-20', 'Female', '555-666-7777', 63, 162, '1996-01-30', 'ella@example.com'),
('Mason Lee', '2023-12-10', 'Male', '777-888-9999', 80, 185, '1988-06-20', 'mason@example.com'),
('Avery Garcia', '2023-12-25', 'Female', '999-000-1111', 55, 170, '1992-10-05', 'avery@example.com'),
('Logan Rodriguez', '2024-01-05', 'Male', '222-333-4444', 68, 176, '1995-04-15', 'logan@example.com'),
('Mia Martinez', '2024-01-20', 'Female', '444-555-6666', 60, 165, '1998-09-22', 'mia@example.com'),
('James Brown', '2024-02-10', 'Male', '666-777-8888', 75, 182, '1987-12-08', 'james@example.com'),
('Harper Thompson', '2024-02-25', 'Female', '888-999-0000', 57, 168, '1993-07-18', 'harper@example.com'),
('Benjamin Wilson', '2024-03-01', 'Male', '123-456-7890', 70, 180, '1991-11-27', 'benjamin@example.com');

-- Inserting into Exercise table
INSERT INTO Exercise (Exercise_Name, Exercise_Type, Exercise_Timeslot, Exercise_Number_Attending)
VALUES
('Yoga', 'Regular', '09:00', 15),
('Weight Training', 'Regular', '11:00', 10),
('Cardio', 'Regular', '17:30', 20),
('Zumba', 'Regular', '18:45', 12),
('Pilates', 'Customized', '10:30', 8),
('Boxing', 'Regular', '16:00', 18),
('Spin Class', 'Customized', '07:00', 10),
('CrossFit', 'Regular', '19:00', 15),
('Bootcamp', 'Regular', '06:30', 20),
('HIIT', 'Customized', '12:15', 12),
('Pilates', 'Customized', '08:00', 10),
('Swimming', 'Regular', '14:00', 15),
('Aerobics', 'Regular', '16:30', 20),
('Kickboxing', 'Regular', '18:30', 18),
('Cycling', 'Regular', '06:00', 25),
('Powerlifting', 'Regular', '10:00', 12),
('Dance Class', 'Customized', '19:45', 15),
('Martial Arts', 'Regular', '17:30', 12),
('Functional Training', 'Regular', '09:45', 20),
('Barre', 'Customized', '11:30', 12);


-- Inserting into Merchandise table
INSERT INTO Merchandise (Merch_Color, Merch_Price, Merch_Size, Merch_Style, Merch_Sold, Merch_Instock)
VALUES
('Blue', 29.99, 'M', 'T-Shirt', 50, 100),
('Black', 39.99, 'L', 'Hoodie', 30, 80),
('Red', 19.99, 'S', 'Tank Top', 65, 120),
('White', 49.99, 'XL', 'Jacket', 20, 40),
('Gray', 24.99, 'M', 'Shorts', 45, 90),
('Green', 34.99, 'L', 'Leggings', 55, 110),
('Purple', 27.99, 'S', 'Cap', 70, 150),
('Pink', 37.99, 'M', 'Sweatshirt', 25, 60),
('Orange', 22.99, 'XL', 'Hoodie', 35, 70),
('Yellow', 32.99, 'L', 'T-Shirt', 60, 130),
('Green', 19.99, 'S', 'Tank Top', 40, 80),
('Black', 29.99, 'M', 'Hoodie', 60, 100),
('Blue', 14.99, 'L', 'Shorts', 25, 50),
('Red', 44.99, 'XL', 'Jacket', 15, 30),
('Yellow', 27.99, 'M', 'Leggings', 50, 90),
('White', 34.99, 'S', 'Cap', 35, 70),
('Pink', 19.99, 'L', 'Sweatshirt', 30, 60),
('Purple', 32.99, 'XL', 'Hoodie', 20, 40),
('Gray', 22.99, 'S', 'T-Shirt', 55, 110),
('Orange', 37.99, 'M', 'Jacket', 45, 130);


-- Inserting into Trainer table
INSERT INTO Trainer (Trainer_Name, Trainer_Email, Trainer_Gender, Trainer_StartDate, Trainer_Experience, Trainer_Salary, Trainer_Contact)
VALUES
('Nitish', 'trainer1@example.com', 'Male', '2022-05-10', 5, 3000.00, '111-222-3333'),
('Belagali', 'trainer2@example.com', 'Male', '2020-10-15', 8, 3500.00, '444-555-6666'),
('Shruti', 'trainer3@example.com', 'Female', '2021-02-20', 3, 2800.00, '777-888-9999'),
('Christina', 'trainer4@example.com', 'Female', '2019-11-05', 10, 4000.00, '123-456-7890'),
('Pavan', 'trainer5@example.com', 'Male', '2020-08-30', 6, 3200.00, '987-654-3210'),
('Pranav', 'trainer6@example.com', 'Male', '2023-01-15', 2, 2600.00, '555-444-3333'),
('Jaswant', 'trainer7@example.com', 'Male', '2018-12-10', 12, 4500.00, '999-888-7777'),
('Rishabh', 'trainer8@example.com', 'Male', '2022-04-25', 4, 2900.00, '666-777-8888'),
('Ronak', 'trainer9@example.com', 'Male', '2021-07-01', 7, 3400.00, '222-333-4444'),
('Mishra', 'trainer10@example.com', 'Male', '2017-09-20', 9, 3800.00, '111-222-3333'),
('Samantha', 'samantha@example.com', 'Female', '2022-06-15', 6, 3200.00, '111-222-5555'),
('Jake', 'jake@example.com', 'Male', '2021-08-20', 4, 2800.00, '444-555-7777'),
('Emily', 'emily@example.com', 'Female', '2023-02-10', 2, 2500.00, '999-888-6666'),
('Lucas', 'lucas@example.com', 'Male', '2020-12-05', 8, 3800.00, '777-333-1111'),
('Sophie', 'sophie@example.com', 'Female', '2023-01-01', 3, 2900.00, '123-456-7890'),
('Ethan', 'ethan@example.com', 'Male', '2019-10-10', 10, 4500.00, '555-777-8888'),
('Grace', 'grace@example.com', 'Female', '2021-05-20', 5, 3100.00, '666-999-3333'),
('Owen', 'owen@example.com', 'Male', '2022-09-25', 7, 3400.00, '888-222-4444'),
('Aria', 'aria@example.com', 'Female', '2020-07-15', 9, 4000.00, '222-555-7777'),
('Nathan', 'nathan@example.com', 'Male', '2018-04-18', 12, 5000.00, '111-333-9999');


-- Inserting into Selection table
INSERT INTO Selection (Member_ID, Exercise_ID, Sel_Date)
VALUES
(100, 1, '2023-01-05'),
(101, 1, '2023-02-18'),
(102, 2, '2023-03-25'),
(103, 3, '2023-04-15'),
(104, 3, '2023-05-10'),
(105, 3, '2023-06-18'),
(106, 5, '2023-07-12'),
(107, 4, '2023-08-28'),
(108, 6, '2023-09-16'),
(109, 7, '2023-10-31'),
(110, 2, '2023-01-01'),
(111, 3, '2023-02-02'),
(112, 1, '2023-03-03'),
(113, 4, '2023-04-04'),
(114, 5, '2023-05-05'),
(115, 6, '2023-06-06'),
(116, 7, '2023-07-07'),
(117, 8, '2023-08-08'),
(118, 9, '2023-09-09'),
(119, 10, '2023-10-10');


-- Inserting into Subscriptions table
INSERT INTO Subscriptions (Sub_StartDate, Sub_DurationDays, Sub_Plan, Sub_Renewal, Sub_AccountDetails, Sub_Cancellation, No_of_Sub)
VALUES
('2023-01-01', 30, 'Basic', '2023-01-31', 'Account details 1', NULL, 50),
('2023-02-15', 60, 'Standard', '2023-04-16', 'Account details 2', NULL, 30),
('2023-03-20', 90, 'Premium', '2023-06-18', 'Account details 3', '2023-05-01', 20),
('2023-04-10', 30, 'Basic', '2023-05-10', 'Account details 4', NULL, 40),
('2023-05-05', 60, 'Standard', '2023-07-04', 'Account details 5', NULL, 25),
('2023-06-12', 90, 'Premium', '2023-09-10', 'Account details 6', NULL, 35),
('2023-07-08', 30, 'Basic', '2023-08-07', 'Account details 7', NULL, 45),
('2023-08-25', 60, 'Standard', '2023-10-24', 'Account details 8', '2023-09-01', 22),
('2023-09-14', 90, 'Premium', '2023-12-13', 'Account details 9', NULL, 28),
('2023-10-30', 30, 'Basic', '2023-11-29', 'Account details 10', NULL, 38),
('2023-01-01', 30, 'Basic', '2023-01-31', 'Account details X', NULL, 50),
('2023-02-15', 60, 'Standard', '2023-04-16', 'Account details Y', NULL, 30),
('2023-03-20', 90, 'Premium', '2023-06-18', 'Account details Z', '2023-05-01', 20),
('2023-04-10', 30, 'Basic', '2023-05-10', 'Account details A', NULL, 40),
('2023-05-05', 60, 'Standard', '2023-07-04', 'Account details B', NULL, 25),
('2023-06-12', 90, 'Premium', '2023-09-10', 'Account details C', NULL, 35),
('2023-07-08', 30, 'Basic', '2023-08-07', 'Account details D', NULL, 45),
('2023-08-25', 60, 'Standard', '2023-10-24', 'Account details E', '2023-09-01', 22),
('2023-09-14', 90, 'Premium', '2023-12-13', 'Account details F', NULL, 28),
('2023-10-30', 30, 'Basic', '2023-11-29', 'Account details G', NULL, 38);

-- Inserting into Session table
INSERT INTO Session (Exercise_ID, Trainer_ID, Subscription_ID)
VALUES
(1, 1000, 1),
(2, 1001, 2),
(3, 1002, 1),
(2, 1003, 4),
(5, 1004, 5),
(6, 1005, 6),
(7, 1006, 7),
(9, 1007, 8),
(9, 1008, 9),
(6, 1009, 10),
(4, 1010, 3),
(8, 1011, 4),
(10, 1012, 5),
(1, 1013, 6),
(3, 1014, 7),
(5, 1015, 8),
(7, 1016, 9),
(2, 1017, 10),
(9, 1018, 1),
(6, 1019, 2);



-- Inserting into Purchase table
INSERT INTO Purchase (Member_ID, Merchandise_ID, Pur_Date)
VALUES
(100, 100, '2023-01-05'),
(101, 101, '2023-02-18'),
(102, 102, '2023-03-25'),
(103, 103, '2023-04-15'),
(104, 104, '2023-05-10'),
(105, 105, '2023-06-18'),
(106, 106, '2023-07-12'),
(107, 107, '2023-08-28'),
(108, 108, '2023-09-16'),
(109, 109, '2023-10-31'),
(100, 110, '2023-01-05'),
(110, 109, '2023-02-18'),
(110, 112, '2023-03-25'),
(103, 113, '2023-04-15'),
(114, 114, '2023-05-10'),
(115, 115, '2023-06-18'),
(116, 116, '2023-07-12'),
(117, 117, '2023-08-28'),
(108, 118, '2023-09-16'),
(109, 119, '2023-10-31');


-- Inserting into Subscribes table
INSERT INTO Subscribes (Member_ID, Subscription_ID, Sub_Date)
VALUES
(100, 1, '2023-01-01'),
(101, 2, '2023-02-15'),
(102, 3, '2023-03-20'),
(103, 4, '2023-04-10'),
(104, 5, '2023-05-05'),
(105, 6, '2023-06-12'),
(106, 7, '2023-07-08'),
(107, 8, '2023-08-25'),
(108, 9, '2023-09-14'),
(109, 10, '2023-10-30'),
(101, 11, '2023-03-10'),
(112, 12, '2023-04-15'),
(113, 13, '2023-05-20'),
(104, 14, '2023-06-05'),
(105, 15, '2023-07-25'),
(116, 16, '2023-08-12'),
(117, 17, '2023-09-08'),
(118, 18, '2023-10-05'),
(119, 19, '2023-11-14'),
(110, 20, '2023-12-20');



-- Inserting into ContactInfo table
INSERT INTO ContactInfo (Trainer_ID, Member_ID, Trainer_Assigned_Date)
VALUES
(1000, 100, '2023-01-01'),
(1001, 101, '2023-02-15'),
(1002, 102, '2023-03-20'),
(1003, 103, '2023-04-10'),
(1004, 104, '2023-05-05'),
(1005, 105, '2023-06-12'),
(1006, 106, '2023-07-08'),
(1007, 107, '2023-08-25'),
(1008, 108, '2023-09-14'),
(1009, 109, '2023-10-30'),
(1010, 110, '2023-01-05'),
(1011, 111, '2023-02-18'),
(1012, 112, '2023-03-25'),
(1013, 113, '2023-04-15'),
(1014, 114, '2023-05-10'),
(1015, 115, '2023-06-18'),
(1016, 116, '2023-07-12'),
(1017, 117, '2023-08-28'),
(1018, 118, '2023-09-16'),
(1019, 119, '2023-10-31');


-- Inserting into Equipment table
INSERT INTO Equipment (Equip_Quantity, Equip_Cost, Equip_Name)
VALUES
(10, 500.00, 'Treadmill'),
(5, 1000.00, 'Elliptical Machine'),
(8, 300.00, 'Dumbbells'),
(15, 700.00, 'Exercise Ball'),
(6, 250.00, 'Resistance Bands'),
(12, 600.00, 'Stationary Bike'),
(7, 350.00, 'Jump Rope'),
(9, 400.00, 'Kettlebells'),
(4, 1200.00, 'Rowing Machine'),
(11, 450.00, 'Yoga Mat'),
(8, 550.00, 'Barbell Set'),
(6, 900.00, 'Smith Machine'),
(10, 400.00, 'Medicine Balls'),
(20, 800.00, 'Bench Press'),
(7, 300.00, 'Pull-up Bar'),
(15, 700.00, 'Battle Ropes'),
(9, 250.00, 'Plyo Box'),
(12, 550.00, 'Resistance Bands Set'),
(5, 1000.00, 'Cable Machine'),
(11, 350.00, 'Foam Roller');


-- Inserting into Usage table
INSERT INTO Usage (Member_ID, Equip_ID, Usage_Date)
VALUES
(100, 1, '2023-01-05'),
(101, 2, '2023-02-18'),
(102, 3, '2023-03-25'),
(103, 4, '2023-04-15'),
(104, 5, '2023-05-10'),
(105, 6, '2023-06-18'),
(106, 7, '2023-07-12'),
(107, 8, '2023-08-28'),
(108, 9, '2023-09-16'),
(109, 10, '2023-10-31'),
(110, 1, '2023-01-12'),
(101, 1, '2023-02-22'),
(112, 3, '2023-03-28'),
(113, 4, '2023-04-18'),
(114, 5, '2023-05-15'),
(115, 6, '2023-06-22'),
(116, 7, '2023-07-17'),
(117, 8, '2023-08-31'),
(118, 9, '2023-09-25'),
(119, 10, '2023-10-27');


-- Inserting into Performs table
INSERT INTO Performs (Member_ID, Subscription_ID, Exercise_ID)
VALUES
(100, 1, 2),
(101, 2, 2),
(102, 3, 3),
(103, 4, 1),
(104, 5, 1),
(105, 6, 4),
(106, 7, 5),
(107, 8, 5),
(108, 9, 6),
(109, 10, 8),
(110, 11, 8),
(111, 12, 6),
(112, 13, 7),
(113, 14, 3),
(114, 15, 4),
(115, 16, 9),
(116, 17, 2),
(117, 18, 1),
(118, 19, 5),
(119, 20, 10);

--Column Data Encryption of Trainer Email in the Trainer Table

CREATE MASTER KEY
ENCRYPTION BY PASSWORD = 'Password@123';
 
SELECT NAME KeyName,
symmetric_key_id KeyID,
key_length KeyLength,
algorithm_desc KeyAlgorithm
FROM sys.symmetric_keys;
go
 
CREATE CERTIFICATE TrainerEmail
WITH SUBJECT = 'Trainer Email';
GO
 
CREATE SYMMETRIC KEY TrainerEmail_SM
WITH ALGORITHM = AES_256
ENCRYPTION BY CERTIFICATE TrainerEmail;
GO
 
OPEN SYMMETRIC KEY TrainerEmail_SM
DECRYPTION BY CERTIFICATE TrainerEmail;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer1@example.com'))
where [Trainer_ID] =1000;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer2@example.com'))
where [Trainer_ID] =1001;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer3@example.com'))
where [Trainer_ID] =1002;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer4@example.com'))
where [Trainer_ID] =1003;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer5@example.com'))
where [Trainer_ID] =1004;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer6@example.com'))
where [Trainer_ID] =1005;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer7@example.com'))
where [Trainer_ID] =1006;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer8@example.com'))
where [Trainer_ID] =1007;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer9@example.com'))
where [Trainer_ID] =1008;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'trainer10@example.com'))
where [Trainer_ID] =1009;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'samantha@example.com'))
where [Trainer_ID] =1010;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'jake@example.com'))
where [Trainer_ID] =1011;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'emily@example.com'))
where [Trainer_ID] =1012;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'lucas@example.com'))
where [Trainer_ID] =1013;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'sophie@example.com'))
where [Trainer_ID] =1014;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'ethan@example.com'))
where [Trainer_ID] =1015;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'grace@example.com'))
where [Trainer_ID] =1016;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'owen@example.com'))
where [Trainer_ID] =1017;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'aria@example.com'))
where [Trainer_ID] =1018;

UPDATE Trainer
SET [Trainer_Email] = EncryptByKey(Key_GUID('TrainerEmail_SM'), CONVERT(VARBINARY, 'nathan@example.com'))
where [Trainer_ID] =1019;

SELECT * FROM Trainer



--Decrypt
OPEN SYMMETRIC KEY TrainerEmail_SM
DECRYPTION BY CERTIFICATE TrainerEmail;
SELECT *,
CONVERT(varchar, DecryptByKey([Trainer_Email]))
AS 'Decrypted Email'
FROM Trainer;
GO