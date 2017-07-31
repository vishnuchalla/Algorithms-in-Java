import java.util.*;
class sumfive
{
 public static void main(String args[])
 {int a[]=new int[5];
  int sum=0;
  System.out.println("Enter five numbers");
  Scanner s=new Scanner(System.in);
  try
  {
   for(int i=0;i<5;i++)
   {
    a[i]=s.nextInt();
   }
   if(a.length>5)
   throw new ArrayIndexOutOfBoundsException();
   else
   {
    for(int i=0;i<5;i++)
    sum=sum+a[i];
    double average=(double)sum/5;
    System.out.println("Sum="+sum);
    System.out.println("average="+average);
   }
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("array out of bounds");
  }
 }
}
