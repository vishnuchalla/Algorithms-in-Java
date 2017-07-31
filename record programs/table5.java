import java.util.*;
class table
{
 public static void main(String args[])
 {
  System.out.println("Enter any number");
  Scanner s=new Scanner(System.in);
  double a=s.nextDouble();
  System.out.println("Multilplication Table:");
  for(int i=1;i<=10;i++)
  System.out.println(a+"*"+i+"="+(a*i));
 }
}
