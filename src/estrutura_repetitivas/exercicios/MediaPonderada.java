package estrutura_repetitivas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos casos voce vai digitar? ");
    int n = sc.nextInt();

    int peso1 = 2;
    int peso2 = 3;
    int peso3 = 5;
    double media = 0;

    for (int i = 0; i < n; i++) {

      System.out.println("Digite tres numeros: ");

      double valor1 = sc.nextDouble() * peso1;
      double valor2 = sc.nextDouble() * peso2;
      double valor3 = sc.nextDouble() * peso3;

      media = (valor1 + valor2 + valor3) / (peso1 + peso2 + peso3);

      System.out.printf("MEDIA = %.1f%n", media);
    }

    sc.close();
  }
}
