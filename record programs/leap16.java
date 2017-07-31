import java.util.*;
class leap
{
 public static void main(String args[])
 {
  System.out.println("Enter any year");
  Scanner s=new Scanner(System.in);
  try
  {
    int a=s.nextInt();
    if(a%4==0)
    System.out.println("Leap year");
   else
   System.out.println("Not a Leap year");
 }
 catch(InputMismatchException ex)
 {
  System.out.println("Invalid input");
}}}