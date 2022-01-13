import java.applet.*;
import java.awt.Graphics;

public class AppletParameter extends Applet{
	String name;

	public void init()
	{
		name = getParameter("name");
	}
	public void paint(Graphics g){
		g.drawString(name, 50 ,50);
	}

}