import java.util.*;
class week
{
 public static void main(String args[])
{
 System.out.println("Enter a number between 1 and 7");
 Scanner s=new Scanner(System.in);
 try
 {
  int a=s.nextInt();
   if(a>=1&&a<=7)
   {
    switch(a)
    { case 1:System.out.println("Sunday");
                break;
      case 2:System.out.println("Monday");
                break;
      case 3:System.out.println("Tuesday");
                break;
      case 4:System.out.println("Wednesday");
                break;
      case 5:System.out.println("Thursday");
                break;
      case 6:System.out.println("Friday");
                break;
      case 7:System.out.println("Saturday");
                break;
     }
}
  else
  throw new InputMismatchException();
 }
 catch(InputMismatchException e)
 {
  System.out.println("Invalid Input");
 }
}
}
