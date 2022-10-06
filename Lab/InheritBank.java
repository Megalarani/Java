// NAME : MEGALA S
// BATCH CODE : 2576
// Demo Method Overriding 

class Bank
{
int interest()
{
return 0;
}
}
class Sbi extends Bank
{
int interest()
{
return 7;
}
}
class Axis extends Bank
{
int interest()
{
return 8;
}
}
class Icici
{
int interest()
{
return 9;
}
}
public class InheritBank
{
public static void main(String[] args)
{
Sbi s=new Sbi();
Axis a=new Axis();
Icici i=new Icici();
System.out.println("Interest of SBI: "+s.interest());
System.out.println("Interest of AXIS: "+a.interest());
System.out.println("Interest of ICICI: "+i.interest());
}
}