import java.util.Arrays;

/*  ITC 155 - ASSIGNMENT 6 - COMPLEXITY CLASSES 
* Jessica Sites 
* 5/16/20
* p. 888 ex. 4, 5 Complexity classes. Be sure to explain your reasoning for full credit. 
* Write the answers as comments on top of your java file where you solved the following problem. - 40 points
* Code a solution and a test for p. 890, ex 18 Write a modified version sort a selection sort algorithm - 60 points 
***********************************************************************************
 * Example 4 = O(N) because it has a for loop and N will double
 * public static int[] mystery1(int[] list) { int[] result = new int[2 * list.length]; for (int i = 0; i < list.length; i++) {
           result[2 * i] = list[i] / 2 + list[i] % 2;
           result[2 * i + 1] = list[i] / 2;
       }
       return result;
   }
 ***********************************************************************************
 *Example 5 = O(N) because of the for loop making it linear  
 *public static void mystery2(int[] list) {
 *for (int i = 0; i < list.length / 2; i++) {
 *int j = list.length – 1 – i; int temp = list[i];
 *list[i] = list[j];
 *list[j] = temp;
 *} }
 ***********************************************************************************
*Code a solution and a test for p. 890, ex 18 
*Write a modified version sort a selection sort algorithm - 60 points */

public class ComplexityClasses {

	public static void main(String[] args) {
		int [] nums = {4,5,2,5,3,2,6,1,9};
		modifiedSelectionSort(nums);
		for(int n : nums) {
			System.out.print(n+" ");
		}
	}
	
public static void modifiedSelectionSort(int[] array) {
	for (int i = array.length-1; i >= 0; i--) {
		int largest = i;
		for (int j = i-1; j >= 0; j--) {
			if (array[j] > array[largest]) {
				largest = j;
			}
		}
		swap(array, i, largest);
	}
}

public static void swap(int[] array, int i, int j) {
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
}

}


