import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Calculator extends Applet implements ActionListener
{
TextField t;
Button b[]=new Button[15];
Button b1[]=new Button[6];
String op2[]={"+","-","*","%","=","C"};
String str1="";
int p=0,q=0;
String oper;
public void init()
{
setLayout(new GridLayout(5,4));
t=new TextField();
setBackground(Color.pink);
int k=0;
t.setEditable(false);
t.setBackground(Color.white);
t.setText("0");
for(int i=0;i<10;i++)
{
b[i]=new Button(""+k);
add(b[i]);
k++;
b[i].setBackground(Color.pink);
b[i].addActionListener(this);
}
for(int i=0;i<6;i++)
{
b1[i]=new Button(""+op2[i]);
add(b1[i]);
b1[i].setBackground(Color.pink);
b1[i].addActionListener(this);
}
add(t);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("+"))
{
p=Integer.parseInt(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("-"))
{p=Integer.parseInt(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("*"))
{p=Integer.parseInt(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("%"))
{p=Integer.parseInt(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("="))
{str1="";
if(oper.equals("+"))
{
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p+q)));}
else if(oper.equals("-"))
{
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p-q)));}
else if(oper.equals("*"))
{
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p*q)));}
else if(oper.equals("%"))
{
q=Integer.parseInt(t.getText());
t.setText(String.valueOf((p%q)));}
}
else if(str.equals("C"))
{p=0;q=0;
t.setText("");
str1="";
t.setText("0");
}
else{
t.setText(str1.concat(str));
str1=t.getText();
}
}
}
/*<applet code="Calculator.class" width=300 height=300>
</applet>*/
