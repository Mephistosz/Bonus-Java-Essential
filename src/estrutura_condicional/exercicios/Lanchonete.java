package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
  public static void main(String[] args) {
    int codigo;
    int quantidade;
    double valorAPagar;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Codigo do produto comprado: ");
    codigo = sc.nextInt();
    System.out.print("Quantidade comprada: ");
    quantidade = sc.nextInt();

    if (codigo == 1) {
      valorAPagar = quantidade * 5.00;
    } else if (codigo == 2) {
      valorAPagar = quantidade * 3.50;
    } else if (codigo == 3) {
      valorAPagar = quantidade * 4.80;
    } else if (codigo == 4) {
      valorAPagar = quantidade * 8.90;
    } else {
      valorAPagar = quantidade * 7.32;
    }

    System.out.printf("Valor a pagar: R$ %.2f", valorAPagar);

    sc.close();
  }
}
