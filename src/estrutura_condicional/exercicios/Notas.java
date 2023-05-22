package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
  public static void main(String[] args) {
    double primeiraNota;
    double segundaNota;
    double notaFinal;

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    primeiraNota = sc.nextDouble();
    System.out.print("Digite a segunda nota: ");
    segundaNota = sc.nextDouble();
    sc.close();

    notaFinal = primeiraNota + segundaNota;

    System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
    if (notaFinal < 60.0) {
      System.out.println("REPROVADO");
    }

  }
}
