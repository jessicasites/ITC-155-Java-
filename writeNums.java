// Assignment 5 
// Jessica Sites
// 5/10/20
// Write a method writeNums that accepts an integer parameter n and prints the first n integers 
// starting with 1 in sequential order, separated by commas.

public class writeNums {

	public static void main(String[] args) {
		writeNums(2);
		System.out.println();
		writeNums(5);
		System.out.println();
		writeNums(12);
        System.out.println();
    }
	public static void writeNums(int n) {
	    if (n<1) {
	        throw new IllegalArgumentException();
	    } else if (n==1) {
	        System.out.print("1");
	    } else {
	        writeNums(n-1);
	        System.out.print(", " + n);
	    }
	}
}
