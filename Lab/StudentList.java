// NAME : MEGALA S
// BATCH CODE : 2576
// Student details print forward and backward using ListIterator methods....

import java.io.*; 
import java.util.*; 
class Student
{
private int roll;
private String name;
private int marks;
public void setRoll(int roll)
{
this.roll = roll;
}
public int getRoll()
{
return roll;
}
public void setName(String name)
{
this.name = name;
}
public String getName()
{
return name;
}
public void setMarks(int marks)
{
this.marks = marks;
}
public int getMarks()
{
return marks;
}
}
public class StudentList
{
public static void main(String[] args)
{
List li= new ArrayList();
Student st1= new Student();
st1.setRoll(101);
st1.setName("Amar");
st1.setMarks(56);
Student st2= new Student();
st2.setRoll(103);
st2.setName("Murali");
st2.setMarks(66);
Student st3= new Student();
st3.setRoll(103);
st3.setName("Ashok");
st3.setMarks(76);
li.add(st1);
li.add(st2);
li.add(st3);
ListIterator listItr =(ListIterator)li.listIterator();
while(listItr.hasNext())
{
Student stud =(Student)listItr.next();
System.out.print(" "+stud.getRoll());
System.out.print(" "+stud.getName());
System.out.println(" "+stud.getMarks());
}
while(listItr.hasPrevious())
{
Student stud =(Student)listItr.previous();
System.out.print(" "+stud.getRoll());
System.out.print(" "+stud.getName());
System.out.println(" "+stud.getMarks());
}
}
}