import java.util.*;
class fib
{
 public static void main(String args[])
 {
  double n,count=0,a=0,b=1,c;
  System.out.println("Enter the limit");
  Scanner s=new Scanner(System.in);
  n=s.nextDouble();
  if(n==1)
  System.out.println(a);
  else if(n==2)
  {System.out.println(a);
   System.out.println(b);} 
  else if(n>2)
  {
  System.out.println(a);
  System.out.println(b);
   while(count<n-2)
   {
    c=a+b;
    System.out.println(c);
    a=b;
    b=c;
    ++count;
   }
 }}
}
