package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
  public static void main(String[] args) {
    double base;
    double altura;
    double area;
    double perimetro;
    double diagonal;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Base do retangulo: ");
    base = sc.nextDouble();
    System.out.print("Altura do retangulo: ");
    altura = sc.nextDouble();

    sc.close();

    area = base * altura;
    perimetro = 2 * (base + altura);
    diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

    System.out.printf("AREA = %.4f%n", area);
    System.out.printf("PERIMETRO = %.4f%n", perimetro);
    System.out.printf("DIAGONAL = %.4f", diagonal);
  }
}
