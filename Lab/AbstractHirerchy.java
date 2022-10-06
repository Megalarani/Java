// NAME : MEGALA S
// BATCH CODE : 2576
//Abstract class Hirerchical Inheritance

abstract class Fruit
{
Fruit()
{
System.out.println("abstract ctr");
}
void colour()
{
System.out.println("non abstract method");
}
}
class Mango extends Fruit
{
void colour2()
{
System.out.println("Mango Fruit");
}
}
class Orange extends Fruit
{
void colour3()
{
System.out.println("Orange Fruit");
}
}
public class AbstractHirerchy {
public  static void main(String[] args) 
{		
Mango m=new Mango();
Orange o=new Orange();
m.colour();
m.colour2();
o.colour();
o.colour3();
}
}