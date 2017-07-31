import java.util.*;
class ftoc
{
 public static void main(String args[])
 {
  System.out.println("Enter the temperature in Fahrenhiet"); 
  Scanner s=new Scanner(System.in);
  double a=s.nextDouble();
  double c=(a-32)*5/9;
  System.out.println("Celsius="+c);
 } 
}
