class newthread extends Thread
{
 newthread()
 {
  super("Thread");
  System.out.println("Child Thread: "+this);
  start();
 }
 public void run()
 {
  try{
   for(int i=5;i>0;i--)
   {System.out.println("Child Thread: "+i); 
   Thread.sleep(500);}
     }
   catch(InterruptedException e)
   {
    System.out.println("Exception Caught");
   }
   System.out.println("Exiting Child");}
}
class Thread3
{
 public static void main(String args[])
 {
 new newthread();
 try
 {
  for(int i=5;i>0;i--)
  {System.out.println("Main Thread: "+i);
  Thread.sleep(1000);}
 }
 catch(InterruptedException e)
 {
  System.out.println("Exception Caught");
 }
System.out.println("Exiting Main");
}
}
 
