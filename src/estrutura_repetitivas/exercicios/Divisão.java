package estrutura_repetitivas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Divisão {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos casos voce vai digitar? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Entre com o numerador: ");
      int numerador = sc.nextInt();
      System.out.print("Entre com o denominador: ");
      int denominador = sc.nextInt();

      if (denominador == 0) {
        System.out.println("DIVISAO IMPOSSIVEL");
      } else {
        double divisao = (double) numerador / denominador;
        System.out.printf("DIVISAO = %.2f%n", divisao);
      }
    }

    sc.close();
  }
}
