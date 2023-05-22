package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
  public static void main(String[] args) {

    double salario;
    double novoSalario;
    double aumento;
    int porcentagem;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o salario da pessoa: ");
    salario = sc.nextDouble();

    if (salario <= 1000.00) {
      porcentagem = 20;
      aumento = salario * porcentagem / 100;
      novoSalario = salario + aumento;
    } else if (salario <= 3000.00) {
      porcentagem = 15;
      aumento = salario * porcentagem / 100;
      novoSalario = salario + aumento;
    } else if (salario <= 8000.00) {
      porcentagem = 10;
      aumento = salario * porcentagem / 100;
      novoSalario = salario + aumento;
    } else {
      porcentagem = 5;
      aumento = salario * porcentagem / 100;
      novoSalario = salario + aumento;
    }

    System.out.printf("Novo Salario = %.2f%n", novoSalario);
    System.out.printf("Aumento = %.2f%n", aumento);
    System.out.printf("Porcentagem = %d %%", porcentagem);

    sc.close();
  }
}
