//NAME:S.MEGALA
//BATCH NUMBER: 2576
//Types of Variables: Static Variables,Local Variables,Instance Variables
class Variables
{
static int x1=2;//staticvariable
int x=20;//instance variable
void method1()
{
int a=10;//local variable
int b=a+x;
System.out.println("a:"+a);
System.out.println("b:"+b);
}
public static void main (String[] args)
{
Variables var=new Variables();
var.method1();
System.out.println(var.x);
System.out.println("x1:"+x1);
}
}