import java.awt.*;
import java.awt.event.*;
class nineth extends Frame
{
 nineth()
 {
  MenuBar mb=new MenuBar();
  Menu menu=new Menu("Menu");
  Menu submenu=new Menu("Submenu");
  MenuItem i1=new MenuItem("Item1");
  MenuItem i2=new MenuItem("Item2");
  MenuItem i3=new MenuItem("Item3");
  MenuItem i4=new MenuItem("Item4");
  MenuItem i5=new MenuItem("Item5");
  menu.add(i1);
  menu.add(i2);
  menu.add(i3);
  submenu.add(i4);
  submenu.add(i5);
  menu.add(submenu);
  mb.add(menu);
  setMenuBar(mb);
 // setSize(400,400);
  setLayout(null);
  setVisible(true);
 }
 public static void main(String args[])
 {
  new nineth();
 }
}
