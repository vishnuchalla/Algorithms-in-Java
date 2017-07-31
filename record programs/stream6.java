import java.util.*;
import java.io.*;
class stream6
{
 public static void main(String args[])
 {
  try
  {
   FileOutputStream a=new FileOutputStream("/home/vishnu/input.txt");
   DataOutputStream b=new DataOutputStream(a);
   b.writeInt(34);
   b.flush();
   b.close();
   a.close();
  }
  catch(Exception e)
  {}
}}
