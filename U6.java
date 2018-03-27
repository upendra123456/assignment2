import java.awt.*;
public class U6 extends Frame
{
public static void main(String args[])
{
U6 p=new U6();
}
Button B1=new Button("login");
Label l1=new Label("Username");
Label l2=new Label("Password");
TextField t1=new TextField();
TextField t2=new TextField();
public U6()
{
setSize(400,300);
setTitle("Login window");
setLayout(new GridLayout(3,3));
add(l1);
add(t1);
add(l2);
add(t2);
add(B1);
setVisible(true);
}
}