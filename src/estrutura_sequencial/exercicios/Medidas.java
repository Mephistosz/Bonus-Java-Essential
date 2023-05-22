package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
  public static void main(String[] args) {

    double a, b, c, area;
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a medida A: ");
    a = sc.nextDouble();

    System.out.print("Digite a medida B: ");
    b = sc.nextDouble();

    System.out.print("Digite a medida C: ");
    c = sc.nextDouble();

    sc.close();

    area = a * a;
    System.out.printf("AREA DO QUADRADO = %.4f%n", area);

    area = (a * b) / 2;
    System.out.printf("AREA DO QUADRADO = %.4f%n", area);

    area = ((a + b) * c) / 2;
    System.out.printf("AREA DO QUADRADO = %.4f", area);

  }
}
