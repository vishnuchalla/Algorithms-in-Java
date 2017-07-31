import java.awt.*;
import java.awt.event.*;
class third extends Frame implements ActionListener
{ TextField t;
  Button b;
  Label l;
 third()
 {
  t=new TextField();
  t.setBounds(50,50,150,20);
  b=new Button("Find IP");
  b.setBounds(50,150,60,30);
  l=new Label();
  l.setBounds(50,100,250,20);
  b.addActionListener(this);
  add(t);
  add(b);
  add(l);
  setSize(400,400);
  setLayout(null);
  setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  try{
  String host=t.getText();
  String ip=java.net.InetAddress.getByName(host).getHostAddress();
  l.setText("IP of "+host+"is: "+ip);
  }
  catch(Exception ex)
  {System.out.println(ex);
  }
}
 public static void main(String args[])
 {
  new third();
}
 }
