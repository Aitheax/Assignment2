/**Program takes in 5 numbers and outputs the sum, average, max, min, median, and mode
 * of the 5 numbers
 * @author Greg Smith
 * Date:8/17/14
 * Pseudo: 1.Initialize variables for med,max,min,sum,average and an array to hold the numbers
 * 2.Prompt user for 5 numbers
 * 3.Read into the array with for loop
 * 4.
 */
package Assignment2;

import java.util.*;

public class FiveNumbers {

	public static void main(String[] args) {
		int average, sum, max, min, median, mode;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 5 whole numbers: ");
		int[] n = new int[5];
		for (int i = 0; i < 5; i = i + 1) {
			n[i] = scan.nextInt();
		}
		
		
		
		boolean flag = true;
		int temp = 0;
		while (flag) {
			flag = false;

			for (int j = 0; j < n.length - 1; j++) {
				if (n[j] > n[j + 1]) {
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
					flag = true;
				}
			}
		
		}
		median = n[2];
		max = n[4];
		min = n[0];
		//mode = 0; TODO
		average = (n[0] + n[1] + n[2] + n[3] + n[4]) / 5;
		sum = (n[0] + n[1] + n[2] + n[3] + n[4]);
		for (int i = 0; i < 5;i++) {
			System.out.print(n[i] + " ,");
		}
		System.out.println("The average of the numbers is: " + average);
		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("The median is: " + median);
		System.out.println("The max is: " + max);
		System.out.println("The min is: " + min);
	}
}
