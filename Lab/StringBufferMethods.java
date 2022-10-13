// NAME : MEGALA S
// BATCH CODE : 2576
// Demo StringBuffer and StringBuilder Classes and methods a)equals() b)reverse() c)append() d)delete() e) insert()

class StringBufferMethods
{
public static void main(String[] args)
{
StringBuffer s1=new StringBuffer("Happy Morning all");
StringBuffer s2=new StringBuffer("Welcome to Java");   
System.out.println(s1.equals(s2));//equals method
System.out.println(s2.append(s1));//append method
System.out.println(s2.delete(1,9));//delete method
System.out.println(s2.insert(12,"Class"));//insert method
System.out.println(s1.reverse());//reverse method
}
}
