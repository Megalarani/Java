//NAME : MEGALA S
//BATCH CODE : 2576
//Pattern printing in numbers

class PatternNum
{
 public static void main(String[] args)
 {
  int r=3;
  int k=1;
  for(int i=1;i<=r;i++)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print(k+" ");
    k++;
   }
   System.out.println();
  }
 }
} 