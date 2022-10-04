// NAME : MEGALA S
// BATCH CODE : 2576
// Demo super keyword

class ABC
{
int x=10;
}
class XYZ extends ABC
{
int x=20;
void show()
{
System.out.println(super.x);
}
}
public class Super 
{
public static void main(String[] args) {
XYZ obj=new XYZ();
obj.show();
}
}
