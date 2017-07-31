interface A
{
 void display();
}
interface C
{}
class B implements A
{
 public void display()
 {
  System.out.println("This is an interface test");
  }
}
class interface50
{
 public static void main(String args[])
 {
  B b=new B();
  b.display(); 
 }
}
