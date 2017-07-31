class newthread extends Thread
{String tname;
 Thread t;
 newthread(String name)
 {tname=name;
  t=new Thread(this,tname);
  System.out.println(tname+": "+t);
  t.start();
 }
 public void run()
 {
  try
  {
   for(int i=5;i>0;i--)
   {System.out.println(tname+": "+i);
    Thread.sleep(1000);}
  }
  catch(InterruptedException e)
  {
   System.out.println("Exception Caught");
  }
 System.out.println("Exiting "+tname);}
}
class Thread4
{
 public static void main(String args[])
 {
  new newthread("one");
  new newthread("two");
  new newthread("three");
  try
  {
   Thread.sleep(10000);
  }
  catch(InterruptedException e)
  {
  System.out.println("Exception caught");
  }
 System.out.println("Exiting Main");}
}
