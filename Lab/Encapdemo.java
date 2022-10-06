// NAME : MEGALA S
// BATCH CODE : 2576
//Encapsulation

class Course
{
private int cid;
private String cname;
public void setCid(int cid)//setter
{
this.cid=cid;
}
public void setCname(String y)//setter
{
cname=y;
}
public int getCid()//getter
{
return cid;
}
public String getCname()//getter
{
return cname;
}
}
public class Encapdemo 
{
public static void main(String[] args) 
{
Course co=new Course();		
co.setCid(2576);
co.setCname("Java");
System.out.println(co.getCid());
System.out.println(co.getCname());
}
}