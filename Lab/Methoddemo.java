// NAME : MEGALA S
// BATCH CODE : 2576
// Create one class with connstructor ,Named method,Anonymous,Static method..

class JavaStudent
{
int id;
String name;
static String institute;
static void m1()
{
institute="ANUDIP";
}
JavaStudent(int i,String n)
{
id=i;
name=n;
}
void show()
{
System.out.println(id+" "+name+" "+institute);
}
}
public class Methoddemo
{
public static void main(String[] args)
{
JavaStudent.m1();
JavaStudent js1=new JavaStudent(1001,"Ravi");
JavaStudent js2=new JavaStudent(1002,"Meena");
JavaStudent js3=new JavaStudent(1003,"Kaviya");
JavaStudent js4=new JavaStudent(1004,"Ramesh");
js1.show();
js2.show();
js3.show();
js4.show();
}
}