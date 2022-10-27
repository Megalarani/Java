// NAME : MEGALA S
// BATCH CODE : 2576
// Make a program with FileReader and FileWriter classes....

import java.util.Scanner;  
class DemoScannerClass
{  
public static void main(String[] args)
{  
Scanner sc=new Scanner(System.in);  
System.out.println("Enter your rollno");  
int rollno=sc.nextInt();  
System.out.println("Enter your name");  
String name=sc.next();  
System.out.println("Enter your fee");  
double fee=sc.nextDouble();  
System.out.println("Enter your Result");  
boolean result=sc.nextBoolean();
System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee+"result:"+result);  
sc.close();  
}  
}   