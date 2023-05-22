package exercicios;

import java.util.Scanner;

public class Menor_de_tres {
  public static void main(String[] args) {
    int numero1;
    int numero2;
    int numero3;
    int menor;

    Scanner sc = new Scanner(System.in);

    System.out.print("Primeiro valor: ");
    numero1 = sc.nextInt();
    System.out.print("Segundo valor: ");
    numero2 = sc.nextInt();
    System.out.print("Terceiro valor: ");
    numero3 = sc.nextInt();

    sc.close();

    if (numero1 < numero2 && numero1 < numero3) {
      menor = numero1;
    } else if (numero2 < numero3) {
      menor = numero2;
    } else {
      menor = numero3;
    }

    System.out.printf("MENOR = %d%n", menor);

  }
}
