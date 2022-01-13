import java.applet.*;
import java.awt.Graphics;

class LifeCycle extends Applet {  

public void paint(Graphics g) {  
	System.out.println("Running paint");
	g.drawString("Hello World ", 50 ,50);
}

}  