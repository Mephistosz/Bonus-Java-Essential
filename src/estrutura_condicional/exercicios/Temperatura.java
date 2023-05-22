package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
  public static void main(String[] args) {

    char medidaTemperatura;
    double temperatura;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Voce vai digitar a temperatura em qual escala (C/F)?");
    medidaTemperatura = sc.next().toUpperCase().charAt(0);

    if (medidaTemperatura == 'F') {
      System.out.print("Digite a temperatura em Fahrenheit: ");
      temperatura = sc.nextDouble();
      temperatura = (temperatura - 32) / 9 * 5;
      System.out.printf("Temperatura equivalente em Celsius: %.2f", temperatura);
    } else {
      System.out.print("Digite a temperatura em Celsius:: ");
      temperatura = sc.nextDouble();
      temperatura = temperatura / 5 * 9 + 32;
      System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", temperatura);
    }

    sc.close();
  }
}
