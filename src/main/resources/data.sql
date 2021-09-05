create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10001, 'Abhishek Kumar', 'Patna', sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10002, 'Priti Dubey', 'Hyderabad', sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10003, 'Amit Kumar', 'Ranchi', sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10004, 'Ravindra Nath Tewari', 'Bangalore', sysdate());
INSERT INTO person (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10005, 'Puja Dubey', 'Delhi', sysdate());


create table User (
	id integer not null,
	firstName varchar(255),
	lastName varchar(255),
	dateofbirth date,
	country varchar(255),
	profileBioMessage varchar(255),
	memberSinceDate date
);

INSERT INTO User (ID, FIRSTNAME, LASTNAME, DATEOFBIRTH, COUNTRY, PROFILEBIOMESSAGE, MEMBERSINCEDATE)
VALUES (1001, 'Abhishek', 'Kumar', sysdate(), 'INDIA', 'Hello, I am Abhishek', sysdate());
INSERT INTO User (ID, FIRSTNAME, LASTNAME, DATEOFBIRTH, COUNTRY, PROFILEBIOMESSAGE, MEMBERSINCEDATE)
VALUES (1002, 'Amit', 'Kumar', '1988-01-05', 'USA', 'Hello, I am Amit', sysdate());
INSERT INTO User (ID, FIRSTNAME, LASTNAME, DATEOFBIRTH, COUNTRY, PROFILEBIOMESSAGE, MEMBERSINCEDATE)
VALUES (1003, 'Priti', 'Dubey', sysdate(), 'CANADA', 'Hello, I am Priti', sysdate());