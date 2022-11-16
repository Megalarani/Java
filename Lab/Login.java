//NAME : MEGALA S
//BATCH CODE : 2576
//Create Login Details if user details valid enter to bookflight otherwise raise user defined exception......

import java.lang.*;
import java.util.*;
class InvalidUserException extends Exception
{
public void InvalidUserException()
{		
}
}
public class Login
{
public void validate()throws InvalidUserException
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter id:");
int id = sc.nextInt();
System.out.println("Enter password:");
int password = sc.nextInt();		
if(id!=101 || password!=2576)
throw new InvalidUserException();
else			
System.out.println("Entering Book Flight");				
}
public static void main(String[]args)throws InvalidUserException
{				
Login log=new Login();
log.validate();
}
}