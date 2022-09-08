//NAME: S.MEGALA
//BATCH NUMBER: 2576
//student details using Scanner class
import java.util.Scanner;
class Student
{
public static void main(String[] args)
{
int student_id;
String student_name;
double att;
System.out.println("Enter Student Deails\n");
Scanner sc=new Scanner(System.in);
student_id=sc.nextInt();
student_name=sc.next();
att=sc.nextDouble();
System.out.println(student_id+" "+student_name+"  "+att);
}
}