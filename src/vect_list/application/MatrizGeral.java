package vect_list.application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Qual a ordem da matriz? ");
    int n = sc.nextInt();
    String formatacao = "%.1f ";

    double[][] matriz = new double[n][n];
    double soma = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.printf("Elemento [%d,%d]: ", i, j);
        matriz[i][j] = sc.nextDouble();
        if (matriz[i][j] > 0) {
          soma += matriz[i][j];
        }
      }
    }

    System.out.printf("SOMA DOS POSITIVOS: %.1f%n%n", soma);

    System.out.print("Escolha uma linha: ");
    int nLinha = sc.nextInt();
    System.out.print("LINHA ESCOLHIDA: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (i == nLinha) {
          System.out.printf(formatacao, matriz[i][j]);
        }
      }
    }

    System.out.printf("%n%nEscolha uma coluna: ");
    int nColuna = sc.nextInt();
    System.out.print("COLUNA ESCOLHIDA: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (j == nColuna) {
          System.out.printf(formatacao, matriz[i][j]);
        }
      }
    }

    System.out.printf("%n%nDIAGONAL PRINCIPAL: ");
    for (int i = 0; i < matriz.length; i++) {
      System.out.print(matriz[i][i] + " ");
    }

    System.out.printf("%n%nMATRIZ ALTERADA:%n");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] < 0) {
          matriz[i][j] = Math.pow(matriz[i][j], 2);
        }
        System.out.printf(formatacao, matriz[i][j]);
      }
      System.out.println();
    }

    sc.close();
  }
}
