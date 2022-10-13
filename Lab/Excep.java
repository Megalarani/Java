// NAME : MEGALA S
// BATCH CODE : 2576
// Demo NullPointerException and ArrayIndexOutOfBoundException with Nested try blocks
class Excep
{ 
public static void main(String args[])
{ 
 try
{ 
 try
{ 
 String s1=null;
 System.out.println(s1.length());
 }
catch(NullPointerException e)
{
System.out.println(e);
} 
 
 try
{ 
 int a[] = new int[3]; 
 a[3] = 4; 
 }
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
} 
}
catch(Exception e)
{
System.out.println(e);
}
 System.out.println("normal flow.."); 
} 
}