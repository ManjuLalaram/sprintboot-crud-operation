use defaultdb;

create table Employee(
 id int primary key,
 name varchar(30),
 contact_no varchar(10),
 doj date
);

select * from employee;

insert into employee values(107, 'Mahesh', '7224040887', '2023-12-24');