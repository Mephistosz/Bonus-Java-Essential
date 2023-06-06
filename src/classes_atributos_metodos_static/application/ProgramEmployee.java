package classes_atributos_metodos_static.application;

import java.util.Locale;
import java.util.Scanner;

import classes_atributos_metodos_static.entities.Employee;

public class ProgramEmployee {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Nome: ");
    String name = sc.nextLine();
    System.out.print("Salário bruto: ");
    double grossSalary = sc.nextDouble();
    System.out.print("Imposto: ");
    double tax = sc.nextDouble();

    Employee empl = new Employee(name, grossSalary, tax);

    System.out.printf("Funcionário: %s, $ %.2f%n", empl.name, empl.netSalary());
    System.out.print("Qual a porcentagem para aumentar o salário? ");
    double percentage = sc.nextDouble();
    empl.increaseSalary(percentage);
    System.out.printf("Dados atualizados: %s, $ %.2f", empl.name, empl.netSalary());

    sc.close();
  }
}