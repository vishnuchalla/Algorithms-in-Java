import java.util.*;
class quadratic
{
 public static void main(String args[])
{
 System.out.println("Enter the coefficients of a quadratic equation");
 Scanner s=new Scanner(System.in);
 double a=s.nextDouble();
 double b=s.nextDouble();
 double c=s.nextDouble();
 double d=(b*b)-(4*a*c);
 if(d>0)
{
  System.out.println("Roots are real and unequal");
  System.out.println("root1="+((-b)+Math.sqrt(d))/(2*a)+"root2="+((-b)-Math.sqrt(d))/(2*a));
}
else if(d<0)
{
 System.out.println("Roots are nonreal and imaginary");
 System.out.println("root1="+(-b)/(2*a)+"+i"+Math.sqrt(-d)/(2*a)+"root2="+(-b)/(2*a)+"-i"+(Math.sqrt(-d))/(2*a));
}
 else
{
  System.out.println("Roots are real and equal");
  System.out.println("root1="+(-b)/(2*a)+"root2="+(-b)/(2*a));
}
}
}
