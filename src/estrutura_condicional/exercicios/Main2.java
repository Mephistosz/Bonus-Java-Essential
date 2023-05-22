package exercicios;

import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {

    int hora;

    Scanner sc = new Scanner(System.in);

    System.out.print("Que horas são? ");
    hora = sc.nextInt();

    sc.close();

    if (hora < 12) {
      System.out.println("Bom dia");
    } else if (hora < 18) {
      System.out.println("Boa tarde");
    } else {
      System.out.println("Boa noite");
    }
  }
}
