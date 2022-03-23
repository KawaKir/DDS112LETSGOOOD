package SequentialActivites;

import java.util.Scanner;

public class TimeIsMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //dinheiro por hora
        System.out.print("How much do you earn hourly? ");
        Double moneyPerHour = scanner.nextDouble();

        //horas por dia
        System.out.print("How much time do you work per day? ");
        Double hoursPerDay = scanner.nextDouble();

        //dias por mes
        System.out.print("how many days do you work in a month? ");
        Double daysOfWork = scanner.nextDouble();

        //meses por ano
        System.out.print("how many months do you work? ");
        double monthsWork = scanner.nextDouble();

        //contas de ganho por dia, mes e ano
        Double dayMoney = hoursPerDay * moneyPerHour;
        double monthMoney = dayMoney * daysOfWork;
        double yearMoney =  monthMoney * monthsWork;

        //lucros ( $vv$)-b
        System.out.print("you earn " + dayMoney + " daily and " + monthMoney + " Monthly.\n");
        System.out.print("you also earn " + yearMoney + " yearly.");
        scanner.close();
    }
}
