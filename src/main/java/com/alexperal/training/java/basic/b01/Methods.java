package com.alexperal.training.java.basic.b01;

public class Methods {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		whatIsAMethod();
		whyShouldWeUseMethods();

	}

	private static void whyShouldWeUseMethods() {
		System.out.println("Methods help use tidy our code, It makes it more readable and easier to understand");
	}

	private static void whatIsAMethod() {
		System.out.println("A method is a collection of lines of code");
		whatAreReturnTypes();
		System.out.println();
		whatsThePurpuseOfParameters();
		System.out.println();
	}

	private static void whatAreReturnTypes() {
		System.out.println("Some methods return something, others don't");
		thisMethodReturnsAsString();
		System.out.println(
				"The method called on the above line is doing nothing as I am not doing anything with its result");
		System.out.println();
		System.out.println("I can store a method result in a variable and use it");
		String s = thisMethodReturnsAsString();
		System.out.println("Like this: " + s);
		System.out.println("I can also use the return of the method directly");
		System.out.println("Like this: " + thisMethodReturnsAsString());
		return;
	}

	private static String thisMethodReturnsAsString() {
		return "String";
	}

	private static void whatsThePurpuseOfParameters() {
		System.out.println("A method can receive parameters, you declare them like variables");
		System.out.println(methodWithOneParameter("Parameter"));
		System.out.println(methodWithOneParameter("Another Parameter"));
		String fromVariable = "Parameters comes from a variable";
		System.out.println(methodWithOneParameter(fromVariable));
		System.out.println();
		System.out.println("I can also chain methods inside methods");
		System.out.println(methodWithOneParameter(methodWithOneParameter("Chained")));
		System.out.println();
		System.out.println("I can have multiple parameters");
		int reapeatOption = 2;
		System.out.println(methodWithTwoParameter("Reapeat this 2 times ", reapeatOption));
		System.out.println(methodWithTwoParameter("Reapeat this more times ",3));

	}

	private static String  methodWithOneParameter(String parameter) {
		return parameter+" something else";
	}

	private static String  methodWithTwoParameter(String parameter1,int parameter2) {
		parameter2++;
		return parameter1.repeat(parameter2);
	}

}
