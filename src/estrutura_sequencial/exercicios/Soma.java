package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Soma {
  public static void main(String[] args) {

    int valor1;
    int valor2;
    int soma;

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor de X: ");
    valor1 = sc.nextInt();
    System.out.print("Digite o valor de Y: ");
    valor2 = sc.nextInt();
    sc.close();

    soma = valor1 + valor2;

    System.out.println("SOMA = " + soma);

  }
}
