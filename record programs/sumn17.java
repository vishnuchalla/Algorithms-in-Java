import java.util.*;
class sumn
{
 public static void main(String args[])
 {
  System.out.println("Enter any number");
  Scanner s=new Scanner(System.in);
  try
  {
   int a=s.nextInt();
   for(int i=0;i<=a;i++)
   System.out.print(i+"\t");
   System.out.println();
   double sum=a*(a+1)/2;
   System.out.println("Sum="+sum);
  }
 catch(InputMismatchException ex)
 {
  System.out.println("Invalid input");
 }
}
}