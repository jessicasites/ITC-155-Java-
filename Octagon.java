//*******************************************************************
// Assignment 0 
// Jessica Sites
// 4/20/20
// Write a class named Octagon whose object represents regular octagons.
// Class should implement a shape interface, including methods for its
// area and perimeter. Include test methods from the Client Main.
//*******************************************************************

public class Octagon extends Shape {
	
	private double side; 
	
	public Octagon (double side) {
		this.side=side;  
	}
	 public double getLength() {
			return side;
		}

		public void setLength(double side) {
			this.side = side;
		}
@Override
public double getPerimeter() {
	return 8*side;
}

@Override
public double getArea() {
	return (2+4/(Math.sqrt(2))*side*side);
}
}