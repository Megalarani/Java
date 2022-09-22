//NAME : MEGALA S
// BATCH CODE 2576
//Find maximum of array element, minimum of array element

import java.util.Scanner;
class Maxmin
{
int[] num={12,23,34,45};
void maximum()
{
int max=0;
for(int i=0;i<=3;i++)
{
if(num[i]>max)
{
max=num[i];
}
}
System.out.println("Maximum Element is " +max);
}
void minimum()
{
int min =num[0];
for(int i=0;i<=3;i++)
{
if(num[i]<min)
{
min=num[i];
}
}
System.out.println("Minimum Element is " +min);
}
public static void main(String[] args)
{
Maxmin m=new Maxmin();
m.maximum();
m.minimum();
}
}
