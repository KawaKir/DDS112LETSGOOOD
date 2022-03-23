package BuddyBoysStarterPac.Varias_and_Constantibles;

import java.util.Scanner;

public class LogiType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean varVerd = true;
        System.out.println("Variavel Verdadeira: " + varVerd);

        Boolean vf = false;
        System.out.println("Variavel Falsa: " + vf);

        System.out.println("-------------------------------------------- ");

        System.out.println("Por favor insira idade");

        double age = scanner.nextDouble();

        Boolean pTC = age >= 18;

        if (pTC) {
            System.out.print("Sim, pode tirar a carteira.");
        } else {
            System.out.print("Não, não se pode tirar carteira pois apenas tem " + age + " anos.");}
        }


        /*
        varVerd= Boolean Verdadeiro
        varFals= Boolean Falso
        pTC = Pode Tirar Carteira
        */
    }
