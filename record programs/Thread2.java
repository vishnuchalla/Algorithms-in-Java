class newthread extends Thread
{
 newthread()
 {
  Thread t=new Thread(this,"Thread");
  System.out.println("Child Thread: "+t);
  t.start();
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
class Thread2
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
 
