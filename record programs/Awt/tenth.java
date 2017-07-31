import java.awt.*;
import java.awt.event.*;
class tenth extends Frame implements MouseListener
{ Label l;
 tenth()
 {
  addMouseListener(this);
  l=new Label();
  l.setBounds(30,40,400,30);
  add(l);
  setSize(400,400);
  setLayout(null);
  setVisible(true);
 }
 public void mouseClicked(MouseEvent e)
 {
  l.setText("Mouse is Clicked");
 }
 public void mouseEntered(MouseEvent e)
 { 
  l.setText("Mouse has Entered");
 }
 public void mouseExited(MouseEvent e)
 {
  l.setText("Mouse has Exited");
 }
 public void mousePressed(MouseEvent e)
 {
  l.setText("Mouse is Pressed");
 }
 public void mouseReleased(MouseEvent e)
 {
  l.setText("Mouse is Released");
 }
 public static void main(String args[])
 {
  new tenth();
 }
}
