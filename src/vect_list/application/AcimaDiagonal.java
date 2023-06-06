package vect_list.application;

import java.util.Scanner;

public class AcimaDiagonal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Qual a ordem da matriz? ");
    int n = sc.nextInt();

    int[][] matriz = new int[n][n];
    int soma = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        matriz[i][j] = sc.nextInt();
        if (j > i) {
          soma += matriz[i][j];
        }
      }
    }

    System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d", soma);

    sc.close();
  }
}
