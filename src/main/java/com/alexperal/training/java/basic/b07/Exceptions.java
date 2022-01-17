package com.alexperal.training.java.basic.b07;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.zip.ZipException;

public class Exceptions {

	public static void main(String[] args) {
		//typesOfExceptions();
		//baseExample();
		//basics();
		//nesting();
		//throwsClause();
		//customException();

		//wrapping();
		//multiCatch();

		test();


		tryWithResources();

	}

	private static void tryWithResources() {
		try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("C:/myFile.txt"))) {
			System.out.println(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void test() {
		CinemaRoom cinemaRoom = new CinemaRoom();

		cinemaRoom.selectSeats(2, true);
		cinemaRoom.selectSeats(15, false);
		System.out.println(cinemaRoom);
		cinemaRoom.selectSeats(1, true);
		System.out.println(cinemaRoom);
		cinemaRoom.selectSeats(3, true);
		System.out.println(cinemaRoom);
	}

	static class CinemaRoom {
		int availableSeats = 20;

		public void selectSeats(int wantedSeats, boolean paymentSuccess) {
			if (availableSeats > wantedSeats) {
				int seatsToBook = 0;
				try {
					pay(paymentSuccess);
					seatsToBook = wantedSeats;
				} catch (IllegalStateException e) {
					System.out.println("Booking failed");
					seatsToBook = 0;
				} finally {
					availableSeats -= seatsToBook;
				}
				System.out.println("We have a new book for " + wantedSeats + " seats");
			} else {
				throw new IllegalArgumentException("There are not enough seats");
			}
		}

		private void pay(boolean paymentSuccess) {
			if (!paymentSuccess) {
				throw new IllegalStateException();
			}
		}

		@Override
		public String toString() {
			return "There are " + availableSeats + " available seats";
		}
	}

	private static void multiCatch() {
		try {
			System.out.println(method3(10, 120));
		} catch (IllegalArgumentException | IllegalStateException e) {
			System.out.println("You used wrong parameters");
		} catch (RuntimeException e) {
			System.out.println("There is a bug in the code");
			e.printStackTrace();
		}
	}

	private static int method3(int i, int j) {
		if (i > 10) {
			throw new IllegalArgumentException("i must be smaller than 10");
		}
		if (i + j > 100) {
			throw new IllegalStateException("The sum of the two parameters must be lower than 100");
		}
		int[] ints = new int[50];
		return ints[i + j];
	}

	private static void wrapping() {
		try {
			method1();
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

	public static void method1() {
		try {
			method2();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void method2() throws Exception {
		throw new Exception("HA HA");
	}

	private static void typesOfExceptions() {
		try {
			System.out.println(addUpTo(11));
		} catch (Exception exception) {
			exception.printStackTrace();
			System.out.println("Something wrong happened");
		} catch (StackOverflowError stackOverflowError) {
			stackOverflowError.printStackTrace();
			System.out.println("Something hugely wrong happened");
		} catch (Error error) {
			error.printStackTrace();
			System.out.println("Something ridiculously wrong happened");
		}
	}


	private static long addUpTo(int n) {
		if (n > 10) {
			throw new IllegalArgumentException(
					"I can't run with numbers greater than 10, I've got " + n);
		}
		long[] data = new long[6 * 1024 * 1024];//run with -Xmx256m
		if (n == 0) {
			return 0;
		}
		return n + addUpTo(n - 1);
	}


	private static void baseExample() {
		var baseSalary = 1000;//"select  baseSalary from salaries where employeeId = 1";
		var bonus = -100;//"select  bonus from salaries where employeeId = 1";
		var salary = sumTwoPositiveNumbers(baseSalary, bonus);
		System.out.println("You shall receive " + salary + " €");
	}

	private static int sumTwoPositiveNumbers(int a, int b) {
		try {
			assertNonNegative(a);
			assertNonNegative(b);
		} catch (RuntimeException exception) {
			throw new RuntimeException("The assertion failed, I got invoked with " + a + " , " + b,
					exception);
		}
		return a + b;
	}

	private static void assertNonNegative(int value) {
		if (value < 0) {
			throw new RuntimeException("The value " + value + " is negative");
		}
	}

	private static void basics() {
		Throwable throwable = new Throwable(
				"I am a basic throwable, I just have and stack trace, I shouldn't be used");
		Error error = new Error("I am an error, I inherit from throwable as well");
		Exception exception = new Exception("I am an exception, I inherit from throwable");
		RuntimeException runtimeException = new RuntimeException(
				"I am a runtime exception, I inherit from exception");

		List<Throwable> everythingIsAThrowable = List.of(throwable, error, exception,
				runtimeException);

		System.out.println(everythingIsAThrowable);

		try {
			// I can throw a throwable to interrupt the current flow
			throw throwable;
		} catch (Throwable e) {
			// I can catch the throwable if I surround it with a try catch statement
			e.printStackTrace();
		}

		try {
			System.out.println("hello");
			// do something
			// I should always use Exceptions or subclasses of it and I should never catch Throwable or Error
			throw exception;
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static void nesting() {
		// Try catches statements can be nested
		try {
			try {
				throw new IllegalArgumentException(
						"This is the common exception for bad arguments");
				//throw new IllegalStateException("This is the common exception for unreachable logic");
			} catch (IllegalArgumentException e) {
				// This will not capture the illegal state
				e.printStackTrace();
				throw e;
			}
		} catch (Exception e) {
			// This will capture everything
			e.printStackTrace();
		}
	}

	private static void throwsClause() {
		try {
			checkedExceptionMethod();
			checkedExceptionMethod2();
		} catch (ZipException e) {
			// This will only catch the ZipException
		} catch (IOException exception) {
			// Because ZipException is a subclass of IOException it will never be caught here
		}

		try {
			checkedExceptionMethod2();
			checkedExceptionMethod3();
		} catch (Exception e) {
			// You can catch multiple types of exceptions in the same catch clause
		}
	}

	private static void checkedExceptionMethod() throws IOException {
		// If a function throws an exception which is not a subclass of RuntimeException, you must specify it in the throws clause
		throw new IOException("Cannot open a file");
	}

	private static void checkedExceptionMethod2() throws ZipException {
		// If a function throws an exception which is not a subclass of RuntimeException, you must specify it in the throws clause
		throw new ZipException("Cannot open a file");
	}

	private static void checkedExceptionMethod3() throws MalformedURLException {
		// If a function throws an exception which is not a subclass of RuntimeException, you must specify it in the throws clause
		throw new MalformedURLException("Cannot open a file");
	}

	private static void customException() {
		try {
			throw new CustomException(500);
		} catch (CustomException e) {
			// I have to catch a custom exception cause it is a checked one
			e.printStackTrace();
			System.out.println("The custom code was" + e.customErrorCode);
		}
		// I dont need to cache the runtime one
		throw new CustomRuntimeException();

	}

	static class CustomException extends Exception {
		// I can have custom properties
		int customErrorCode;

		public CustomException(int customErrorCode) {
			this.customErrorCode = customErrorCode;
		}
	}

	static class CustomRuntimeException extends RuntimeException {
	}
}
