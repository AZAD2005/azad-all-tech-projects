	show databases;
	CREATE DATABASE testDB;
	use testDB;



	CREATE TABLE Persons (
	  PersonID int PRIMARY KEY,
	  LastName varchar(255) NOT NULL,
	  FirstName varchar(255),
	  Address varchar(255),
	  City varchar(255)
	);


	INSERT INTO Persons VALUES (4, 'hamdi', 'SK','MVG','AP');


	select  * from Persons;

	select * from Persons where lastname = 'hamdi' and personid=4;




	# CRUD/ CURD --> Create(insert), update(update), read(select), delete(delete)


