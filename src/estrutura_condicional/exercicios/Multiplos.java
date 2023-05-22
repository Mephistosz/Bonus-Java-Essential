package exercicios;

import java.util.Scanner;

public class Multiplos {
  public static void main(String[] args) {

    int numero1;
    int numero2;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite dois numeros inteiros:");

    numero1 = sc.nextInt();
    numero2 = sc.nextInt();

    sc.close();

    if (numero1 % numero2 == 0) {
      System.out.println("Sao multiplos ");
    } else {
      System.out.println("Nao sao multiplos");
    }
  }
}
