import java.awt.*;
import java.applet.*;
import java.awt.Color;
public class U2 extends Applet
{ 
String str=" Poola bulls";
public void init()
{
setSize(400,150);
setBackground(Color.blue);
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawString(str,60,50);
}
}
/*  
 <applet code="U2.class" height=200 width=320>
 </applet>
 */