import java.awt.*;
class first extends Frame
{
 first(){
 Button b=new Button("Click me");
 b.setBounds(20,30,60,50);
 add(b);
 setSize(300,300);
 setLayout(null);
 setVisible(true);
}
 public static void main(String args[])
 {
  first f=new first();
 }}
