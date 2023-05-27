package topicos_basicos.exercicios;

import java.util.Scanner;

public class Funcoes {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Funcoes fc = new Funcoes();

    System.out.println("Enter three numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int higher = fc.max(a, b, c);

    fc.response(higher);

    sc.close();

  }

  private int max(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > c) {
      return b;
    } else {
      return c;
    }
  }

  private void response(int higher) {
    System.out.println("Higher number: " + higher);
  }

}
