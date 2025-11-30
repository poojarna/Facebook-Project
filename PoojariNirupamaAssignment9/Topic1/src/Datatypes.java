import java.util.Arrays;
import java.util.Scanner;


public class Datatypes {
	
	public static void main(String[] args) {
		
		// primitive data types
		
		// Whole numbers (i.e. numbers without a decimal point) are normally
		// stored as "integers". If the variable needs to be able to hold
		// very large numbers, use a "long".
		int age = 35;
		long nationalDebt = 17214598778370L; // "L" at the end indicates a long

		// Decimal numbers are normally stored as "doubles". If the variable 
		// will not hold values with a lot of digits to the right of the
		// decimal point, you can use a "float" instead.
		double gpa = 3.14789345;
		float restaurantBill = 17.45f; // "f" at the end indicates a float
		
		// Variables of type "boolean" can hold one of two values: true or
		// false
		boolean isRaining = true;
		
		// Individual characters (letters, digits, or punctuation) can be 
		// stored as a "char", while multiple characters must be stored as
		// "Strings". String starts with a capital letter because it is a 
		// class (with methods that can be called on it).
		char grade = 'A'; // characters are specified using single quotes
		char period = '.';
		char place = '2';
		
		String name = "Michelle"; // Strings are in double quotes
		String school = "Sinclair Community College";
		
		// String manipulation
		String example = "Ask not what your country can do for you...";
		System.out.println("original: " + example);
		
		// Strings know how long they are
		System.out.println(example + " has " + example.length() + " characters");
		
		// You can access individual characters (the numbering starts at 0,
		// so the third character is at index 2)
		System.out.println("The third character is " + example.charAt(2));
		
		// Making a string all upper or lower case is straightforward...
		System.out.println("upper case: " + example.toUpperCase());
		System.out.println("lower case: " + example.toLowerCase());
		
		// We can get out a single word if we know where it begins and ends in
		// the string. Keep in mind that the first character is at position 0,
		// not 1.
		String piece = example.substring(4, 7);
		System.out.println("The piece starting at index 4 and ending before 7 is "
				+ piece);
		
		// You can also find out if a string starts or ends with a particular
		// series of characters
		String filename = "myFile.txt";
		if (filename.endsWith("txt")) {
			System.out.println(filename + " is probably a text file");
		}
		
		// You can also concatenate two strings together
		String wholePhrase = example + " but what you can do for your country!";
		System.out.println("whole phrase: " + wholePhrase);
		
		// You can use the trim method to remove any leading and trailing white
		// space.
		String college = "     Sinclair Community College          ";
		System.out.println("*****" + college + "****");
		System.out.println("trimmed, we get *****" + college.trim() + "****");
		
		System.out.println("\n\n"); // print a few empty lines to the console
		
		// arrays
		
		// Arrays are variables that hold a list of values rather than just one.
		// All of the values in an array must have the same data type. Once you
		// create an array, its size can never be changed.
		
		// Here we declare an array large enough to hold five integers
		int[] numbers = new int[5];
		
		// Now we prompt the user to enter five numbers to store in the array
		System.out.println("Enter five whole numbers, separated by spaces " + 
				"(press <Enter> when you are done: ");
		
		Scanner input = new Scanner(System.in); // used to read in input
		
		// We normally use "for" loops when working with arrays. See the "Loops"
		// class for more information.
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("The first number you entered was " + numbers[0]);
		System.out.println("The last number you entered was " + numbers[numbers.length-1]);
		
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("The sum of all of the numbers you entered is " + sum);
		
		// Arrays can store anything we want, not just integers. This array stores
		// three Strings
		String[] fruit = new String[3];
		fruit[0] = "orange";
		fruit[1] = "apple";
		fruit[2] = "banana";
		
		// A shortcut way to print out an array is
		System.out.println("The fruit is " + Arrays.toString(fruit));
		
		// And we can sort arrays easily too
		Arrays.sort(fruit);
		System.out.println("In alphabetical order " + Arrays.toString(fruit));
	}
}
