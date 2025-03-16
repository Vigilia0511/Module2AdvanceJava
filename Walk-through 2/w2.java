import java.util.Scanner;
import java.util.Random;

public class w2 {
    public static void main(String[] args) {

        //1. Modify the program to check if a number is even or odd.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number please:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num +" is even number");
        }else{
            System.out.println(num + " is odd number");
        }



        System.out.println(" ");
        //2. Create a switch-case program that displays the name of a day based on a number input (1 for Monday, 2 for Tuesday, etc.).
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7 to get the corresponding day: ");
        int day = sc2.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;        
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }



        System.out.println(" ");
        //3. Use a while loop to print numbers from 10 to 1.
        int number = 10;

        while (number >= 1) {
            System.out.println("Number: " + number);
            number--;
        }



        System.out.println(" ");
        //1. Create a guessing game where the user has to guess a random number.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(10) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to Guessing Game!");
        System.out.println("I have chosen a number between 1 and 10. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNum) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNum) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != randomNum);




        System.out.println(" ");
        //2. Implement a do-while loop that keeps asking for input until the user enters “exit”
        Scanner scanner2 = new Scanner(System.in);
        Random random2 = new Random();

        boolean playAgain = true; 

        while (playAgain) {
            int randomNum1 = random2.nextInt(10) + 1; 
            int attempts1 = 0;
            int guess1 = -1;
            String input;

            System.out.println("\nWelcome to the Guessing Game!");
            System.out.println("I have chosen a number between 1 and 10. Try to guess it!");
            System.out.println("Type 'exit' to quit the game at any time.");

            do {
                System.out.print("Enter your guess (or type 'exit' to quit): ");
                input = scanner2.next(); 

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("You exited the game. The correct number was: " + randomNum1);
                    playAgain = false;
                    break; 
                }

                try {
                    guess1 = Integer.parseInt(input); 
                    attempts1++;

                    if (guess1 > randomNum) {
                        System.out.println("Too high! Try again.");
                    } else if (guess1 < randomNum) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("🎉 Congratulations! You guessed the number in " + attempts1 + " attempts.");
                        break; 
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number between 1 and 10 or type 'exit' to quit.");
                }
            } while (guess1 != randomNum);

            if (playAgain) {
                System.out.print("Do you want to play again? (y/n): ");
                char response = scanner2.next().toLowerCase().charAt(0);
                if (response != 'y') {
                    playAgain = false;
                    System.out.println("Thanks for playing! Goodbye!");
                }
            }
        }
        scanner2.close();

    }
}