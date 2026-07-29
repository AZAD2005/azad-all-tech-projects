	show databases;
	create database testdb;
	use testdb;

	CREATE TABLE Persons (
	  PersonID int PRIMARY KEY,
	  LastName varchar(255) NOT NULL,
	  FirstName varchar(255),
	  Address varchar(255),
	  City varchar(255)
	);

	INSERT INTO Persons VALUES (3, 'kamal', 'SK','BVG','AP');


	select  * from Persons;

	select * from Persons where lastname = 'hamdi' and personid=4;