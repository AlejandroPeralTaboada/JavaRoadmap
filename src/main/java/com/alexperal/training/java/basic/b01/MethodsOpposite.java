package com.alexperal.training.java.basic.b01;

public class MethodsOpposite {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		System.out.println("A method is a collection of lines of code");
		System.out.println("Some methods return something, others don't");
		System.out.println(
				"The method called on the above line is doing nothing as I am not doing anything with its result");
		System.out.println();
		System.out.println("I can store a method result in a variable and use it");
		String s = "String";
		System.out.println("Like this: " + s);
		System.out.println("I can also use the return of the method directly");
		System.out.println("Like this: " + "String");
		System.out.println();
		System.out.println("A method can receive parameters, you declare them like variables");
		System.out.println("Parameter" + " something else");
		System.out.println("Another Parameter" + " something else");
		String fromVariable = "Parameters comes from a variable";
		System.out.println(fromVariable + " something else");
		System.out.println();
		System.out.println("I can also chain methods inside methods");
		System.out.println(("Chained" + " something else") + " something else");
		System.out.println();
		System.out.println("I can have multiple parameters");
		System.out.println("Reapeat this 2 times ".repeat(2));
		System.out.println("Reapeat this more times ".repeat(3));
		System.out.println();
		System.out.println("Methods help use tidy our code, It makes it more readable and easier to understand");

	}

}
