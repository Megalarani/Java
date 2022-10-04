//NAME : MEGALA S
//BATCH CODE 2576
//Demo Function using Arrays

class FunctionArray
{
int xyz(int[] x,int n)
{
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+x[i];
}
return sum;
}
public static void main(String[] args)
{
FunctionArray fr=new FunctionArray();
int[] a=new int[4];
a[0]=25;
a[1]=26;
a[2]=27;
a[3]=38;
int result=fr.xyz(a,4);
System.out.println("Sum is "+result);
}
}