// NAME : MEGALA S
// BATCH CODE : 2576
// Make a program with FileReader and FileWriter classes....

import java.io.*;
public class FileReaderWriter
{
public static void main(String[] args)
{
try
{
FileWriter fw = new FileWriter("E:\\Megala\\Java\\Assignment on Files\\text.txt");
fw.write("Java FileWriter class is used to write character-oriented data to a file. It is character-oriented class which is used for file handling in java. Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.");
fw.close();
FileReader fr = new FileReader("E:\\Megala\\Java\\Assignment on Files\\text.txt");
int i;
while((i=fr.read())!=-1)
{
System.out.print((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}