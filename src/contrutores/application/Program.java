package contrutores.application;

import java.util.Locale;
import java.util.Scanner;

import contrutores.entities.Conta;

public class Program {
  public static void main(String[] args) {

    int numeroConta;
    String nome;
    char depositoInicial;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o numero da conta: ");
    numeroConta = sc.nextInt();
    System.out.print("Digite o nome da conta: ");
    sc.nextLine();
    nome = sc.nextLine();
    System.out.print("Será feito um deposito inicial (s/n)? ");
    depositoInicial = sc.next().toUpperCase().charAt(0);

    Conta conta;

    if (depositoInicial == 'S') {
      System.out.print("Digite o valor do deposito inicial: ");
      double valor = sc.nextDouble();
      conta = new Conta(numeroConta, nome, valor);
    } else {
      conta = new Conta(numeroConta, nome);
    }

    System.out.println();
    System.out.println("Informações da conta:");
    System.out.println(conta);

    System.out.println();

    System.out.print("Digite o valor do deposito: ");
    double valorDeposito = sc.nextDouble();
    conta.deposito(valorDeposito);

    System.out.println("Conta atualizada: ");
    System.out.println(conta);

    System.out.println();

    System.out.print("Digite o valor do saque: ");
    double valorSaque = sc.nextDouble();
    conta.saque(valorSaque);
    System.out.println("Conta atualizada: ");
    System.out.println(conta);

    sc.close();
  }
}
