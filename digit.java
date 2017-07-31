import java.util.*;
class digit
{
 public static void main(String args[])
 {
  System.out.println("Enter a character");
  Scanner s =new Scanner(System.in);
  char c=s.next().charAt(0);
  if(Character.isDigit(c))
  System.err.println("its number");
  else if(Character.isLetter(c))
  System.err.println("its letter");
  else
  System.err.println("Special char");
 }
}
