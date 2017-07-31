import java.util.*;
class sumd
{
 public static void main(String args[])
 {
  int r,x=0;
  System.out.println("Enter a number");
  Scanner s=new Scanner(System.in); 
  int a=s.nextInt();
  while(a>0)
  {
   r=a%10;
   x=x+r;
   a=a/10;
  }
  System.out.println("Sum="+x);
 }
}
