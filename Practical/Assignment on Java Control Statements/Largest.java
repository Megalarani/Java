//NAME : MEGALA S
//BATCH CODE : 2576
//Find Largest of 3 Numbers

import java.util.Scanner;
class Largest
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter Three Values");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
System.out.println(a+"is Largest Number");
else if(b>a && b>c)
System.out.println(b+"is Largest Number");
else if(c>a && c>b)
System.out.println(c+"is Largest Number");
else
System.out.println("All are Equals");
}
}
