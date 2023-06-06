package vect_list.application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    double soma = 0.0;
    double media = 0.0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();

    double[] vect = new double[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = sc.nextDouble();
    }

    System.out.print("VALORES = ");

    for (int i = 0; i < vect.length; i++) {
      System.out.printf("%.1f ", vect[i]);
      soma += vect[i];
    }

    media = soma / vect.length;

    System.out.printf("%nSOMA = %.2f", soma);
    System.out.printf("%nMEDIA = %.2f", media);

    sc.close();
  }
}
