//NAME : MEGALA S
//BATCH CODE : 2576
//Demo 2d array multiplication

import java.util.Scanner;
class MultiArray
{
public static void main(String args[])
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
System.out.println("Result Array");
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
c[i][j]=0;
for(int k=0;k<=1;k++)
c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}