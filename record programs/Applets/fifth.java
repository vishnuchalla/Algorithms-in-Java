import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class fifth extends Applet implements ActionListener
{
 Button b;
 TextField f;
 public void init()
 {
  f=new TextField();
  f.setBounds(30,40,150,150);
  b=new Button("Click");
  b.setBounds(80,150,60,60);
 add(b);
 add(f);
  b.addActionListener(this);
 setLayout(null);
}
public void actionPerformed(ActionEvent e)
{
 f.setText("Welcome");
}
}
/*
<applet code="fifth.class" height="1200" width="1200">
</applet>
*/ 
