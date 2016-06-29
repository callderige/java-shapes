import javax.swing.JOptionPane;

public class Rectangle {
	
	private int x1,x2,x3;
	private int y1,y2,y3;
	private double width;
	private double length;
	private double perimeter;
	private double area;

	
	public Rectangle()
	{
		x1=x2=x3 = 0;
		y1=y2=y3 = 0;
		perimeter = 0.0;
		area = 0.0;
	}
	
	public void getCoordinatesR()
	{
		String input = JOptionPane.showInputDialog(null, "Enter the top left X1 coordinate:",
				"Enter top left X1",	JOptionPane.QUESTION_MESSAGE);
		x1 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Enter the top left Y1 coordinate:",
				"Enter top left Y1",	JOptionPane.QUESTION_MESSAGE);
		y1 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Enter the bottom right X2 coordinate:",
				"Enter bottom right X2",	JOptionPane.QUESTION_MESSAGE);
		x2 = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Enter the bottom right Y2 coordinate:",
				"Enter bottom right Y2",	JOptionPane.QUESTION_MESSAGE);
		y2 = Integer.parseInt(input);
		
		x3 = x1;
		y3 = y2;
		width = getWidthR();
		length = getLengthR();
		perimeter = getPerimeterR();
		area = getAreaR();
	}
	public int getX1R()
	{
		return x1;
	}
	
	public int getX2R()
	{
		return x2;
	}
	
	public int getY1R()
	{
		return y1;
	}
	
	public int getY2R()
	{
		return y2;
	}
	
	public int getX3R()
	{
		return x3;
	}
	
	public int getY3R()
	{
		return y3;
	}
	
	public double getWidthR()
	{
		return width = Math.round(100*Math.pow( Math.pow((double)(x2-x3),2.0)+Math.pow( (double)(y2-y3),2.0) , 0.5))/100.0;
	}
	
	public double getLengthR()
	{
		return length = Math.round(100*Math.pow( Math.pow((double)(x1-x3),2.0)+Math.pow( (double)(y1-y3),2.0) , 0.5))/100.0;
	}
	
	public double getPerimeterR()
	{
		return perimeter = ((width*2)+(length*2));
	}
	
	public double getAreaR()
	{
		return area = width*length;
	}
}
	


