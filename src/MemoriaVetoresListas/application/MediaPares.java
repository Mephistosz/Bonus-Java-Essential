package MemoriaVetoresListas.application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    int quantidade = 0;
    double total = 0.0;
    double media = 0.0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();

    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = sc.nextInt();
      if (vect[i] % 2 == 0) {
        quantidade++;
        total += vect[i];
      }
    }

    if (quantidade != 0) {
      media = total / quantidade;
    }

    if (total == 0) {
      System.out.println("NENHUM NUMERO PAR");
    } else {
      System.out.printf("MEDIA DOS PARES = %.1f", media);
    }

    sc.close();
  }
}
