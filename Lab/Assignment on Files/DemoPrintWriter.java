// NAME : MEGALA S
// BATCH CODE : 2576
// Demo printWriter class and store data .....

import java.io.*;
class DemoPrintWriter
{
public static void main(String[] args) 
{
String data = "The PrintWriter class of the java.io package can be used to write output data in a commonly readable form (text).";
try 
{
PrintWriter output = new PrintWriter("text1.txt");
output.print(data);
output.close();
}
catch(Exception e) 
{
e.getStackTrace();    
}
}
}