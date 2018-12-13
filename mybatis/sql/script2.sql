-- create database demo2;
-- use demo2;

-- set global time_zone='+8:00';
drop table if exists userdefine;
create table userdefine(
	id varchar(64) primary key,
    name varchar(10) ,
    age int 
);

insert into userdefine (id , name , age) values (uuid() ,'chen' , 20);
insert into userdefine (id , name , age) values (uuid() ,'qi' , 20);