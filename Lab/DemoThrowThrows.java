// NAME : MEGALA S
// BATCH CODE : 2576
// Demo Exception using throw and throws...

class InvalidLoginException extends Exception
{ 
InvalidLoginException(String s)
{ 
 super(s); 
} 
} 
class DemoThrowThrows
{ 
 static void validate(int pwd,String uname)throws InvalidLoginException
{ 
 if(pwd!=2576 || uname!="A") 
 throw new InvalidLoginException("OOPS!!! Login Unsuccessful"); 
 else 
 System.out.println("Login Successful!!!"); 
 } 
 public static void main(String args[])
{ 
 try
{ 
 validate(2575,"C"); 
 }
catch(Exception e)
{
System.out.println("Exception occured: "+e);
} 
 System.out.println("rest of the code..."); 
 } 
}