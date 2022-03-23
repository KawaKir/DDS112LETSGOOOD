package SequentialActivites;
import java.util.Scanner;
public class FourDivider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert notes in sequence (enter for new note), first note please: ");
        Double noteOne = scanner.nextDouble();

        System.out.print("Second note: ");
        Double noteTwo = scanner.nextDouble();

        System.out.print("Third note: ");
        Double noteThree = scanner.nextDouble();

        System.out.print("Fourth note: ");
        Double noteFour = scanner.nextDouble();

        int meanDivisor = 4;

        double meanTotal = (noteOne + noteTwo + noteThree + noteFour)/meanDivisor;

        System.out.print("your average is: " + meanTotal);
scanner.close();}}