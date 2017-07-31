import java.util.*;
class nod
{
 public static void main(String args[])
{
 System.out.println("Enter the month number");
 Scanner s=new Scanner(System.in);
 try
 {
   int a=s.nextInt();
   if(a>=1&&a<=12)
   {
    switch(a)
    {case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:System.out.println("Number of Days=31");
                 break;
    case 4:
    case 6:
    case 9:
    case 11:System.out.println("Number of Days=30");
                 break;
    case 2:System.out.println("Number of Days=29 or 28");
                break;
  }}
  else
  throw new InputMismatchException();
 }
 catch(InputMismatchException ex)
{
  System.out.println("Invalid Input");
}
}}