//NAME : MEGALA S
//BATCH CODE 2576
//calculate Total,Average for 3subjects in 5 Students using array..

import java.io.*;
import java.util.*;
class Student
{
Scanner sc=new Scanner(System.in);
int Total=0,subjects;
int avg=0;
String name;
int marks[];
Student()
{
System.out.print("Enter Student Name: ");
name=sc.next();;
subMarks();
}
public void subMarks()
{
marks=new int[3];
System.out.print("Enter Physics Mark: ");
marks[0]=sc.nextInt();
System.out.print("Enter Chemistry Mark: ");
marks[1]=sc.nextInt();
System.out.print("Enter Maths Mark: ");
marks[2]=sc.nextInt();
for(int i=0;i<3;i++)
{
Total+=marks[i];
avg=(Total/3);
}
System.out.println("Total: " +Total);
System.out.println("Average: " +avg);
}
}
class Marks
{
public static void main(String[] args)
{
Student s[]=new Student[5];
for(int i=0;i<5;i++)
s[i]=new Student();
}
}