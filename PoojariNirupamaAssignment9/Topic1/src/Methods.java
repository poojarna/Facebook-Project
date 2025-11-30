
public class Methods {
	
	// It's generally a good idea to organize your programs into methods so
	// that the code is easier to understand, test, debug, and reuse.
	
	// The first line in a method is called the "signature", and the code in
	// between the { and } after the signature is called the "body". The body
	// is what the method actually does.
	
	// The signature has several parts: the access modifier (public or private)
	// which controls where the method can be called from, the return type (int,
	// double, String, etc) that specifies what type of value a method returns.
	// A method can return at most one value. If it doesn't need to return
	// anything, the return type is "void". Next comes the method's name. By
	// convention, method names start with a lower case letter and are written 
	// in camelCase. Finally, we have the argument (or parameter) list in
	// parentheses. Methods only know about the variables that you pass into
	// them as parameters.
	
	// The keyword "static" means that a variable or method applies to *all*
	// instances of a class. For instance, if you are writing a school
	// registration program and you know that it is only for Sinclair students,
	// then the String school field could be static. If you are writing a method
	// that doesn't depend on any class instance values, you can make that method
	// static. A common mistake among beginning Java programmers is to make 
	// everything static as a shortcut way to get rid of syntax errors.
	
	// Ok, now to actually get to the point. This method finds the average
	// value of all numbers in an array. The method is public, so it can be
	// called from everywhere. It's return type is double, because it returns
	// the average value. It's name is arrayAverage. It takes one parameter: an
	// array of doubles called theArray.
	public double arrayAverage(double[] theArray) {
		double sum = 0;
		for (double d: theArray) {
			sum += d;
		}
		return sum / theArray.length;
	}
	
	
	public static void main(String[] args) {
		
		// To call the arrayAverage method, I need to create an instance of the
		// class that the method is in, which in this case is "Methods".
		Methods methodObj = new Methods();
		
		// Then I need a double array to pass to the arrayAverage method. Notice that
		// the array is called "values" here instead of "theArray". The arrayAverage 
		// method can't see any of the variables outside of itself. I cannot 
		// refer to "values" inside of the arrayAverage method. So it doesn't
		// matter what I call the variable out here in main. When I call arrayAverage,
		// a copy of the "values" pointer will be made, named "theArray" and
		// passed to the arrayAverage method.
		double[] values = {4.82, 5.9, 2, 5, 11.2, 13};
		
		// Here is how to call the method. Notice that I need to assign its
		// return value to a variable. Otherwise, I've done all that work for
		// nothing!
		double avgValue = methodObj.arrayAverage(values);
		
		System.out.println("The average is " + avgValue);
	}

}
