package SequentialActivites;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert Fahrenheit");
        Double fahrenheitTemp = scanner.nextDouble();
        Double kelvinAddition = 273.15;
        int multiplyByFive = 5;
        int divideByNine = 9;
        int minusthreetwo =  32;
        Double celsiusTemperature = multiplyByFive*((fahrenheitTemp -minusthreetwo)/divideByNine);
        Double kelvinTemp = celsiusTemperature + kelvinAddition;
        System.out.println("your temperature is (celsius): " + celsiusTemperature + " and in Kelvin: " + kelvinTemp);
        scanner.close();

    }
}
