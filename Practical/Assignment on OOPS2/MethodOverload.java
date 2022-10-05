// NAME : MEGALA S
// BATCH CODE : 2576
// Demo Method Overloading using Integer and Double... 

class MethodOverload
{
void swap(int a,int b)
{
int temp;
temp=a;
a=b;
b=temp;
System.out.println(a+" "+b);
}
void swap(double a,double b)
{
double temp;
temp=a;
a=b;
b=temp;
System.out.println(a+" "+b);
}
public static void main(String[] args)
{
MethodOverload m=new MethodOverload();
m.swap(20,40);
m.swap(15.56,25.988);
}
}