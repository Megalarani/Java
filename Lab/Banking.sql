create database Banking;
use Banking;
create table BankMaster(Acno int,Cname varchar(20) not null,City varchar(40) default 'hyd',Balance int not null,Branchcode int, primary key(Acno), check(balance>=500), foreign key(Branchcode)references Branchs(Branchcode));
create table Branchs(Branchcode int primary key,location varchar(10) not null);
create table BankTransactions(Acno int,Ttype char(1),Tdate datetime not null,Amt int);
desc BankMaster;
desc BankTransactions;
desc Branchs;
insert into Branchs values(1102,'Srinagar');
insert into Branchs values(1103,'Tambaram');
insert into Branchs values(1106,'velachery'),(1108,'Ashoknagar'), (1110,'Karapakkam');
select *from Branchs;
insert into BankTransactions values(1237,'w',02/11/2022,10000),(1234,'d',01/11/2022,20000),(1233,'w',03/11/2022,30000),(1232,'d',02/11/2022,40000),(1235,'w',29/10/2022,50000);
select * from BankTransactions;
insert into BankMaster(Acno,Cname,Balance,Branchcode) values(1230,'sekar',5000,1109),(1238,'suresh',125000,1101),(1237,'Anu',80000,1102),(1236,'Swetha',75000,1105),('1239','Ramu','25000','1104');
select *from BankMaster;
select * from BankMaster where balance>=30000;
select * from BankMaster inner join Branchs on BankMaster.Branchcode=Branchs.Branchcode;
select * from BankMaster where Balance=(select Balance from BankMaster where Balance>100000);
select * from BankTransactions order by Tdate asc;
select max(Balance) from BankMaster where Balance < (select max(Balance) from BankMaster where Balance < (select max(Balance) from BankMaster));
select count(Ttype) from BankTransactions where Ttype='w';
create procedure BankMaster_details()
begin
select *from BankMaster
where Acno =1237;
end //

