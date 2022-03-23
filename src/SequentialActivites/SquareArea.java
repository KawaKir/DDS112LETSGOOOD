package SequentialActivites;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("insert side length (squared): ");
        Double squareSide = scanner.nextDouble();
        int numberTwo = 2;
        double squaredAreaDoubled = (squareSide * squareSide) * numberTwo;
        System.out.println("Your area is: " + squaredAreaDoubled);
        scanner.close();
    }
}