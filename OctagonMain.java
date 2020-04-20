//*******************************************************************
// Assignment 0 
// Jessica Sites
// 4/20/20
// Write a class named Octagon whose object represents regular octagons.
// Class should implement a shape interface, including methods for its
// area and perimeter. Include test methods from the Client Main.
//*******************************************************************
public class OctagonMain {
	public static void main(String[] args) {

		Octagon octagon1 = new Octagon(3);
		
		System.out.println(octagon1.getArea());
		
		System.out.println(octagon1.getPerimeter());
	}

}


