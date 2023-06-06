package vect_list.application;

import java.util.Scanner;

public class NumerosPares {
  public static void main(String[] args) {
    int qtdPares = 0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();

    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = sc.nextInt();
    }

    System.out.println();
    System.out.println("NUMEROS PARES: ");

    for (int i : vect) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
        qtdPares++;
      }
    }

    System.out.printf("%n%n");
    System.out.println("QUANTIDADE DE PARES = " + qtdPares);

    sc.close();
  }
}
