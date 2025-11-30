import java.util.Scanner;


public class Loops {
	
	public static void main(String[] args) {
		
		// "for" loops are generally used when you know ahead of time how many
		// times a loop needs to execute
		
		// The for loop header can be a little bit confusing -- it has three
		// parts, separated by semicolons. The first section declares and 
		// initializes the loop control variable. The second section contains
		// the condition that will stop the loop from executing. The third 
		// section specifies how the value of the loop control variable will
		// be changed with each pass through the loop.
		
		// This code asks the user for two values and then computes the sum 
		// of all of the numbers between the first value and the second. For 
		// instance, if the user enters 5 and 10, this loop will compute
		// 5 + 6 + 7 + 8 + 9 + 10
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int lower = input.nextInt();
		
		System.out.println("Enter another integer, higher than the first one: ");
		int upper = input.nextInt();
		
		int sum = 0;
		
		for (int i=lower; i<=upper; i++) {
			sum = sum + i;
		}
		
		System.out.println("The sum from " + lower + " to " + upper + " is " + sum);
		
		System.out.println("\n\n");
		
		// This loop counts down by twos from 10 to 0
		for (int i=10; i>=0; i=i-2) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n\n");
		
		// A "while" loop is often used in cases where the programmer doesn't
		// know how many times the loop needs to iterate
		
		// This loop sums all of the values that a user enters. The user can 
		// enter zero to quit.
		sum = 0;
		double value = -1;
		
		System.out.println("I will compute the sum of the values you enter. " + 
				"What is the first number? (Enter 0 to quit) ");
		value = input.nextDouble();
		
		while (value != 0) {
			sum += value;
			System.out.println("What is the next number? (Enter 0 to quit) ");
			value = input.nextDouble();
		}

		System.out.println("The sum is " + sum);
	}
}
