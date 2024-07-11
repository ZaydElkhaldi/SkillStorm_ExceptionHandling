package exceptions;

import java.util.IllegalFormatException;
import java.util.Scanner;
import java.util.Random;

// default primitive types
// byte - 0
// short - 0
// char - 0
// int - 0
// double - 0
// float - 0
// boolean - false


public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Potato babyPotato = new Potato();
        babyPotato.setName("Baby Potato");

        System.out.println("Code was executed properly");
        float x = 1;
        float y = 0;

        try {
            System.out.println(x/y);
            System.out.printf("x = %b, y = %d\n ", x, y);
        } catch (ArithmeticException | IllegalFormatException e) {
            System.out.println(e.getLocalizedMessage());
        }



        // Guess a num 1-10:
        System.out.println();
        System.out.println("Guess a number between 1-10");
        int guess = scanner.nextInt();

        int answer = new Random().nextInt(10) + 1; // gives me a range of 0-10 by overloading nextInt
        answer++;

        if (guess == answer) {
            System.out.println("Congratulations! You guessed it!");
        } else {
            System.out.printf("Sorry, but you didnt get it! The correct number is: %d%n", answer);
        }
    }

    public void example1() {
        // Types of exceptions
        // Checked Exceptions - you are required to handle them or specify
        // Unchecked Exceptions - these are runtime exeptions in the inheritance heiracrhy
        int x = 1;


        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void example2() {
        // Types of exceptions
        // Checked Exceptions - you are required to handle them or specify
        // Unchecked Exceptions - these are runtime exeptions in the inheritance heiracrhy
        // Can use multiple catch blocks, but only one will be executed, whichever one happens first\
        // using a finally block runs whatever code is in there regardless of the exception handling
        int x = 1;
        int y = 0;

        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}