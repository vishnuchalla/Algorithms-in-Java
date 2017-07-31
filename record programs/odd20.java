import java.util.*;
class odd
{
 public static void main(String args[])
 {
  int sum=0;
  System.out.println("Enter the limit");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  for(int i=0;i<=n;i++)
  {
   if(i%2!=0)
  {System.out.print(i+"\t");
   sum=sum+i;}
  }
  System.out.println("\nSum="+sum);
}}
