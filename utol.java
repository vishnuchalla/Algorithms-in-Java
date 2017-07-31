import java.util.*;
class utol
{
 public static void main(String args[])
 {
 System.out.println("Enter a word");
 Scanner s=new Scanner(System.in);
 String st=s.next();
 for(int i=0;i<st.length();i++)
 {char c=st.charAt(i);
  if(Character.isUpperCase(c))
  System.out.print(Character.toLowerCase(c));
  else
  System.out.print(Character.toUpperCase(c));
 }
 System.out.println();
 }
}

