// NAME : MEGALA S
// BATCH CODE : 2576
// Threading with getName() setName() methods....

class ThreadNameMethod extends Thread
{  
public void run()
{  
System.out.println("running...");  
}  
public static void main(String args[])
{  
ThreadNameMethod t1=new ThreadNameMethod();  
ThreadNameMethod t2=new ThreadNameMethod();  
System.out.println("Name of t1:"+t1.getName());  
System.out.println("Name of t2:"+t2.getName());     
t1.start();  
t2.start();    
t1.setName("Albert Einstein");  
System.out.println("After changing name of t1:"+t1.getName());  
}  
}  