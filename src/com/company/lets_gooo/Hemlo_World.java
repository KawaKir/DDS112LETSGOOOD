package com.company.lets_gooo;
import java.util.Scanner;
public class Hemlo_World {
  public static void main(String[] Args) {
  Scanner scanner = new Scanner(System.in);
    //name
  System.out.println("Nome por favor: ");
  String username = scanner.nextLine();
  System.out.println("Sobrenome por favor");
  String username2 = scanner.nextLine();
  System.out.print("obrigado pela sua cooperação " + username + " " + username2 +", bem vindo ao mundo, diga olá.");
  scanner.close();
}}