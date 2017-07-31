import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  
public class tenth extends Applet implements ActionListener{  
Button b;  
  
public void init(){  
b=new Button("Click");  
b.setBounds(50,50,60,50);  
  
add(b);  
b.addActionListener(this);  
}  
  
public void actionPerformed(ActionEvent e){  
  
second a=(second)getAppletContext().getApplet("app2");  
a.setBackground(Color.yellow);  
}  
}  
/*
<applet code="tenth.class" width="150" height="150">
</applet>
<applet code="second.class" width="150" height="150" name="app2">  
</applet>
*/
