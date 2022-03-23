package SequentialActivites;

import java.util.Scanner;

public class Cel_Fah {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert Celsius");
    Double celsius = scanner.nextDouble();
    Double Fahrenheit= (celsius/0.5556)+32 ;
    System.out.println("your temperature is (Fahrenheit): " + Fahrenheit);
    scanner.close();

}}
