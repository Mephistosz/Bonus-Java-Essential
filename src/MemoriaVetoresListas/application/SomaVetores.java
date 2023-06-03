package MemoriaVetoresListas.application;

import java.util.Scanner;

public class SomaVetores {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos valores vai ter cada vetor? ");
    int n = sc.nextInt();

    System.out.println("Digite os valores do vetor A: ");
    int[] vectA = new int[n];

    for (int i = 0; i < vectA.length; i++) {
      vectA[i] = sc.nextInt();
    }

    System.out.println("Digite os valores do vetor B:");

    int[] vectB = new int[n];

    for (int i = 0; i < vectB.length; i++) {
      vectB[i] = sc.nextInt();
    }

    System.out.println("VETOR RESULTANTE:");

    int[] vectC = new int[n];

    for (int i = 0; i < vectC.length; i++) {
      vectC[i] = vectA[i] + vectB[i];
      System.out.println(vectC[i]);
    }

    sc.close();
  }

}
