import java.util.*;
class stringcomp
{
 public static void main(String args[])
 {
  StringBuffer st=new StringBuffer("Hello");
  String s="Hello";
  System.out.println(s.equals(st.toString()));
  System.out.println(s.contentEquals(st));
 }
}
