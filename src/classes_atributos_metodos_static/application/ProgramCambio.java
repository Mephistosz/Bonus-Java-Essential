package classes_atributos_metodos_static.application;

import java.util.Locale;
import java.util.Scanner;

import classes_atributos_metodos_static.util.CurrencyConverter;

public class ProgramCambio {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Qual o valor do dólar? ");
    double valorDolar = sc.nextDouble();
    System.out.print("Quantos dólares serão comprados? ");
    double quantidadeDolares = sc.nextDouble();

    System.out.printf("Valor a ser pago em reais = %.2f", CurrencyConverter.valorPago(valorDolar, quantidadeDolares));

    sc.close();
  }
}
