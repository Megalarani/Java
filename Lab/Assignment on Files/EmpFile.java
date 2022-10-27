// NAME : MEGALA S
// BATCH CODE : 2576
// create and store employee details using file handling...

import java.io.*;  
public class EmpFile 
{  
public static void main(String args[])
{    
try
{    
FileInputStream fin=new FileInputStream("E:\\Megala\\Java\\Assignment on Files\\emp.txt");    
int i=0;    
while((i=fin.read())!=-1)
{    
System.out.print((char)i);    
}    
fin.close();    
}
catch(Exception e)
{
System.out.println(e);
}    
}    
}  