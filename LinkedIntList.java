
// ITC 155 - WEEK 8
// Jessica Sites 
// 6/8/2020
//Write a method isSorted that returns true if the list is in sorted 
//(nondecreasing) order and returns false otherwise. An empty list is
//considered to be sorted.
//Assume that you are adding this method to the LinkedIntList class as 
//defined below:
//public class LinkedIntList {
//private ListNode front;   // null for an empty list
//********************************************************************************
import java.util.*;

public class LinkedIntList {

	private ListNode front;

	public boolean isSorted() {
		ListNode pre = front;

		if (front == null) {
			return true;
		}

		while (pre.next != null) {
			ListNode current = pre.next;
			if (current.data < pre.data) {
				return false;
			}
			pre = current;
		}

		return true;
	}

	public static void main(String[] args) {

	}
}