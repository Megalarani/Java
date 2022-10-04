//NAME : MEGALA S
//BATCH CODE 2576
//Demo factorial of given number using return type function 

class Factorial
{
int fact(int n)
{
if(n==1)
return 1;
else
return n*fact(n-1);
}
public static void main(String[] args)
{
Factorial f=new Factorial();
int t=f.fact(5);
System.out.println("Factorial of 5 is "+t);
}
}