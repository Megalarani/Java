//NAME : MEGALA S
//BATCH CODE : 2576
//'this' keyword constructor chaining

class Abc
{
Abc()
{
System.out.println("this Keyword Constructor Chaining demo");
}
Abc(int x)
{
this();
System.out.println("x="+x);
}
}
class Cntrchain
{
public static void main(String[] args)
{
Abc a=new Abc(2576);
}
}
