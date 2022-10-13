// NAME : MEGALA S
// BATCH CODE : 2576
// Demo String Manipulation a)== b)equals() c)concat() d)replace() e)split() f)charAt() g)compareTo() h)substring()

class StringMethods
{
public static void main(String[] args)
{
String s1="Good Morning Everyone";
String s2="All the Best";
System.out.println(s1==s2);//==
System.out.println(s1.equals(s2));//equals method
System.out.println(s1.concat(s2));//concat method
System.out.println(s1.replace('o','a'));//replace method
System.out.println(s1.charAt(2));//charAt method
System.out.println(s2.compareTo(s1));//compareTo method
System.out.println(s2.substring(7));//substring method
}
}