package matrizes.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NegativosMatriz {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Qual a quantidade de linhas da matriz? ");
    int n = sc.nextInt();
    System.out.print("Qual a quantidade de colunas da matriz? ");
    int m = sc.nextInt();

    int[][] matriz = new int[n][m];

    List<Integer> valorNegativo = new ArrayList<>();

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {

        System.out.print("Elemento [" + i + "," + j + "]: ");

        matriz[i][j] = sc.nextInt();

        if (matriz[i][j] < 0) {
          valorNegativo.add(matriz[i][j]);
        }

      }
    }

    System.out.println("VALORES NEGATIVOS:");

    for (Integer x : valorNegativo) {
      System.out.println(x);
    }

    sc.close();
  }
}
