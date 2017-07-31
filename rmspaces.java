import java.util.*;
class rmspaces
{
 public static void main(String args[])
 {
  String s="    Hello    World";
  s=s.trim().replaceAll(" +"," ");// here replaceAll is just used to remove the spaces but trim will remove spaces at the beginning also...
  System.out.println(s);
 }
}
