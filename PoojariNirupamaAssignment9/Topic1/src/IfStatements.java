import java.util.Scanner;


public class IfStatements {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// "if" statements evaluate the code inside the parenthesis after the
		// if. If that code evaluates to true, the code inside the curly
		// braces { and } is executed. If the code in the parenthesis evaluates
		// to false, the code inside the curly braces is skipped.
		
		// For example, this code checks to see if the temperature entered by
		// the user is above freezing.
		System.out.println("What is the current temperature in Farenheit? ");
		double temperature = input.nextDouble();
		
		if (temperature < 32) {
			System.out.println("It is below freezing!");
			System.out.println(); // prints an empty line
		}
		
		// There are various types of expression that you can put inside the 
		// parenthesis. The simplest is a boolean value or variable.
		
		boolean isValid = true;
		if (isValid) {
			System.out.println("We can proceed\n");
			// The \n at the end is another way to print an empty line
		}
		
		// There are also relational operators, as we saw in the temperature
		// example. Relational operators look at the relation between the thing
		// on the left and the thing on the right of the operator. The relation
		// operators are:
		// < less than
		// > greater than
		// <= less than or equal to
		// >= greater than or equal to
		// == equals (notice you need TWO equals sign, just one is used for assignment)
		// != not equal
		
		// This code checks to see if a person is senior citizen
		System.out.println("How old are you? ");
		int age = input.nextInt();
		if (age >= 65) {
			System.out.println("Congrats! You are eligible for a senior discount.");
		}
		
		// In addition to relational operators, there are also logical operators.
		// The three logical operators are:
		// && AND
		// || OR (this is the symbol above the backslash on the keyboard, called a "pipe")
		// ! NOT
		
		// && is true if BOTH the thing on the left AND the thing on the right of the && 
		// symbol is true.
		
		// || is true if EITHER the thing on the left OR the thing on the right of the || 
		// symbol is true.
		
		// ! reverses the value. If you put ! in front of something that is true, it 
		// becomes false. If you put ! in front of something that is false, it becomes true.
		
		// This code determines if the person must pay full price because they are
		// neither a child nor a senior. We can translate as "if the person is NOT
		// either less than or equal to twelve years old OR greater than or equal to
		// 65 years old, they must pay full price.
		if (!(age <= 12 || age >= 65)) {
			System.out.println("You must pay full price.");
		}
		
		// You can also add an "else" clause to your if statements. The code inside the 
		// curly braces following the else will be executed if the condition is false.
		if (age >= 18) {
			System.out.println("You are old enough to vote.\n");
		} else {
			System.out.println("You can vote in " + (18-age) + " more years.\n");
		}
		
		// You can also nest if-else statement. This code determines if a person is
		// required to register for the Selective Service (the "draft"). This is the 
		// case for males who are at least 18 years old.
		System.out.println("Are you male? ");
		String answer = input.next();
		boolean male = answer.equalsIgnoreCase("Yes");
		
		if (male) {
			if (age >= 18) {
				System.out.println("You need to be registered for the Selective Service.");
			} else {
				System.out.println("You need to register for the Selective Service in " + 
						(18 - age) + " years.");
			}
		} else {
			System.out.println("You do not need to register for the Selective Service.");
		}
	}
}
