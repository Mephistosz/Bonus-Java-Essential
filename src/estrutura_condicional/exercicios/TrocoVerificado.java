package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
  public static void main(String[] args) {

    double precoUnitario;
    int quantidade;
    double valor;
    double troco;

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Preço unitário do produto: ");
    precoUnitario = sc.nextDouble();
    System.out.print("Quantidade comprada: ");
    quantidade = sc.nextInt();
    System.out.print("Dinheiro recebido: ");
    valor = sc.nextDouble();

    troco = valor - precoUnitario * quantidade;

    if (troco >= 0) {
      System.out.printf("TROCO = %.2f", troco);
    } else {
      System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", Math.abs(troco));
    }

    sc.close();

  }
}
