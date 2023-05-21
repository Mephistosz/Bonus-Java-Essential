package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Idades {
  public static void main(String[] args) {

    String nome1;
    String nome2;
    int idade1, idade2;
    double media;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.println("Dados da primeira pessoa:");
    System.out.print("Nome: ");
    nome1 = sc.nextLine();
    System.out.print("Idade: ");
    idade1 = sc.nextInt();
    sc.nextLine();

    System.out.println("Dados da segunda pessoa:");
    System.out.print("Nome: ");
    nome2 = sc.nextLine();
    System.out.print("Idade: ");
    idade2 = sc.nextInt();

    media = (double) (idade1 + idade2) / 2;

    System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

    sc.close();
  }
}
