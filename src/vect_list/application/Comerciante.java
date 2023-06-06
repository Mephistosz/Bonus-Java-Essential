package vect_list.application;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Serao digitados dados de quantos produtos? ");
    int n = sc.nextInt();

    String[] vectNome = new String[n];
    double[] vectPrecoCompra = new double[n];
    double[] vectPrecoVenda = new double[n];
    int[] vectPorcentagemLucros = new int[3];
    double totalCompra = 0.0;
    double totalVenda = 0.0;
    double lucro = 0;

    for (int i = 0; i < vectNome.length; i++) {
      System.out.printf("Produto %d:%n", i + 1);
      System.out.print("Nome: ");
      sc.nextLine();
      vectNome[i] = sc.nextLine();
      System.out.print("Preco de compra: ");
      vectPrecoCompra[i] = sc.nextDouble();
      System.out.print("Preco de venda: ");
      vectPrecoVenda[i] = sc.nextDouble();
    }

    for (int i = 0; i < vectNome.length; i++) {

      totalCompra += vectPrecoCompra[i];
      totalVenda += vectPrecoVenda[i];

      if (vectPrecoVenda[i] * 100 / vectPrecoCompra[i] < 110.00) {
        vectPorcentagemLucros[0] += 1;
      } else if (vectPrecoVenda[i] * 100 / vectPrecoCompra[i] <= 120.00) {
        vectPorcentagemLucros[1] += 1;
      } else {
        vectPorcentagemLucros[2] += 1;
      }

    }

    lucro = totalVenda - totalCompra;

    System.out.println();
    System.out.println("RELATORIO:");
    System.out.println("Lucro abaixo de 10%: " + vectPorcentagemLucros[0]);
    System.out.println("Lucro entre 10% e 20%: " + vectPorcentagemLucros[1]);
    System.out.println("Lucro acima de 20%: " + vectPorcentagemLucros[2]);
    System.out.printf("Valor total de compra: %.2f%n", totalCompra);
    System.out.printf("Valor total de venda: %.2f%n", totalVenda);
    System.out.printf("Lucro total: %.2f", lucro);

    sc.close();
  }
}
