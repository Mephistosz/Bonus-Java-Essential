package vect_list.application;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos alunos serao digitados? ");
    int n = sc.nextInt();

    String[] vectNome = new String[n];
    double[] vectNota1 = new double[n];
    double[] vectNota2 = new double[n];

    for (int i = 0; i < vectNome.length; i++) {
      System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
      sc.nextLine();
      vectNome[i] = sc.nextLine();
      vectNota1[i] = sc.nextDouble();
      vectNota2[i] = sc.nextDouble();
    }

    System.out.println("Alunos aprovados:");

    for (int i = 0; i < vectNome.length; i++) {
      double total = (vectNota1[i] + vectNota2[i]) / 2;
      if (total >= 6.0) {
        System.out.println(vectNome[i]);
      }

    }

    sc.close();
  }
}
