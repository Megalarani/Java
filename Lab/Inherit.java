// NAME : MEGALA S
// BATCH CODE : 2576
// Demo Inheritance 

class Person
{
int pid =1001;
String pname="Suresh";
void show()
{
System.out.println("Person Id: "+pid);
System.out.println("Person Name: "+pname);
}
}
class Student extends Person
{
int marks=463;
void show1()
{
System.out.println("Student Marks:"+marks);
}
}
class Emp extends Person
{
long salary=40000;
void show2()
{
System.out.println("Employee Salary: "+salary);
}
}
public class Inherit
{
public static void main(String[] args)
{
Student s=new Student();
Emp e=new Emp();
s.show();
s.show1();
e.show();
e.show2();
}
}