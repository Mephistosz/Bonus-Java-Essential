package estrutura_repetitivas.exercicios;

import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int x = sc.nextInt();

    for (int i = 0; i < x; i++) {

      System.out.print("Digite um numero: ");
      int numero = sc.nextInt();

      if (numero > 0 && numero % 2 == 0) {
        System.out.println("PAR POSITIVO");
      } else if (numero > 0 && numero % 2 != 0) {
        System.out.println("IMPAR POSITIVO");
      } else if (numero == 0) {
        System.out.println("NULO");
      } else if (numero % 2 != 0) {
        System.out.println("IMPAR NEGATIVO");
      } else {
        System.out.println("PAR NEGATIVO");
      }

    }

    sc.close();
  }
}
