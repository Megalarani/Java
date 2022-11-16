//NAME : MEGALA S
//BATCH CODE : 2576
//Create BookFlight Details using setter and getter methods and store the details in collections.......

import java.lang.*;
import java.util.*;
class BookingDetails
{
private int bookid;
private int flightid;
private String classtype;
private String date_of_journey;
private String date_of_booking;
private int number_of_adults;
private String gender;
private int ticket_fare;
private int customer_id;
public void setBookid(int bid)
{
bookid=bid;
}
public void setFlightid(int fid)
{
flightid=fid;
}
public void setClasstype(String c)
{
classtype=c;
}
public void setDate_of_journey(String DOJ)
{
date_of_journey=DOJ;
}
public void setDate_of_booking(String DOB)
{
date_of_booking=DOB;
}
public void setNumber_of_adults(int adults)
{
number_of_adults=adults;
}
public void setGender(String g)
{
gender=g;
}
public void setTicket_fare(int tfare)
{
ticket_fare=tfare;
}
public void setCustomer_id(int cid)
{
customer_id=cid;
}
public int getBookid()
{
return bookid;
}
public int getFlightid()
{
return flightid;
}
public String getClasstype()
{
return classtype;
}
public String getDate_of_journey()
{
return date_of_journey;
}
public String getDate_of_booking()
{
return date_of_booking;
}
public int getNumber_of_adults()
{
return number_of_adults;
}
public String getGender()
{
return gender;
}
public int getTicket_fare()
{
return ticket_fare;
}
public int getCustomer_id()
{
return customer_id;
}
public String toString()
{
return bookid+" "+flightid+" "+classtype+" "+date_of_journey+" "+date_of_booking+" "+number_of_adults+" "+gender+" "+ticket_fare+" "+customer_id;
}
}
class BookFlight
{
public static void main(String[] args)
{
BookingDetails book =new BookingDetails();
book.setBookid(301);
book.setFlightid(701);
book.setClasstype("Business Class");
book.setDate_of_journey("November Twenty Three");
book.setDate_of_booking("November one");
book.setNumber_of_adults(2);
book.setGender("Female");
book.setTicket_fare(7000);
book.setCustomer_id(2756);
System.out.println("Booking Details............");
System.out.println("Book Id : "+book.getBookid());
System.out.println("Flight Id : "+book.getFlightid());
System.out.println("Class Type : "+book.getClasstype());
System.out.println("Date of Journey : "+book.getDate_of_journey());
System.out.println("Date of Booking : "+book.getDate_of_booking());
System.out.println("Number of Adults : "+book.getNumber_of_adults());
System.out.println("Gender : "+book.getGender());
System.out.println("Ticket Fare : "+book.getTicket_fare());
System.out.println("Customer Id : "+book.getCustomer_id());
System.out.println();
ArrayList<BookingDetails> book1 =new ArrayList<BookingDetails>();
book1.add(book);
System.out.println("Store All details in Collection......");
ListIterator itr=book1.listIterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}

