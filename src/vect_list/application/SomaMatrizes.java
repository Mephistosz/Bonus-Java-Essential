package vect_list.application;

import java.util.Scanner;

public class SomaMatrizes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas linhas vai ter cada matriz? ");
    int l = sc.nextInt();
    System.out.print("Quantas colunas vai ter cada matriz? ");
    int c = sc.nextInt();

    int[][] matrizA = new int[l][c];
    int[][] matrizB = new int[l][c];
    int[][] matrizC = new int[l][c];

    System.out.println("Digite os valores da matriz A:");
    for (int i = 0; i < matrizA.length; i++) {
      for (int j = 0; j < matrizA[i].length; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        matrizA[i][j] = sc.nextInt();
      }
    }

    System.out.println("Digite os valores da matriz B:");
    for (int i = 0; i < matrizB.length; i++) {
      for (int j = 0; j < matrizB[i].length; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        matrizB[i][j] = sc.nextInt();
      }
    }

    System.out.println("MATRIZ SOMA:");

    for (int i = 0; i < matrizC.length; i++) {
      for (int j = 0; j < matrizC[i].length; j++) {
        matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
        System.out.print(matrizC[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
