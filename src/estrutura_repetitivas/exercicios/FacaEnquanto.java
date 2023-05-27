package estrutura_repetitivas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class FacaEnquanto {
  public static void main(String[] args) {

    char deveProcessar;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("Digite a temperatura em Celsius: ");
      double temperatura = sc.nextDouble();
      temperatura = temperatura * 9.0 / 5.0 + 32.0;
      System.out.printf("Equivalente em Fahrenheit: %.1f%n", temperatura);
      System.out.print("Deseja repetir (s/n)? ");
      deveProcessar = sc.next().toUpperCase().charAt(0);
    } while (deveProcessar == 'S');

    sc.close();
  }
}
