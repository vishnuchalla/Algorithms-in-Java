import java.awt.*;
import java.awt.event.*;
class eight extends Frame
{
 eight()
 {
  Choice c=new Choice();
  c.setBounds(50,60,100,30);
  Label l=new Label();
  l.setAlignment(Label.CENTER);
  l.setBounds(50,40,400,30);
  c.add("item1");
  c.add("item2");
  c.add("item3");
  c.add("item4");
  c.add("item5");
  Button b=new Button("Show");
  b.setBounds(150,60,60,50);
  b.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
   String text="Selected Item"+c.getItem(c.getSelectedIndex());
   l.setText(text);
  }});
  add(c);add(b);add(l);
  setSize(400,400);
  setLayout(null);
  setVisible(true);
 }
 public static void main(String args[])
 {
  new eight();
 }
}
