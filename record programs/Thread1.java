class Thread1
{
 public static void main(String args[])
 {
  Thread t=Thread.currentThread();
  System.out.println("Current Thread: "+t);
  t.setName("Thread");
  System.out.println("changed Thread: "+t);
  try
  {
   for(int n=5;n>0;n--)
   {System.out.println(n);
   t.sleep(2000);}
  }
  catch(InterruptedException e)
  {
   System.out.println(t);
  }
}
}
