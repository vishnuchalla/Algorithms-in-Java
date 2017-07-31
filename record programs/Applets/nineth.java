import java.applet.*;
import java.awt.*;
public class nineth extends Applet
{
 public void paint(Graphics g)
 {
  String st=getParameter("msg");
  g.drawString(st,120,150);
 }
}
/*
<applet code="nineth.class" height="300" width="300">
<param name="msg" value="This is a text">
</applet>
*/
