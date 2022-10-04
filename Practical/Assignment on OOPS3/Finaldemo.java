// NAME : MEGALA S
// BATCH CODE : 2576
// Demo final class with final method

final class Birds//final class
{
final void eat()//final method
{
System.out.println("Birds are eating");
}
}
class Parrot extends Birds
{
void eat()
{
System.out.println("Parrot is eating");
}
}
public class Finaldemo {
public static void main(String[] args) 
{
Parrot p=new Parrot();
p.eat();
}
}