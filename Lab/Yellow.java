//NAME : MEGALA S
//BATCH CODE : 2576
//Multiple inheritance

interface Red
{
void show();
}
interface Green
{
void show1();
}
class Yellow implements Red,Green
{
public void show()
{
System.out.println("The Colour is Red");
}
public void show1()
{
System.out.println("The Colour is Green");
}
public static void main(String[] args)
{
Yellow y=new Yellow();
y.show();
y.show1();
}
}

