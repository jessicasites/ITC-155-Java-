
//*****************************************************************************************
// ITC 155 - WEEK 7
// Jessica Sites 
// 5/30/20
//Write a method stutter that takes a stack of integers as a parameter and replaces every value
//in the stack with two occurrences of that value. For example, suppose the stack stores these 
//values: bottom [3, 7, 1, 14, 9] top Then the stack should store these values after the method 
//terminates: bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top Notice that you must preserve the original
//order. In the original list the 9 was at the top and would have been popped first. In the new stack 
//the two 9s would be the first values popped from the stack. You may use a single queue as auxiliary 
//storage to solve this problem.
//******************************************************************************************
import java.util.*;

public class Stutter {

	public static void main(String[] args) {

		Stack<Integer> test = new Stack<>();
		test.push(3);
		test.push(7);
		test.push(1);
		test.push(14);
		test.push(9);

		System.out.println("First Stack: " + test);
		stutter(test);
		System.out.println("New Stack: " + test);
	}

	public static void stutter(Stack<Integer> s) {
		Queue<Integer> q = new LinkedList<Integer>();

		while (!s.isEmpty()) {
			int num = s.pop();
			q.add(num);
			q.add(num);
		}

		while (!q.isEmpty()) {
			s.push(q.remove());
		}

		while (!s.isEmpty()) {
			q.add(s.pop());
		}

		while (!q.isEmpty()) {
			s.push(q.remove());
		}
	}
}