package estrutura_repetitivas.exercicios;

import java.util.Scanner;

public class SomaImpares {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x;
    int y;
    int soma;

    System.out.println("Digite dois numeros:");
    x = sc.nextInt();
    y = sc.nextInt();

    int menor = Math.min(x, y);
    int maior = Math.max(x, y);

    soma = 0;

    for (int i = menor + 1; i < maior; i++) {
      if (i % 2 != 0) {
        soma += i;
      }
    }

    System.out.printf("SOMA DOS IMPARES = %d%n", soma);

    sc.close();
  }
}
