package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Locale.setDefault(Locale.US);

    System.out.print("Digite o valor de a: ");
    double a = scanner.nextDouble();

    System.out.print("Digite o valor de b: ");
    double b = scanner.nextDouble();

    System.out.print("Digite o valor de c: ");
    double c = scanner.nextDouble();

    double discriminante = b * b - 4 * a * c;

    if (discriminante > 0) {
      double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
      double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
      System.out.println("As raízes são: " + raiz1 + " e " + raiz2);
    } else if (discriminante == 0) {
      double raiz = -b / (2 * a);
      System.out.println("A raiz dupla é: " + raiz);
    } else {
      System.out.println("Não existem raízes reais.");
    }

    scanner.close();
  }
}
