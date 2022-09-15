//NAME : MEGALA S
//BATCH CODE : 2576
//Reverse a number

class Reverse
{
public static void main(String[] args)
{
int result=0;
for(int num=9835;num!=0; num/=10)
{
int digit = num%10;
result=result*10+digit;
}
System.out.println("Reversed Number:"+result);
}
}
