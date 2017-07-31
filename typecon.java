import java.util.*;
class typecon
{
 static double add(int a,int b)
 {
  double c=(double)(a+b);
  return c;
 }
 static int add(double a,double b)
 {
  int c=(int)(a+b);
  return c;
 }
 public static void main(String args[])
 {
  System.out.println("Enter two intergers");
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  double c=add(a,b);
  System.out.println("Float Sum="+c);
  double e=s.nextDouble();
  double f=s.nextDouble();
  int g=add(e/f,f/e);
  System.out.println("Interger Sum="+g);
 }
}
