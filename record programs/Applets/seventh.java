import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class seventh extends Applet implements MouseMotionListener
{
 public void init()
 {
  addMouseMotionListener(this);
  setBackground(Color.red);
 }
 public void mouseDragged(MouseEvent me)
 {
  Graphics g=getGraphics();
  g.setColor(Color.white);
  g.fillOval(me.getX(),me.getY(),5,5);
 }
 public void mouseMoved(MouseEvent me)
 {}
}
/* 
<applet code="seventh.class" height="500" width="500">
</applet>
*/
