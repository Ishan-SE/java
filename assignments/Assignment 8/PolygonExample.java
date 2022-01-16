import java.awt.*;
import java.applet.*;

public class PolygonExample extends Applet{
		public void paint(Graphics g){
//For Green Filled Triangle and Blue Bodered Triangle			
         //Declaring Coordinates
        int[] xTriangle_fill={50,100,150};
        int[] yTriangle_fill={100,20,100};
        int[] xTriangle_Border={200,250,300};
        int[] yTriangle_Border={100,20,100};

      	Polygon filled_Triangle = new Polygon(xTriangle_fill,yTriangle_fill,3);
		Polygon border_blue_triangle = new Polygon(xTriangle_Border,yTriangle_Border,3);

		g.setColor(Color.GREEN);
		g.fillPolygon(filled_Triangle);

        g.setColor(Color.BLUE);
		g.drawPolygon(border_blue_triangle);

// For Nepal Flag	
        
        //BORDER
		int[] xFlag={50,60,210,90,260,60,60,50};
		int[] yFlag={130,130,280,280,530,530,600,600};
        Polygon Flag=new Polygon(xFlag,yFlag,8);
        g.setColor(Color.BLUE);
        g.fillPolygon(Flag);

        //Inner Red Part
        int[] xRed={60,200,81,250,60};
        int[] yRed={135,275,275,525,525};
        Polygon red_Part=new Polygon(xRed,yRed,5);
        g.setColor(Color.RED);
        g.fillPolygon(red_Part);

        //Internal Details
        int[] xSun={130,140,160,150,170,150,160,140,130,120,100,110,90,105,100,120};
        int[] ySun={415,435,425,445,455,465,495,475,505,475,495,465,455,445,425,435,415};
        Polygon sun=new Polygon(xSun,ySun,16);
        g.setColor(Color.WHITE);
        g.fillPolygon(sun);
        
        g.fillArc(70,205,70,50,0,-180);
        g.setColor(Color.RED);
        g.fillArc(70,195,70,50,0,-180);

        int[] xMoon_star={85,75,95,105,115,135,125};
        int[] yMoon_star={245,225,235,215,235,225,245};
        Polygon moon = new Polygon(xMoon_star,yMoon_star,7);
        g.setColor(Color.WHITE);
        g.fillPolygon(moon);
	}
}