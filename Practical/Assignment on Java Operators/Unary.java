//NAME: S.MEGALA
//BATCH NUMBER: 2576
//Unary Expressions..

class Unary
{
public static void main(String[] args)
{
int x,y,z,m;
x=2;
y=++x;
z=x++ + ++y;
m=x++ + ++x + y++ - z--; 
System.out.println("x="+x);
System.out.println("y="+y);
System.out.println("z="+z);
System.out.println("m="+m);
}
}