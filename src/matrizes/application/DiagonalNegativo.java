package matrizes.application;

import java.util.Scanner;

public class DiagonalNegativo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Qual a ordem da matriz? ");
    int n = sc.nextInt();

    int[][] matriz = new int[n][n];
    int qtdNumeroNegativo = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print("Elemento [" + i + "," + j + "]: ");
        matriz[i][j] = sc.nextInt();
        if (matriz[i][j] < 0) {
          qtdNumeroNegativo++;
        }
      }
    }

    System.out.println("DIAGONAL PRINCIPAL:");
    for (int i = 0; i < matriz.length; i++) {
      System.out.print(matriz[i][i] + " ");
    }

    System.out.println();
    System.out.println("QUANTIDADE DE NEGATIVOS = " + qtdNumeroNegativo);

    sc.close();
  }

}
