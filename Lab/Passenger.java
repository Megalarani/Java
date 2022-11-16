//NAME : MEGALA S
//BATCH CODE : 2576
//Create Passengers Details using setter and getter methods and store the details in collections , .......
//To add new Passenger Details,Delete and Print Passenger Details.....  and also if bookid available print otherwise to raise user defined exception......

import java.lang.*;
import java.util.*;
class InvalidUserIdException extends Exception
{
public void InvalidUserIdException()
{
}
}
class PassengerDetails
{
private int bookid;
private int passengerid;
private String pname;
private int age;
private String booking_status;
public void setBookid(int bid)
{
bookid=bid;
}
public void setPassengerid(int pid)
{
passengerid=pid;
}
public void setPname(String p)
{
pname=p;
}
public void setAge(int a)
{
age=a;
}
public void setBooking_status(String bstatus)
{
booking_status=bstatus;
}
public int getBookid()
{
return bookid;
}
public int getPassengerid()
{
return passengerid;
}
public String getPname()
{
return pname;
}
public int getAge()
{
return age;
}
public String getBooking_status()
{
return booking_status;
}
public String toString()
{
return bookid+" "+passengerid+" "+pname+" "+age+" "+booking_status;
}
public void check(int id)throws InvalidUserIdException
{
if(id!=bookid)
throw new InvalidUserIdException();
else
System.out.println("Valid");
}
}
class Passenger
{
public static void main(String[] args)
{
PassengerDetails pass =new PassengerDetails();
pass.setBookid(301);
pass.setPassengerid(1001);
pass.setPname("Gowthami");
pass.setAge(25);
pass.setBooking_status("confirmed");
System.out.println("Passenger Details............");
System.out.println("Book Id : "+pass.getBookid());
System.out.println("Passenger Id : "+pass.getPassengerid());
System.out.println("Passenger Name : "+pass.getPname());
System.out.println("Age : "+pass.getAge());
System.out.println("Booking Status : "+pass.getBooking_status());
System.out.println();
ArrayList<PassengerDetails> pass1 =new ArrayList<PassengerDetails>();
pass1.add(pass);
for(PassengerDetails pd:pass1)
{
System.out.println(pd);
}
ArrayList<PassengerDetails> pass2 =new ArrayList<PassengerDetails>();
pass.setBookid(302);
pass.setPassengerid(1002);
pass.setPname("Sowmiya");
pass.setAge(29);
pass.setBooking_status("confirmed");
pass2.add(pass);
pass2.addAll(pass1);
System.out.println("Add the Passenger Details in the List");
for(PassengerDetails pd1:pass2)
{
System.out.println(pd1);
}
ArrayList<PassengerDetails> pass3 =new ArrayList<PassengerDetails>();
pass.setBookid(303);
pass.setPassengerid(1003);
pass.setPname("Gowtham");
pass.setAge(31);
pass.setBooking_status("confirmed");
pass3.addAll(pass2);
System.out.println("Add the Another Passenger Details in the List");
for(PassengerDetails pd2:pass3)
{
System.out.println(pd2);
}
for(PassengerDetails pd:pass1)
{
System.out.println(pd);
}
pass1.remove(0);
System.out.println("Delete the Passenger Details in the List");
for(PassengerDetails pd:pass1)
{
System.out.println(pd);
}
Scanner sc=new Scanner(System.in);
System.out.println("Enter Book id");
int id=sc.nextInt();
pass.check(id);
}
}

