package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Troco {
  public static void main(String[] args) {

    double precoProduto;
    double dinheiro;
    double troco;
    int quantidade;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Preço unitário do produto: ");
    precoProduto = sc.nextDouble();
    System.out.print("Quantidade comprada: ");
    quantidade = sc.nextInt();
    System.out.print("Dinheiro recebido: ");
    dinheiro = sc.nextDouble();

    sc.close();

    troco = dinheiro - precoProduto * quantidade;

    System.out.printf("TROCO = %.2f", troco);

  }
}
