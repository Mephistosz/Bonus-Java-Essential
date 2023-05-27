package estrutura_repetitivas.exercicios;

import java.util.Scanner;

public class ParesConsectuvos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um numero inteiro: ");
    int codigo = sc.nextInt();

    while (codigo != 0) {

      if (codigo % 2 != 0) {
        codigo = (codigo + 1) * 5 + 20;
      } else {
        codigo = codigo * 5 + 20;
      }

      System.out.println("SOMA = " + codigo);
      System.out.print("Digite um numero inteiro: ");

      codigo = sc.nextInt();

    }

    sc.close();
  }
}
