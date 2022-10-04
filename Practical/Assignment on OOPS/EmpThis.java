//NAME : MEGALA S
//BATCH CODE 2576
//Demo 'this' keyword using datamembers

class EmpThis
{
int emp_id;
String emp_name;
long salary;
EmpThis(int emp_id,String emp_name,long salary)
{
this.emp_id=emp_id;
this.emp_name=emp_name;
this.salary=salary;
}
void show()
{
System.out.println(emp_id+ " "+emp_name+"  "+salary);
}
public static void main(String[] args)
{
EmpThis e1=new EmpThis(101,"suresh",50000);
e1.show();
EmpThis e2=new EmpThis(102,"mano",6000);
e2.show();
}
}