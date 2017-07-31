import java.applet.*;
import java.awt.*;
public class third extends Applet
{
 Image picture;
 public void init()
 {
  picture=getImage(getDocumentBase(),"horse.jpg");
 }

public void paint(Graphics g)
 {
  g.drawImage(picture,30,30,this);
 }
}
/*
<applet code="third.class" height="1200" width="1200">
</applet>
*/
