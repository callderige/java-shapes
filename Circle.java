import javax.swing.JOptionPane;

public class Circle {
	
	private int x1,x2;
	private int y1,y2;
	private double radius;
	private double diameter;
	private double circumference;
	private double area;
	final private double pi = 3.14159;
	
	public Circle()
	{
		x1=x2 = 0;
		y1=y2 = 0;
		radius = 0.0;
		diameter = 0.0;
		circumference = 0.0f;
		area = 0.0f;
	}
	
	public void getCoordinatesC()
	{
		String input = JOptionPane.showInputDialog(null, "Enter coordinate X1:",
				"Enter X1",	JOptionPane.QUESTION_MESSAGE);
		x1 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Enter coordinate Y1:",
				"Enter Y1",	JOptionPane.QUESTION_MESSAGE);
		y1 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Enter coordinate X2:",
				"Enter X2",	JOptionPane.QUESTION_MESSAGE);
		x2 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Enter coordinate Y2:",
				"Enter Y2",	JOptionPane.QUESTION_MESSAGE);
		y2 = Integer.parseInt(input);
		
		diameter = getDiameter();
		radius = getRadius();
		circumference = getCircumference();
		area = getAreaC();
	}
	
	public int getX1C()
	{
		return x1;
	}
	
	public int getX2C()
	{
		return x2;
	}
	
	public int getY1C()
	{
		return y1;
	}
	
	public int getY2C()
	{
		return y2;
	}
	
	public double getDiameter()
	{
		return diameter = Math.round(100*Math.pow( Math.pow((double)(x1-x2),2.0)+Math.pow( (double)(y1-y2),2.0) , 0.5))/100.0;
	}
	
	public double getRadius()
	{
		return radius = diameter/2;
	}
	
	public double getCircumference()
	{
		return circumference = Math.round(2*radius*pi);
	}
	
	public double getAreaC()
	{
		return area = Math.round(radius*radius*pi);
	}
}
