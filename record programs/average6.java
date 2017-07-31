import java.util.*;
class average
{
 public static void main(String args[])
 {
  Double a[]=new Double[3];
  System.out.println("Enter 3 numbers");
  Scanner s=new Scanner(System.in);
  for(int i=0;i<3;i++)
  a[i]=s.nextDouble();
  System.out.println("Average="+(a[0]+a[1]+a[2])/a.length);
 }
}
  
