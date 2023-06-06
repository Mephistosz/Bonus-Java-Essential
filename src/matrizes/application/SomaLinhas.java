package matrizes.application;

import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Qual a quantidade de linhas da matriz? ");
    int n = sc.nextInt();
    System.out.print("Qual a quantidade de colunas da matriz? ");
    int m = sc.nextInt();

    double[][] matriz = new double[n][m];

    double[] somaLinhas = new double[matriz.length];

    for (int i = 0; i < matriz.length; i++) {
      System.out.printf("Digite os elementos da %da. linha:%n", i + 1);

      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = sc.nextDouble();
        somaLinhas[i] += matriz[i][j];
      }
    }

    System.out.println("VETOR GERADO:");

    for (double i : somaLinhas) {
      System.out.printf("%.1f%n", i);
    }

    sc.close();
  }
}
