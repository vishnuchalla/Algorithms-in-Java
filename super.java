import java.util.*;
class A
{int a;
 A(int a){
  this.a=a;                                     /* SUPER DOESN'T WORK IN OVERIDING IT CAN BE DONE AS SHOWN IN SUPER1*/
 }
  void show1()
 {
  System.out.println("Enter the principle and time");
  Scanner s=new Scanner(System.in);
  int p=s.nextInt();
  int t=s.nextInt();
  int sp=(p*t*a)/100;
  System.out.println("Simple interest in a:"+sp);
 }
}
class B extends A
{int b;
 B(int a,int b)
 {
  super(a);
  this.b=b;
 }
 void show2()
 {
  System.out.println("Enter the principle and time");
  Scanner s=new Scanner(System.in);
  int p=s.nextInt();
  int t=s.nextInt();
  int sp=(p*t*b)/100;
  System.out.println("Simple interest in b:"+sp);
 }
}
class C extends B
{
 int c;
 C(int a,int b,int c){
 super(a,b);
 this.c=c;
 }
 void show3()
 {
  System.out.println("Enter the principle and time");
  Scanner s=new Scanner(System.in);
  int p=s.nextInt();
  int t=s.nextInt();
  int sp=(p*t*c)/100;
  System.out.println("Simple interest in c:"+sp);
 }
}
class interest
{
 public static void main(String args[])
 {
  C c=new C(10,9,7);
  c.show3();
  c.show2();
  c.show1();
 }
}
