package vect_list.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import vect_list.entities.Funcionario;

public class ProgramExercicio {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    Integer n;

    System.out.print("How many employees will be registered? ");
    n = sc.nextInt();

    List<Funcionario> funcionario = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      System.out.printf("Emplyoee #%d:%n", i);

      System.out.print("Id: ");
      Integer id = sc.nextInt();
      while (temId(funcionario, id)) {
        System.out.println("Id já existente, Favor digitar outro");
        System.out.print("Id: ");
        id = sc.nextInt();
      }

      System.out.print("Name: ");
      sc.nextLine();
      String nome = sc.nextLine();

      System.out.print("Salary: ");
      Double salario = sc.nextDouble();

      System.out.println("");

      funcionario.add(new Funcionario(id, nome, salario));
    }

    System.out.print("Enter the employee id that will have salary increase : ");
    Integer id = sc.nextInt();

    Funcionario funcionarioAumento = funcionario.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);

    if (funcionarioAumento == null) {
      System.out.println();
      System.out.println("This id does not exist!");
    } else {
      System.out.print("Enter the percentage: ");
      funcionarioAumento.increaseSalary(sc.nextDouble());
      System.out.println();
    }

    System.out.println("List of employees:");
    System.out.println();

    for (Funcionario func : funcionario) {
      System.out.println(func);
    }

    sc.close();

  }

  public static boolean temId(List<Funcionario> funcionario, Integer id) {
    return funcionario.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null) != null;
  }

}