//NAME : MEGALA S
//BATCH CODE 2576
//Demo integer,double,char arrays in single program

class Array
{
public static void main(String[] args)
{
int[] a=new int[2];
a[0]=10;
a[1]=11;
for(int i:a)
{
System.out.println("Integer Array: "+i);
}
double[] b=new double[2];
b[0]=12.5;
b[1]=13.1;
for(double j:b)
{
System.out.println("Double Array: "+j);
}
char[] c=new char[2];
c[0]='x';
c[1]='y';
for(char k:c)
{
System.out.println("Character Array: "+k);
}
}
}