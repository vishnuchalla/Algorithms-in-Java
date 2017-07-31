import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class sixth extends JApplet implements ActionListener
{
 Button b;
 TextField t;
 public void init()
 {
  b=new Button("Click");
  t=new TextField();
  b.setBounds(80,150,60,50);
  t.setBounds(30,40,150,20);
  add(t);
  add(b);
  b.addActionListener(this);
  setLayout(null);
 }
 public void actionPerformed(ActionEvent e)
 {
  t.setText("Welcome");
 }
}
/*
<applet code="sixth.class" height="500" width="500">
</applet>
*/
