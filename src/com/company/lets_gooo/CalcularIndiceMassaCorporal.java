package com.company.lets_gooo;

import java.util.Scanner;

public class CalcularIndiceMassaCorporal {
    public static void main(String[] args){

        /*
        A = Altura
        P = Peso
        AAQ = Altura^2
        IMC = Indice de Massa Corporal
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Indice de Massa Corporal");
        System.out.print("por favor, seu peso (KG): ");
        Double  P = scanner.nextDouble();
        System.out.print("Certo, sua altura agora (metros):");
        double A = scanner.nextDouble();
        Double AAQ = A * A;
        double IMC = P / AAQ;
        System.out.println("Seu IMC é de " + IMC + " precisamente.");
        scanner.close();


}
}
