//NAME : MEGALA S
//BATCH CODE : 2576
//Pattern printing in numbers

class PatternNum
{
 public static void main(String[] args)
 {
  int r=10;
  for(int i=1;i<r+1;i++)
  {
   for(int j=i;j<r+1;j++)
   {
    System.out.print(j+" ");
   }
   for(int k=1;k<i;k++)
   {
    Sytem.out.println(k+" ");
   }
   System.out.println();
  }
 }
} 