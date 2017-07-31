import java.awt.*;
import java.awt.event.*;
class seventh extends Frame
{
 seventh()
 {
  CheckboxGroup grp=new CheckboxGroup();
  Checkbox c1=new Checkbox("C++",grp,false);
  c1.setBounds(40,100,100,20);
  Checkbox c2=new Checkbox("Java",grp,false);
  c2.setBounds(40,200,100,20);
  Label l=new Label();
  l.setBounds(20,50,1000,20);
  c1.addItemListener(new ItemListener(){
  public void itemStateChanged(ItemEvent e)
  {
   l.setText("C++ Checkbox: Checked");
   }});
  c2.addItemListener(new ItemListener(){
  public void itemStateChanged(ItemEvent e)
  {
   l.setText("Java Checkbox: Checked");
   }});
  add(c1);add(c2);add(l);
  setSize(400,400);
  setLayout(null);
  setVisible(true);
 }
 public static void main(String args[])
 {
  new seventh();
 }
}
