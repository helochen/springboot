DROP TABLE IF exists userInfo;
create table userInfo (
	id varchar(10) primary key,
    name varchar(20) default null,
    age int 
);

insert into userinfo (id , name , age) values ('1'  , 'chen', 20);
insert into userinfo (id , name , age) values ('2'  , 'tt', 20);
insert into userinfo (id , name , age) values ('3'  , 'xx', 20);

drop table if exists user;
create table user (
	id varchar(10) primary key,
    address varchar(100) default null,
    office varchar(100) 
);

insert into user (id , address , office) values ('1' , 'add1' , 'off1');
insert into user (id , address , office) values ('2' , 'add2' , 'off2');
insert into user (id , address , office) values ('3' , 'ad3' , 'off3');

set global time_zone='+8:00';