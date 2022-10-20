// NAME : MEGALA S
// BATCH CODE : 2576
// Make a threading with Synchronization...

class Number
{ 
synchronized void printNumber(int n)  
{
 for(int i=1; i<=7; i++)
{ 
 System.out.println(n+i); 
 try
{ 
 Thread.sleep(300); 
 }
catch(Exception e)
{
System.out.println(e);
} 
 } 
 }  
} 
class MyThread1 extends Thread
{ 
Number num; 
MyThread1(Number num)
{ 
this.num = num; 
 } 
 public void run()
{ 
num.printNumber(8); 
 } 
} 
class MyThread2 extends Thread
{ 
Number num; 
MyThread2(Number num)
{ 
this.num = num; 
} 
public void run()
{ 
num.printNumber(50); 
 } 
} 
 
public class Synchronization
{ 
public static void main(String[] args)
{ 
Number obj = new Number();
MyThread1 t1 = new MyThread1(obj); 
MyThread2 t2 = new MyThread2(obj); 
t1.start(); 
t2.start(); 
} 
}
