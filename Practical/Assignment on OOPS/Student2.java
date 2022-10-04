// NAME : MEGALA S
// BATCH CODE : 2576
// Student details using methods

class Student2
{
int sid;
String sname;
int marks;
void input()
{
sid=101;
sname="Ravi";
marks=463;
}
void output()
{
System.out.println("Student Id : "+sid);
System.out.println("Student Name : "+sname);
System.out.println("Student Mark : "+marks);
}
public static void main(String[] args)
{
Student2 s=new Student2();
s.input();
s.output();
}
}