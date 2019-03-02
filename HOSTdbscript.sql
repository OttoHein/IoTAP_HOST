DROP DATABASE IF EXISTS HOST;

CREATE DATABASE HOST;

USE HOST;

CREATE TABLE tblTaskDetail(
	Id int auto_increment NOT NULL,
    Address varchar(255) NOT NULL,
    LastName varchar(255) NOT NULL UNIQUE,
    Description TEXT NOT NULL,
    StartTime DATETIME NOT NULL,
    EndTime DATETIME NOT NULL,
    IsTaken BOOLEAN DEFAULT FALSE,
	IsCompleted BOOLEAN DEFAULT FALSE,
    Credits int,
    PRIMARY KEY(Id)
);

CREATE TABLE tblEmployee(
	Id int auto_increment NOT NULL,
    FirstName varchar(255) NOT NULL,
	LastName varchar(255) NOT NULL,
    ChipID varchar(255) NOT NULL UNIQUE,
    TotalCredits int,
    PRIMARY KEY(Id)
);

CREATE TABLE tblEmployer(
	Id int auto_increment NOT NULL,
    FirstName varchar(255) NOT NULL,
    LastName varchar(255) NOT NULL,
    BirthDate DATE NOT NULL,
    NationalRegistryNumber char(11) NOT NULL,
    Email varchar(255) NOT NULL,
    Password varchar(255) NOT NULL,
    TotalCredits int,
    PRIMARY KEY(Id)
);

CREATE TABLE tblTaskLink(
	TaskDetailId int not null,
    EmployerId int not null,
    EmployeeId int,
	foreign key (TaskDetailId) references tblTaskDetail(Id),
    foreign key (EmployerId) references tblEmployer(Id),
    foreign key (EmployeeId) references tblEmployee(Id)
);

CREATE TABLE tblSponsor(
	Id int not null,
	Name varchar(255) NOT NULL,
    LogoLocation varchar(255) NOT NULL,
    KboNr VARCHAR(12),
    PRIMARY KEY(Id)
);
