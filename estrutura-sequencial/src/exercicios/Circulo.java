package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
  public static void main(String[] args) {

    double raio;
    double pi = 3.14159;
    double area;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor do raio do circulo: ");
    raio = sc.nextDouble();
    sc.close();

    area = Math.pow(raio, 2) * pi;

    System.out.printf("AREA = %.3f ", area);
  }
}
