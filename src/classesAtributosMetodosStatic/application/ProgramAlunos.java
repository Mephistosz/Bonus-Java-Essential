package classesAtributosMetodosStatic.application;

import java.util.Locale;
import java.util.Scanner;

import classesAtributosMetodosStatic.entities.Aluno;

public class ProgramAlunos {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    String nome = sc.nextLine();
    double nota1 = sc.nextDouble();
    double nota2 = sc.nextDouble();
    double nota3 = sc.nextDouble();

    Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

    System.out.printf("NOTA FINAL = %.2f%n", aluno.soma());

    aluno.status();

    sc.close();
  }
}
