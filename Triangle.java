import javax.swing.JOptionPane;

public class Triangle {
		
			private int x1, x2, x3;
			private int y1, y2, y3;
			private double side1 = 0.0;
			private double side2 = 0.0;
			private double side3 = 0.0;
			private double perimeter;
			private double area;
			
			public Triangle()
			{
				x1=x2=x3 = 0;
				y1=y2=y3 = 0;
				perimeter = 0.0f;
				area = 0.0f;
			}
			
			public void getCoordinatesT()
			{
				String input = JOptionPane.showInputDialog(null, "Please enter an integer:",
						"Enter X1",	JOptionPane.QUESTION_MESSAGE);
				x1 = Integer.parseInt(input);
				
				input = JOptionPane.showInputDialog(null, "Please enter an integer:",
						"Enter Y1",	JOptionPane.QUESTION_MESSAGE);
				y1 = Integer.parseInt(input);
				
				input = JOptionPane.showInputDialog(null, "Please enter an integer:",
						"Enter X2",	JOptionPane.QUESTION_MESSAGE);
				x2 = Integer.parseInt(input);
				
				input = JOptionPane.showInputDialog(null, "Please enter an integer:",
						"Enter Y2",	JOptionPane.QUESTION_MESSAGE);
				y2 = Integer.parseInt(input);
				
				input = JOptionPane.showInputDialog(null, "Please enter an integer:",
						"Enter X3",	JOptionPane.QUESTION_MESSAGE);
				x3 = Integer.parseInt(input);
				
				input = JOptionPane.showInputDialog(null, "Please enter an integer:",
						"Enter Y3",	JOptionPane.QUESTION_MESSAGE);
				y3 = Integer.parseInt(input);

				side1 = getSide1();
				side2 = getSide2();
				side3 = getSide3();
				perimeter = getPerimeter();
				area = getArea();
			}
			
			public int getX1()
			{
				return x1;

			}
			public int getX2()
			{
				return x2;

			}
			public int getX3()
			{
				return x3;

			}
			public int getY1()
			{
				return y1;

			}
			public int getY2()
			{
				return y2;

			}
			public int getY3()
			{
				return y3;
			}

			public double getSide1()
			{
				return side1 = Math.round(100*Math.pow( Math.pow((double)(x1-x2),2.0)+Math.pow( (double)(y1-y2),2.0) ,0.5))/100.0;
			}
			
			public double getSide2()
			{
				return side2 = Math.round(100*Math.pow( Math.pow((double)(x1-x3),2.0)+Math.pow( (double)(y1-y3),2.0) ,0.5))/100.0;
			}
			
			public double getSide3()
			{
				return side3 = Math.round(100*Math.pow( Math.pow((double)(x2-x3),2.0)+Math.pow( (double)(y2-y3),2.0) ,0.5))/100.0;
			}
			
			public double getPerimeter()
			{
				return Math.round(side1+side2+side3);
			}
			
			public double getArea()
			{
				double s = (side1+side2+side3)/2;
				return area = Math.round(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
				
			}
		}
