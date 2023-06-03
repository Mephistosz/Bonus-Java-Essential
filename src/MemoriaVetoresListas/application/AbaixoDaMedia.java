package MemoriaVetoresListas.application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    double total = 0.0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();

    double[] vect = new double[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = sc.nextDouble();
      total += vect[i];
    }

    double media = total / vect.length;

    System.out.println();
    System.out.printf("MEDIA DO VETOR = %.3f%n", media);
    System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

    for (double d : vect) {
      if (d < media) {
        System.out.printf("%.1f", d);
      }
    }

    sc.close();
  }

}
