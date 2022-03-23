package SequentialActivites;

import java.util.Scanner;

public class Centi_Meters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert centimeters: ");
        double centimeters = scanner.nextDouble();
        int divisorToMeters = 100;
        double metersResult = centimeters / divisorToMeters;
        System.out.print("your conversion lead to " + metersResult + " meters.");
        scanner.close();}}
