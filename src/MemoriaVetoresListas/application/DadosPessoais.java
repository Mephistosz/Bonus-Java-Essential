package MemoriaVetoresListas.application;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    double mediaAlturaF = 0.0;
    int qtdHomem = 0;
    int qtdMulher = 0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serao digitadas? ");
    int n = sc.nextInt();

    char[] vectGenero = new char[n];
    double[] vectAltura = new double[n];

    for (int i = 0; i < vectAltura.length; i++) {
      System.out.printf("Altura da %da pessoa: ", i + 1);
      vectAltura[i] = sc.nextDouble();
      System.out.printf("Genero da %da pessoa: ", i + 1);
      vectGenero[i] = sc.next().toUpperCase().charAt(0);
    }

    double menorAltura = vectAltura[0];
    double maiorAltura = vectAltura[0];

    for (int i = 0; i < vectAltura.length; i++) {
      if (vectAltura[i] < menorAltura) {
        menorAltura = vectAltura[i];
      }

      if (vectAltura[i] > maiorAltura) {
        maiorAltura = vectAltura[i];
      }

      if (vectGenero[i] == 'F') {
        mediaAlturaF += vectAltura[i];
        qtdMulher++;
      }

      if (vectGenero[i] == 'M') {
        qtdHomem++;
      }

    }

    System.out.printf("Menor altura = %.2f%n", menorAltura);
    System.out.printf("Maior altura = %.2f%n", maiorAltura);

    if (qtdMulher != 0) {
      mediaAlturaF = mediaAlturaF / qtdMulher;
      System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaF);
    } else {
      System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaF);
    }

    System.out.printf("Numero de homens = %d", qtdHomem);

    sc.close();
  }
}
