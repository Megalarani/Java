// NAME : MEGALA S
// BATCH CODE : 2576
// console class with password method...

import java.io.*;  
class DemoConsole
{  
public static void main(String args[]){  
Console c=System.console();  
System.out.println("Enter your name: ");  
String n=c.readLine();  
System.out.println("Welcome "+n); 
System.out.println("Enter password: ");  
char[] ch=c.readPassword();  
String pass=String.valueOf(ch);
System.out.println("Password is: "+pass);  
}  
}   