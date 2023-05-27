package estrutura_repetitivas.exercicios;

import java.util.Scanner;

public class Fatorial {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor de N: ");
    int n = sc.nextInt();
    int valorFatorial = 1;

    for (int i = n; i > 0; i--) {
      valorFatorial *= i;
    }

    System.out.println("FATORIAL = " + valorFatorial);
    sc.close();

  }
}