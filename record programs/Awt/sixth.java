import java.awt.*;
import java.awt.event.*;
class sixth extends Frame implements ItemListener
{
 Checkbox c1,c2;
 Label l;
 sixth(){
 c1=new Checkbox("C++");
 c1.setBounds(60,50,100,20);
 c2=new Checkbox("Java");
 c2.setBounds(60,100,100,20);
 l=new Label();
 l.setBounds(60,20,100,20);
 c1.addItemListener(this);
 c2.addItemListener(this);
 add(c1);
 add(c2);
 add(l);
 setSize(400,400);
 setLayout(null);
 setVisible(true);
 }
 public void itemStateChanged(ItemEvent e)
 {
  if(e.c1==true)
  {
   l.setText("C++ CheckBox: "+((e.getStateChange()==1)?"Checked":"Unchecked"));
  }
  else if(e.c2==true)
  {
   l.setText("Java CheckBox: "+((e.getStateChange()==1)?"Checked":"Unchecked"));
  }
 }
 public static void main(String args[])
 {
  new sixth();
 }
}
