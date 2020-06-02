
///*****************************************************************************************
// ITC 155 - WEEK 7
// Jessica Sites 
// 5/30/20
//Write a method isPalindrome that takes a queue of integers as a parameter and returns 
//true if the numbers in the queue represent a palindrome (and false otherwise). 
//A sequence of numbers is considered a palindrome if it is the same in reverse order. 
//For example, suppose a queue called q stores these values: front [3, 8, 17, 9, 17, 8, 3]
//back. Then the call of isPalindrome(q); should return true because this sequence is the 
//same in reverse order. If the queue had instead stored these values:
//front [3, 8, 17, 9, 4, 17, 8, 3] back
//The call on isPalindrome would instead return false because this sequence is not the 
//same in reverse order (the 9 and 4 in the middle don't match). The empty queue should be 
//considered a palindrome. You may not make any assumptions about how many elements are in 
//the queue and your method must restore the queue so that it stores the same sequence of 
//values after the call as it did before. You may use one stack as auxiliary storage.
//******************************************************************************************
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class isPalindrome {

	public static boolean isPalindrome(Queue<Integer> q) {
		Stack<Integer> s = new Stack<Integer>();
		int size = q.size();
		boolean palindrome = true;

		for (int i = 0; i < size; i++) {
			int n = q.remove();
			q.add(n);
			s.push(n);
		}

		for (int i = 0; i < size; i++) {
			int n1 = q.remove();
			int n2 = s.pop();

			if (n1 != n2)
				palindrome = false;

			q.add(n1);
		}

		return palindrome;
	}

	public static void main(String[] args) {

		Queue<Integer> queue1 = new LinkedList<>();
		queue1.add(3);
		queue1.add(8);
		queue1.add(17);
		queue1.add(9);
		queue1.add(17);
		queue1.add(8);
		queue1.add(3);
		System.out.println(isPalindrome(queue1));

		Queue<Integer> queue2 = new LinkedList<>();
		queue2.add(3);
		queue2.add(8);
		queue2.add(17);
		queue2.add(9);
		queue2.add(4);
		queue2.add(17);
		queue2.add(8);
		queue2.add(3);
		System.out.println(isPalindrome(queue2));

	}
}