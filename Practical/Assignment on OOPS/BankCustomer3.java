// NAME : MEGALA S
// BATCH CODE : 2576
//Bank customer details using Constructor Overloading..

class BankCustomer3
{
String acno;
String atype;
long amt;
BankCustomer3(String n,String t)
{
acno=n;
atype=t;
}
BankCustomer3(String n,String t,long a)
{
acno=n;
atype=t;
amt=a;
}
void show()
{
System.out.println(acno+" "+atype+" "+amt);
}
public static void main(String[] args)
{
BankCustomer3 bc1=new BankCustomer3("123456SA7890","Savings Account");
BankCustomer3 bc2=new BankCustomer3("098765CA4321","Current Account",50000);
bc1.show();
bc2.show();
}
}