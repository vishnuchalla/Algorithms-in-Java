import java.util.*;
class occur
{
 public static void main(String args[])
 {int count=0,g=0;
  System.out.println("Enter a name");
  Scanner s=new Scanner(System.in);
  String str=s.next();
  System.out.println("Enter a character");
  char k=s.next().charAt(0);
  char ch[]=new char[str.length()];
  for(int i=0;i<ch.length;i++) 
  {ch[i]=str.charAt(i);
   if(ch[i]==k)
   {g++;
   System.out.println(k+" occured at "+(i+1)+" position");}
   else
   count++;}
  if(count==ch.length)
  System.out.println("Element not found");
  else
  System.out.println(k+" occured "+g+" times");
 }
}
   
