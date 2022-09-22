//NAME : MEGALA S
//BATCH CODE : 2576
// Calculate sum of two numbers if my input char is 'y' to continue again otherwise stop process

import java.util.Scanner;
class Sum1 
{ 
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
char choice;
do {
int a,b,sum;
System.out.println("Enter a and b Values");
a=sc.nextInt();
b=sc.nextInt();
sum=a+b;
System.out.println("Sum of two numbers"+sum);
System.out.println("Do You Want To Continue(Y/N)");
choice = sc.next().charAt(0);    
} while(choice == 'Y'|| choice == 'y');
}
}