package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
  public static void main(String[] args) {
    int minutosConsumidos;
    double valorCobrado = 50.00;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de minutos: ");
    minutosConsumidos = sc.nextInt();

    if (minutosConsumidos > 100) {
      valorCobrado += (double) (minutosConsumidos - 100) * 2;
    }

    System.out.printf("Valor a pagar: R$ %.2f", valorCobrado);

    sc.close();
  }
}
