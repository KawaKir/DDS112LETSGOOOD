package SequentialActivites;

import java.util.Scanner;

public class doublehalftripleonethreetriple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert whole number: ");
        Double wholeNumberOne = scanner.nextDouble();
        System.out.print("Insert a whole number: ");
        Double wholeNumberTwo = scanner.nextDouble();
        System.out.print("Insert a real number (comma for decimals): ");
        Double brokenNumber = scanner.nextDouble();
        Double twoSquaredplusHalfThird = (wholeNumberTwo*wholeNumberTwo)+(brokenNumber/2);
        Double tripleOfFirstPlusThird = (wholeNumberOne+wholeNumberOne+wholeNumberOne)+brokenNumber;
        Double tripleThird = brokenNumber*brokenNumber*brokenNumber;
                System.out.println("your numbers result in:\n" + twoSquaredplusHalfThird +"\n"+ tripleOfFirstPlusThird + "\n" + tripleThird);
scanner.close();

    }
}
