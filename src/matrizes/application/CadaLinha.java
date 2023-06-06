package matrizes.application;

import java.util.Scanner;

public class CadaLinha {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Qual a ordem da matriz? ");
    int n = sc.nextInt();

    int[][] matriz = new int[n][n];
    Integer[] vect = new Integer[matriz.length];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {

        System.out.print("Elemento [" + i + "," + j + "]: ");

        matriz[i][j] = sc.nextInt();

        if (vect[i] == null || matriz[i][j] > vect[i]) {
          vect[i] = matriz[i][j];
        }
      }
    }

    System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
    for (Integer x : vect) {
      System.out.println(x);
    }

    sc.close();
  }
}
