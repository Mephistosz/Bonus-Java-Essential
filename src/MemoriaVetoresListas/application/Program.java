package MemoriaVetoresListas.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] vect = new double[n];
    double altura = 0.0;

    for (int i = 0; i < vect.length; i++) {
      vect[i] = sc.nextDouble();
    }

    for (double d : vect) {
      altura += d;
    }

    altura = altura / vect.length;

    System.out.printf("Altura média: %.2f", altura);

    sc.close();
  }
}
