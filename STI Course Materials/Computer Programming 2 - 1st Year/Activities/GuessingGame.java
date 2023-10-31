package com.mycompany.guessinggame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
 public static void main(String[] args) {

        Random r = new Random();
        
        int randomNum = r.nextInt(50) + 1;
            
        Scanner scanner = new Scanner(System.in);

        int guessCount = 0; 

        while (true) {
            try {
                System.out.print("Enter your guess (between 1 and 50): ");
                int guess = scanner.nextInt();
                scanner.nextLine(); 
                
                guessCount++;

                if (guess == randomNum) {
                    System.out.println(randomNum + " is Correct! You're great");
                    break;
                } else if (guess < 1 || guess > 50) {
                    throw new IllegalArgumentException("Guess out of range. Please try again.");
                } else if (guess < randomNum) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Total guesses: " + guessCount);

    }
}