package vect_list.application;

import java.util.Scanner;

public class MaisVelho {
  public static void main(String[] args) {

    int maiorIdade = 0;
    String nome = "";

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas voce vai digitar? ");
    int n = sc.nextInt();

    int[] vectIdade = new int[n];
    String[] vectNome = new String[n];

    for (int i = 1; i <= vectNome.length; i++) {

      System.out.println("Dados da " + i + "a pessoa:");

      System.out.print("Nome: ");
      sc.nextLine();
      vectNome[i - 1] = sc.nextLine();

      System.out.print("Idade: ");
      vectIdade[i - 1] = sc.nextInt();

    }

    for (int i = 0; i < vectNome.length; i++) {
      if (vectIdade[i] > maiorIdade) {
        maiorIdade = vectIdade[i];
        nome = vectNome[i];
      }

    }

    System.out.println("PESSOA MAIS VELHA: " + nome);

    sc.close();
  }
}
