/* Assignment 8.2 : Program to generate a user-defined exception called NegativeAgeException if user inputs
   negative value for age.
   Generating NegativeAgeException if user inputs negative value for age
*/

import java.util.*;

class NegativeAgeException extends Exception {	// User defined exception
	NegativeAgeException(String s){
		super(s);
	}
}

class InputAge {

	int age;

	public void inputAge() throws InputMismatchException {	// throws InputMismatchException for any incompatible inputs
	     try{
		System.out.print("Enter age: ");
		Scanner in = new Scanner(System.in);
		age = in.nextInt();		
			if (age < 0){
				throw new NegativeAgeException("Invalid Age! Cannot be negative!!");	// throw new user defined exception
			} else {System.out.println("You have entered age as " + age);}
		} catch(NegativeAgeException nae){System.out.println(nae); inputAge(); }	// catch to display exception and invoke inputAge method again
		  catch(Exception e){System.out.println("Invalid Input!"); inputAge(); }	// catch to display exception and invoke inputAge method again
	}
}

class AgeCheck {
	public static void main(String[] args) {
		InputAge ia = new InputAge();	// Object ia of class InputAge
		ia.inputAge();
	}
}