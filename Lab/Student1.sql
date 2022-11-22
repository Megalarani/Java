// NAME : MEGALA S
// BATCH CODE : 2576
// Prepare Students Table with sid, sname, marks, course in sql......


use my_database;
create table student1 (sid int,sname varchar(20),marks int,course varchar(10));
insert into student1 values (1501,'arjun',87,'java'),(1502,'balu',91,'dotnet'),(1503,'chandra',79,'python'),(1504,'deva',80,'java'),(1505,'elango',92,'python'),(1506,'farina',86,'java');
select*from student1;