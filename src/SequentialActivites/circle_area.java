package SequentialActivites;

import java.util.Scanner;

public class circle_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert Radius: ");
        Double rad = scanner.nextDouble();
        double piNumber = 3.14159265359;
        double area = piNumber*(rad*rad);
        System.out.println("\n\n14Your area is: " + area);
        scanner.close();

    }

}
