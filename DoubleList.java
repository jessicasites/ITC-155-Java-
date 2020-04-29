import java.util.ArrayList;

/*Assignment 3
 * Jessica Sites 
 * 4/20/20
	* Write a method doubleList that takes an ArrayList of Strings as a 
	* parameter and that replaces every string with two of that string. 
	*/
public class DoubleList {
	
public static void main(String[] args) {
		
	}
	
public static void doubleList (ArrayList<String> list) {
	for (int i = list.size() -1; i >=0; i--) {
		String s = list.get(i);
		list.add(i, s);
	}
}
}