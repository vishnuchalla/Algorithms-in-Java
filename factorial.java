import java.util.*;
class fact
{
 static int multiply(int x,int res[],int ressize)
 {
  int carry=0;
  for(int i=0;i<ressize;i++)
  {
   int pro=res[i]*x+carry;
   res[i]=pro%10;
   carry=pro/10;
   }
  while(carry>0)
  {
   res[ressize]=carry%10;
   carry=carry/10;
   ressize++;
  }
  return ressize;
 }
 static void factorial(int n)
 {
  int res[]=new int[10000];
  res[0]=1;
  int ressize=1;
  for(int i=1;i<=n;i++)
  ressize=multiply(i,res,ressize);
  for(int i=ressize-1;i>=0;i--)
  System.out.print(res[i]);
 }
 public static void main(String args[])
 {
  System.out.println("Enter a number");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  factorial(n);
 }
}