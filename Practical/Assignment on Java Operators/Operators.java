//NAME: S.MEGALA
//BATCH NUMBER: 2576
//Types of Operators: 

class Operators
{
int a=200;//assignment operator
int b=5;
int x=7;
int y=3;
void arith()//arithmetic operator
{
int c;
c=((a+b)-(a*b))/100;
System.out.println("Arithmetic Operators");
System.out.println("c="+c);
}

void multiassign()//multiple assignment
{
x+=2;
y*=4;
System.out.println("Multiple Assignment Operators");
System.out.println("x="+x);
System.out.println("y="+y);
}

void unary()//unary operator
{
int d;
d=a++ - --b + ++a;
System.out.println("Unary Operators");
System.out.println("d="+d);
}

void logical()//logical operator
{
boolean fstatus;
fstatus=(a>b)&&(a<=b);
System.out.println("Logical Operators");
System.out.println("Result="+fstatus);
}

void relate()//relational operator
{
boolean x1,x2,x3;
x1=(a<b);
x2=(a>b);
x3=(a!=b);
System.out.println("Relational Operators");
System.out.println(x1+" "+x2+" "+x3);
}

void tern()//ternary operator
{
int z;
z=(x>y)?x:y;
System.out.println("Ternary Operators");
System.out.println("z="+z);
}

void bitwise()//bitwise operator
{
System.out.println("Bitwise Operators");
System.out.println(x&y);
System.out.println(x|y);
System.out.println(x^y);
System.out.println(x<<y);
System.out.println(x>>y);
}

public static void main(String[] args)
{
Operators oper=new Operators();
oper.arith();
oper.multiassign();
oper.unary();
oper.logical();
oper.relate();
oper.tern();
oper.bitwise();
}
}