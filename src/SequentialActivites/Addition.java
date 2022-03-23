package SequentialActivites;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inset first number");
        Double numfir = scanner.nextDouble();
        System.out.println("Insert second number");
        Double numsec = scanner.nextDouble();
        Double sum = numfir+numsec;
        System.out.print("Your Addition is " + sum);
        scanner.close();
    }
}
