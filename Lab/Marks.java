//NAME : MEGALA S
//BATCH CODE 2576
//calculate total,average,result

import java.util.Scanner;
class Marks
{
public static void main(String[] args)
{
int avg=0;
int total=0;
int[] marks=new int[5];
System.out.println("Enter Student Marks");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=4;i++)
{
marks[i]=sc.nextInt();
total=total+marks[i];
avg=(total/5);
}
System.out.println("Total is"+ total);
System.out.println("Average is"+avg);
System.out.println("Result is");
for(int i=0;i<=4;i++)
{
if(marks[i]>=40 )
{
System.out.println("pass");
}
else
{
System.out.println("fail");
}
}
}
}