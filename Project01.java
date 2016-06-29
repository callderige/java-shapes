import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Project01 extends Frame implements ActionListener
{
	String[] description = new String[] 
			{
			"This program receives the geometrical properties of a shape; calculates",
			"and Displays the perimeter, area and other properties of the shape",
			"Input:",
			"- Cartesian coordinates of the three endpoints of the triangle",
			"Output:",
			"- Coordinates, sides, perimeter and area of the triangle"
			};
	
	Triangle t = new Triangle();
	Rectangle r = new Rectangle();
	Circle c = new Circle();
		
	String command = "";
	
	public Project01()
	{
		setTitle("Shape Properties");
		
		//Creates a Menu Bar.
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		
		Menu fileMenu = new Menu("File"); // Creates menu group called "File".		
		mb.add(fileMenu); // Adds the "File" menu to the menu bar.
		
		// Creates an "About" menu item under "File" and adds an actionlistner to it.
		MenuItem miAbout = new MenuItem("About"); 
		miAbout.addActionListener(this);
		fileMenu.add(miAbout);
		
		// Creates an "Exit" menu item under "File" and adds an actionlistner to it.
		MenuItem miExit = new MenuItem("Exit");
		miExit.addActionListener(this);
		fileMenu.add(miExit);
		
		//**********************//
		//Triangle buttons start//
		//**********************//
		Menu triangleMenu = new Menu("Triangle"); // Creates a "Triangle" Menu Item		
		mb.add(triangleMenu); // Adds a "Triangle" Tab to the menu bar.
		
		// Creates an "Enter Coordinates" menu item under "Triangle" and adds an actionlistner to it.
		MenuItem miEnterCoordinatesT = new MenuItem("Enter Coordinates (T)");
		miEnterCoordinatesT.addActionListener(this);
		triangleMenu.add(miEnterCoordinatesT);
		
		// Creates an "Sides" menu item under "Triangle" and adds an actionlistner to it.
		MenuItem miSidesT = new MenuItem("Sides (T)");
		miSidesT.addActionListener(this);
		triangleMenu.add(miSidesT);
		
		// Creates an "Area" menu item under "Triangle" and adds an actionlistner to it.
		MenuItem miAreaT = new MenuItem("Area (T)");
		miAreaT.addActionListener(this);
		triangleMenu.add(miAreaT);
		
		// Creates an "Perimeter" menu item under "Triangle" and adds an actionlistner to it.
		MenuItem miPerimeterT = new MenuItem("Perimeter (T)");
		miPerimeterT.addActionListener(this);
		triangleMenu.add(miPerimeterT);
		
		// Creates an "All Properties" menu item under "Triangle" and adds an actionlistner to it.
		MenuItem miAllT = new MenuItem("All Properties (T)");
		miAllT.addActionListener(this);
		triangleMenu.add(miAllT);
		
		// Creates an "Draw" menu item under "Triangle" and adds an actionlistner to it.
		MenuItem miDrawT = new MenuItem("Draw (T)");
		miDrawT.addActionListener(this);
		triangleMenu.add(miDrawT);
				
		//***********************//
		//Rectangle buttons start//
		//***********************//
		Menu rectangleMenu = new Menu("Rectangle"); // Creates a "Rectangle" Menu Item		
		mb.add(rectangleMenu); // Adds a "Rectangle" Tab to the menu bar.
		
		// Creates an "Enter Coordinates" menu item under "Rectangle" and adds an actionlistner to it.
		MenuItem miEnterCoordinatesR = new MenuItem("Enter Coordinates (R)");
		miEnterCoordinatesR.addActionListener(this);
		rectangleMenu.add(miEnterCoordinatesR);
		
		// Creates an "Width" menu item under "Rectangle" and adds an actionlistner to it.
		MenuItem miWidth = new MenuItem("Width");
		miWidth.addActionListener(this);
		rectangleMenu.add(miWidth);
		
		// Creates an "Length" menu item under "Rectangle" and adds an actionlistner to it.
		MenuItem miLength = new MenuItem("Length");
		miLength.addActionListener(this);
		rectangleMenu.add(miLength);
		
		// Creates an "Area" menu item under "Rectangle" and adds an actionlistner to it.
		MenuItem miAreaR = new MenuItem("Area (R)");
		miAreaR.addActionListener(this);
		rectangleMenu.add(miAreaR);
		
		// Creates an "Perimeter" menu item under "Rectangle" and adds an actionlistner to it.
		MenuItem miPerimeterR = new MenuItem("Perimeter (R)");
		miPerimeterR.addActionListener(this);
		rectangleMenu.add(miPerimeterR);
		
		// Creates an "All Properties" menu item under "Rectangle" and adds an actionlistner to it.
		MenuItem miAllR = new MenuItem("All Properties (R)");
		miAllR.addActionListener(this);
		rectangleMenu.add(miAllR);
		
		// Creates an "Draw" menu item under "Rectangle" and adds an actionlistner to it.
		MenuItem miDrawR = new MenuItem("Draw (R)");
		miDrawR.addActionListener(this);
		rectangleMenu.add(miDrawR);
		
		//*********************//
		//Circle buttons start//
		//********************//
		Menu circleMenu = new Menu("Circle"); // Creates a "Circle" Menu Item		
		mb.add(circleMenu); // Adds a "Circle" Tab to the menu bar.
		
		// Creates an "Enter Coordinates" menu item under "Circle" and adds an actionlistner to it.
		MenuItem miEnterCoordinatesC = new MenuItem("Enter Coordinates (C)");
		miEnterCoordinatesC.addActionListener(this);
		circleMenu.add(miEnterCoordinatesC);
		
		// Creates an "Diameter" menu item under "Circle" and adds an actionlistner to it.
		MenuItem miDiameter = new MenuItem("Diameter");
		miDiameter.addActionListener(this);
		circleMenu.add(miDiameter);
		
		// Creates an "Radius" menu item under "Circe" and adds an actionlistner to it.
		MenuItem miRadius = new MenuItem("Radius");
		miRadius.addActionListener(this);
		circleMenu.add(miRadius);
		
		// Creates an "Circumference" menu item under "Circle" and adds an actionlistner to it.
		MenuItem miCircumference = new MenuItem("Circumference");
		miCircumference.addActionListener(this);
		circleMenu.add(miCircumference);
		
		// Creates an "Area" menu item under "Circle" and adds an actionlistner to it.
		MenuItem miAreaC = new MenuItem("Area (C)");
		miAreaC.addActionListener(this);
		circleMenu.add(miAreaC);
		
		// Creates an "All Properties" menu item under "Circle" and adds an actionlistner to it.
		MenuItem miAllC = new MenuItem("All Properties (C)");
		miAllC.addActionListener(this);
		circleMenu.add(miAllC);
		
		// Creates an "Draw" menu item under "Circle" and adds an actionlistner to it.
		MenuItem miDrawC = new MenuItem("Draw (C)");
		miDrawC.addActionListener(this);
		circleMenu.add(miDrawC);
		
		//Ends program when closed.
		WindowListener l = new WindowAdapter()
		{
			public void windowClosing(WindowEvent ev)
			{
				System.exit(0);
			}
			
			public void windowActivated(WindowEvent ev)
			{
				repaint();
			}
			
			public void windowStateChanged(WindowEvent ev)
			{
				repaint();
			}
		};
		
		ComponentListener k = new ComponentAdapter()
		{
			public void componentResized(ComponentEvent e)
			{
				repaint();
			}
			
		};
		
		this.addWindowListener(l);
		this.addComponentListener(k);		
	}
		
	public void actionPerformed(ActionEvent ev)
	{
		command = ev.getActionCommand();
		
		if ("About".equals(command))
			repaint();
		else if ("Exit".equals(command))
			System.exit(0);
		else if("Enter Coordinates (T)".equals(command))
		{
			t.getCoordinatesT();
			repaint();
		}
		else if("Sides (T)".equals(command) || "Area (T)".equals(command) ||
				"Perimeter (T)".equals(command) || "Draw (T)".equals(command) || "All Properties (T)".equals(command))
			repaint();
		else if("Enter Coordinates (R)".equals(command))
		{
			r.getCoordinatesR();
			repaint();
		}
		else if("Width".equals(command) || "Length".equals(command) ||
				"Area (R)".equals(command) || "Perimeter (R)".equals(command) || "Draw (R)".equals(command) ||
				"All Properties (R)".equals(command))
			repaint();
		else if("Enter Coordinates (C)".equals(command))
		{
			c.getCoordinatesC();
			repaint();
		}
		else if("Diameter".equals(command) || "Radius".equals(command) ||
				"Circumference".equals(command) || "Area (C)".equals(command) || "Draw (C)".equals(command) ||
				"All Properties (C)".equals(command))
			repaint();
	}
	
	public void paint(Graphics g)
	{
		int x = 200; // Needed for placement
		int y = 150; // Needed for placement
		
		int ww = (int)r.getWidthR();
		int wl = (int)r.getLengthR();
		int cs = (int)c.getDiameter();
		
		if ("About".equals(command))
		{
			for(int i = 0; i < 6; i++)
			{
				g.drawString(description[i], x-120, y+40);
				y+=25;
			}
		}
		else if ("Enter Coordinates (T)".equals(command))
		{
			g.drawString("Coordinates of the three endpoints of the Triangle",x-50,y);
			y+=25;
			g.drawLine(x-50, y, x+200, y);
			y+=25;
			g.drawString("First Point",x,y);
			g.drawString("= (" +Integer.toString(t.getX1())+ "," +Integer.toString(t.getY1())+ ")", x+90,y);
			y+=25;
			g.drawLine(x-50, y, x+200, y);
			y+=25;
			g.drawString("Second Point",x,y);
			g.drawString("= (" +Integer.toString(t.getX2())+ "," +Integer.toString(t.getY2())+ ")", x+90,y);
			y+=25;
			g.drawLine(x-50, y, x+200, y);
			y+=25;
			g.drawString("Third Point",x,y);
			g.drawString("= (" +Integer.toString(t.getX3())+ "," +Integer.toString(t.getY3())+ ")", x+90,y);
		}
		else if ("Sides (T)".equals(command))
		{
			g.drawString("The length of the three sides of the triangle are:", x-40, y);
			y+=25;
			g.drawLine(x-40, y, x+210, y);
			y+=25;
			g.drawString("First Side", x, y);
			g.drawString("=" +Double.toString(t.getSide1()), x+90, y);
			y+=25;
			g.drawLine(x-40, y, x+210, y);
			y+=25;
			g.drawString("Second Side", x, y);
			g.drawString("=" +Double.toString(t.getSide2()), x+90, y);
			y+=25;
			g.drawLine(x-40, y, x+210, y);
			y+=25;
			g.drawString("Third Side", x, y);
			g.drawString("=" +Double.toString(t.getSide3()), x+90, y);
		}
		else if ("Perimeter (T)".equals(command))
		{
			g.drawString("The perimeter of the triangle is:",x,y);
			y+=25;
			g.drawLine(x, y, x+140, y);
			y+=25;
			g.drawString("Perimeter",x,y);
			g.drawString("= " +Double.toString(t.getPerimeter()), x+90, y);	
		}
		else if ("Area (T)".equals(command))
		{
			g.drawString("The area of the triangle is:",x,y);
			y+=25;
			g.drawLine(x, y, x+140, y);
			y+=25;
			g.drawString("Area",x,y);
			g.drawString("= " +Double.toString(t.getArea()), x+90, y);			
		}
		else if ("All Properties (T)".equals(command))
		{
			g.drawString("All the properties of the triangle are:", x, y);
			y+=25;
			g.drawLine(x, y, x+140, y);
			y+=25;
			g.drawString("First Point: ",x,y);
			g.drawString("= (" +Integer.toString(t.getX1())+ "," +Integer.toString(t.getY1())+ ")", x+90,y);
			y+=25;
			g.drawString("Second Point: ",x,y);
			g.drawString("= (" +Integer.toString(t.getX2())+ "," +Integer.toString(t.getY2())+ ")", x+90,y);
			y+=25;
			g.drawString("Third Point", x, y);
			g.drawString("= (" +Integer.toString(t.getX3())+ "," +Integer.toString(t.getY2())+ ")", x+90,y);
			y+=25;
			g.drawString("First Side", x, y);
			g.drawString("=" +Double.toString(t.getSide1()), x+90, y);
			y+=25;
			g.drawString("Second Side", x, y);
			g.drawString("=" +Double.toString(t.getSide2()), x+90, y);
			y+=25;
			g.drawString("Third Side", x, y);
			g.drawString("=" +Double.toString(t.getSide3()), x+90, y);
			y+=25;
			g.drawString("Perimeter",x,y);
			g.drawString("= " +Double.toString(t.getPerimeter()), x+90, y);
			y+=25;
			g.drawString("Area",x,y);
			g.drawString("= " +Double.toString(t.getArea()), x+90, y);
		}
		else if ("Draw (T)".equals(command))
		{
			g.drawLine(x+t.getX1(), y+t.getY1(), x+t.getX2(), y+t.getY2());
			g.drawLine(x+t.getX2(), y+t.getY2(), x+t.getX3(), y+t.getY3());
			g.drawLine(x+t.getX1(), y+t.getY1(), x+t.getX3(), y+t.getY3());
		}
		else if ("Enter Coordinates (R)".equals(command))
		{
			g.drawString("Coordinates of the two endpoints of the Rectangle",x-50,y);
			y+=25;
			g.drawLine(x-50, y, x+200, y);
			y+=25;
			g.drawString("First Point",x,y);
			g.drawString("= (" +Integer.toString(r.getX1R())+ "," +Integer.toString(r.getY1R())+ ")", x+90,y);
			y+=25;
			g.drawLine(x-50, y, x+200, y);
			y+=25;
			g.drawString("Second Point",x,y);
			g.drawString("= (" +Integer.toString(r.getX2R())+ "," +Integer.toString(r.getY2R())+ ")", x+90,y);
		}
		else if ("Width".equals(command))
		{
			g.drawString("The width of the sqaure based on the points:", x-25, y);
			y+=25;
			g.drawLine(x-25, y, x+200,y);
			y+=25;
			g.drawString("Width",x,y);
			g.drawString("= " +Double.toString(r.getWidthR()), x+90, y);			
		}
		else if ("Length".equals(command))
		{
			g.drawString("The Length of the sqaure based on the points:", x-25, y);
			y+=25;
			g.drawLine(x-25, y, x+200,y);
			y+=25;
			g.drawString("Length",x,y);
			g.drawString("= " +Double.toString(r.getLengthR()), x+90, y);
		}
		else if ("Perimeter (R)".equals(command))
		{
			g.drawString("The perimeter of the rectangle is:",x,y);
			y+=25;
			g.drawLine(x, y, x+140, y);
			y+=25;
			g.drawString("Perimeter",x,y);
			g.drawString("= " +Double.toString(r.getPerimeterR()), x+90, y);
		}
		else if ("Area (R)".equals(command))
		{
			g.drawString("The area of the rectangle is:",x,y);
			y+=25;
			g.drawLine(x, y, x+140, y);
			y+=25;
			g.drawString("Area",x,y);
			g.drawString("= " +Double.toString(r.getAreaR()), x+90, y);
		}
		else if ("All Properties (R)".equals(command))
		{			
			g.drawString("All the properties of the square are:", x, y);
			y+=25;
			g.drawLine(x, y, x+140, y);
			y+=25;
			g.drawString("First Point",x,y);
			g.drawString("= (" +Integer.toString(r.getX1R())+ "," +Integer.toString(r.getY1R())+ ")", x+90,y);
			y+=25;
			g.drawString("Second Point",x,y);
			g.drawString("= (" +Integer.toString(r.getX2R())+ "," +Integer.toString(r.getY2R())+ ")", x+90,y);
			y+=25;
			g.drawString("Width",x,y);
			g.drawString("= " +Double.toString(r.getWidthR()), x+90, y);
			y+=25;
			g.drawString("Length",x,y);
			g.drawString("= " +Double.toString(r.getLengthR()), x+90, y);
			y+=25;
			g.drawString("Perimeter",x,y);
			g.drawString("= " +Double.toString(r.getPerimeterR()), x+90, y);
			y+=25;
			g.drawString("Area",x,y);
			g.drawString("= " +Double.toString(r.getAreaR()), x+90, y);
		}
		else if ("Draw (R)".equals(command))
		{
			g.drawRect(x+r.getX3R(),y+r.getY3R(),ww,wl);			
		}
		else if ("Enter Coordinates (C)".equals(command))
		{
			g.drawString("Coordinates of the two outer points of the Circle",x-50,y);
			y+=25;
			g.drawLine(x-50, y, x+200, y);
			y+=25;
			g.drawString("First Point",x,y);
			g.drawString("= (" +Integer.toString(c.getX1C())+ "," +Integer.toString(c.getY1C())+ ")", x+90,y);
			y+=25;
			g.drawLine(x-50, y, x+200, y);
			y+=25;
			g.drawString("Second Point",x,y);
			g.drawString("= (" +Integer.toString(c.getX2C())+ "," +Integer.toString(c.getY2C())+ ")", x+90,y);
		}
		else if ("Diameter".equals(command))
		{
			g.drawString("The diameter of the circle based on the points:", x-25, y);
			y+=25;
			g.drawLine(x-25, y, x+200,y);
			y+=25;
			g.drawString("Diameter",x,y);
			g.drawString("= " +Double.toString(c.getDiameter()), x+90, y);
		}
		else if ("Radius".equals(command))
		{
			g.drawString("The radius of the circle based on the points:", x-25, y);
			y+=25;
			g.drawLine(x-25, y, x+200,y);
			y+=25;
			g.drawString("Radius",x,y);
			g.drawString("= " +Double.toString(c.getRadius()), x+90, y);
		}
		else if ("Circumference".equals(command))
		{
			g.drawString("The circumference of the circle:", x-25, y);
			y+=25;
			g.drawLine(x-25, y, x+200,y);
			y+=25;
			g.drawString("Circumference",x,y);
			g.drawString("= " +Double.toString(c.getCircumference()), x+90, y);
		}
		else if ("Area (C)".equals(command))
		{
			g.drawString("The area of the circle:", x-25, y);
			y+=25;
			g.drawLine(x-25, y, x+200,y);
			y+=25;
			g.drawString("Area",x,y);
			g.drawString("= " +Double.toString(c.getAreaC()), x+90, y);
		}
		else if ("All Properties (C)".equals(command))
		{			
			g.drawString("All the properties of the circle are:", x, y);
			y+=25;
			g.drawLine(x, y, x+140, y);
			y+=25;
			g.drawString("First Point",x,y);
			g.drawString("= (" +Integer.toString(c.getX1C())+ "," +Integer.toString(c.getY1C())+ ")", x+90,y);
			y+=25;
			g.drawString("Second Point",x,y);
			g.drawString("= (" +Integer.toString(c.getX2C())+ "," +Integer.toString(c.getY2C())+ ")", x+90,y);
			y+=25;
			g.drawString("Diameter",x,y);
			g.drawString("= " +Double.toString(c.getDiameter()), x+90, y);
			y+=25;
			g.drawString("Radius",x,y);
			g.drawString("= " +Double.toString(c.getRadius()), x+90, y);
			y+=25;
			g.drawString("Circumference",x,y);
			g.drawString("= " +Double.toString(c.getCircumference()), x+90, y);
			y+=25;
			g.drawString("Area",x,y);
			g.drawString("= " +Double.toString(c.getAreaC()), x+90, y);
		}
		else if ("Draw (C)".equals(command))
		{
			g.drawOval(x+c.getX1C(),y+c.getY1C(),cs,cs);			
		}
	}
	
	public static void main (String[] args)
	{
			Frame frame = new Project01();
			
			frame.setResizable(true);
			frame.setSize(550, 500);
			frame.setVisible(true);				
	}
}
	

