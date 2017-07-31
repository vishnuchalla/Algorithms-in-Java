import java.applet.*;
import java.awt.*;
public class fourth extends Applet
{
 Image im;
 public void init()
 {
  im=getImage(getDocumentBase(),"horse.jpg");
 }
 public void paint(Graphics g)
 {
  for(int i=0;i<1000;i++)
  {
  g.drawImage(im,i,20,this);
  try
{
 Thread.sleep(10);
}
catch(Exception e){}}
 }
}
/*
<applet code="fourth.class" height="12000" width="12000">
</applet>
*/
