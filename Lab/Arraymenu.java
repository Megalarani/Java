//NAME : MEGALA S
//BATCH CODE : 2576
//to make menu driven using 2d array.... 1)Addition 2)Subtraction 3)Transpose

import java.util.Scanner;
class Arraymenu
{
public static void main(String[] args)
{
int[][] a=new int[2][2];
int[][] b=new int[2][2];
int[][] c=new int[2][2];
System.out.println("Enter First Array");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter Second Array");
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
b[i][j]=sc.nextInt();
}
}
int ch;
System.out.println("Enter choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
  System.out.println("Result Array");
  for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
break;
case 2:
System.out.println("Result Array");
  for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
c[i][j]=a[i][j]-b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
break;
case 3:
System.out.println("Transpose first Array");
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
System.out.print(a[j][i]+" ");
}
System.out.println();
}
System.out.println("Transpose second Array");
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
System.out.print(b[j][i]+" ");
}
System.out.println();
}
break;
default :
System.out.println("Invalid");
}
}
}