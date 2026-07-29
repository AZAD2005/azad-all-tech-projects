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

desc Persons;
INSERT INTO Persons VALUES (27, 'hamdi', 'SK','MVG','TS');


select  * from Persons;

select * from Persons where lastname = 'hamdi' and personid = 4;




# CRUD/ CURD --> Create(insert), update(update), read(select), delete(delete)
select * from persons;
SELECT PERSONID, LASTNAME FROM PERSONS;
SELECT distinct ADDRESS FROM PERSONS;
select personid, lastname from persons where address = 'mvg' or city = 'ap';
select * from persons where personid between 5 and 15;
select * from persons order by personid desc;
update persons set city = 'HYD' where personid in (10,15,20,25,5);
update persons set city = 'BGR' where personid = 4;

select * from persons where personid in (10,15,20,25,5);
select * from persons order by lastname desc, city asc;












