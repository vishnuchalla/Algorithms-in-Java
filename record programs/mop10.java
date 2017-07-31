import java.util.*;
class mop
{
 public static void main(String args[])
 {
  System.out.println("Enter any two numbers");
  Scanner s=new Scanner(System.in);
  double a=s.nextDouble();
  double b=s.nextDouble();
  System.out.println("Sum="+(a+b));
  System.out.println("Difference="+(a-b));
  System.out.println("Product="+(a*b));
  System.out.println("Distance="+(a-b));
  double max=(a>b)?a:b;
  double min=(a<b)?a:b;
  System.out.println("Max="+max);
  System.out.println("Min="+min);
 }
}
