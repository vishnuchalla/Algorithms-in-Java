import java.awt.*;
import java.awt.event.*;
class second extends Frame
{TextField t;
 second(){
 t=new TextField();
 t.setBounds(30,40,150,20);
 Button b=new Button("Click me");
 b.setBounds(80,40,60,50);
 Outer o=new Outer(this);
 b.addActionListener(o);
 add(t);
 add(b);
 setSize(400,400);
 setLayout(null);
 setVisible(true);
} 
 public static void main(String args[])
 {
  new second();
 }
}
class Outer implements ActionListener
{
 second obj;
 Outer(second obj)
 {
  this.obj=obj;
 }
 public void actionPerformed(ActionEvent e)
 {
  obj.t.setText("Welcome");
 }
}
