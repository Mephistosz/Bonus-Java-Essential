package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
  public static void main(String[] args) {
    String nome;
    double valorhora;
    int horas;
    double salario;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Nome: ");
    nome = sc.nextLine();
    System.out.print("Valor por hora: ");
    valorhora = sc.nextDouble();
    System.out.print("Horas trabalhadas: ");
    horas = sc.nextInt();

    sc.close();

    salario = valorhora * horas;

    System.out.printf("O pagamento para %s deve ser %.2f", nome, salario);

  }

}