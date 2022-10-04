//NAME : MEGALA S
//BATCH CODE : 2576
//Display the even numbers between x & y

import java.util.Scanner;
class Even
{
public static void main(String[] args)
{
int x,y;
System.out.println("Enter x");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
System.out.println("Enter Y");
y=sc.nextInt();
System.out.println("Even Numbers between x and y are:");
while(x<y)
{
System.out.print(x+" ");
x+=2;
}
}
}