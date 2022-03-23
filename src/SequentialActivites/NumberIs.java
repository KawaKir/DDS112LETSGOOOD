package SequentialActivites;

import java.util.Scanner;

public class NumberIs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        Double number = scanner.nextDouble();
        System.out.println("your number is "+ number );
        scanner.close();
    }
}
