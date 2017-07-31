import java.util.*;
class itom
{
 public static void main(String args[])
 {
  System.out.println("Enter the data in inches");
  Scanner s=new Scanner(System.in);
  double a=s.nextDouble();
  System.out.println(a+"inch="+(a*0.0254)+"metre");
 }
}
