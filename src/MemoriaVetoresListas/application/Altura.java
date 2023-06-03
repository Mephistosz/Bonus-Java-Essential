package MemoriaVetoresListas.application;

import java.util.Locale;
import java.util.Scanner;

import MemoriaVetoresListas.entities.Pessoa;

public class Altura {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    double alturaTotal = 0.0;
    double alturaMedia = 0.0;
    double menorDe16 = 0.0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Quantas pessoas serao digitadas? ");
    int n = sc.nextInt();

    Pessoa[] vect = new Pessoa[n];

    for (int i = 1; i <= vect.length; i++) {

      System.out.println("Dados da " + i + "a pessoa:");

      System.out.print("Nome: ");
      sc.nextLine(); // consumindo a quebra de linha
      String nome = sc.nextLine();

      System.out.print("Idade: ");
      int idade = sc.nextInt();

      System.out.print("Altura: ");
      double altura = sc.nextDouble();

      vect[i - 1] = new Pessoa(nome, idade, altura); // retirando 1 do valor para refletir corretamente
    }

    for (Pessoa pessoa : vect) {
      alturaTotal += pessoa.getAltura();
      if (pessoa.getIdade() < 16) {
        menorDe16++;
      }
    }

    alturaMedia = alturaTotal / vect.length;
    menorDe16 = menorDe16 * 100 / vect.length;

    System.out.printf("%nAltura média: %.2f%n", alturaMedia);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menorDe16);

    for (Pessoa pessoa : vect) {
      if (pessoa.getIdade() < 16)
        System.out.println(pessoa.getName());
    }

    sc.close();
  }
}
