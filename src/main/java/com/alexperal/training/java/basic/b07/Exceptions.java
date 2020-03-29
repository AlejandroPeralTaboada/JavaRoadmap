package com.alexperal.training.java.basic.b07;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.zip.ZipException;

public class Exceptions {

    public static void main(String[] args) {
        basics();
        nesting();
        throwsClause();
        customException();
    }


    private static void basics() {
        Throwable throwable = new Throwable("I am a basic throwable, I just have and stack trace, I shouldn't be used");
        Error error = new Error("I am an error, I inherit from throwable as well");
        Exception exception = new Exception("I am an exception, I inherit from throwable");
        RuntimeException runtimeException = new RuntimeException("I am a runtime exception, I inherit from exception");

        List<Throwable> everythingIsAThrowable = List.of(throwable, error, exception, runtimeException);

        System.out.println(everythingIsAThrowable);

        try {
            // I can throw a throwable to interrupt the current flow
            throw throwable;
        } catch (Throwable e) {
            // I can catch the throwable if I surround it with a try catch statement
            e.printStackTrace();
        }

        try {
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
                throw new IllegalArgumentException("This is the common exception for bad arguments");
                //throw new IllegalStateException("This is the common exception for unreachable logic");
            } catch (IllegalArgumentException e) {
                // This will not capture the illegal state
                e.printStackTrace();
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
        } catch (ZipException | MalformedURLException e) {
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
