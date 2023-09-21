package src.main.java.Sections.Section4;

import java.util.Scanner;

public class DiceJack {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter three numbers between 1 and 6: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(isLessThanOne(num1, num2, num3) || isGrtrThanSix(num1, num2, num3)){

            System.out.println("You entered numbers outside the range");
            System.exit(0);

        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Your sum is: " + sumOfNumbers + " Dice Sum is: " + sumOfDiceRolls);


        if(userWon(sumOfNumbers, sumOfDiceRolls)){

            System.out.println("Congrats");
        } else {

            System.out.println("Sorry fool! ");

        }

        boolean firstCheck = isLessThanOne(num1, num2, num3);
        boolean finalCheck = isGrtrThanSix(num1, num2, num3);


        scanner.close();

    }

    public static boolean isLessThanOne(int num1, int num2, int num3){

        return (num1 < 1 || num2 < 1 || num3 < 1);

    }

    public static boolean isGrtrThanSix(int num1, int num2, int num3){

        return (num1 > 6 || num2 > 6 || num3 > 6);

    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls){

        return (sumNumbers > sumDiceRolls && (sumNumbers-sumDiceRolls)< 3);

    }

    public static int rollDice( ){

        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;


    }
}
