package com.company.lets_gooo;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora do quadrado, insira numero");
        Double N = scanner.nextDouble();
        Double N2 = N*N;
        System.out.print("Seu numero é: "+ N2);
                scanner.close();
    }
}
