package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {
  public static void main(String[] args) {

    double glicose;
    String statusGlicose;

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a medida da glicose: ");
    glicose = sc.nextDouble();
    if (glicose <= 100) {
      statusGlicose = "normal";
    } else if (glicose > 100 && glicose <= 140) {
      statusGlicose = "elevado";
    } else {
      statusGlicose = "Diabetes";
    }

    System.out.println("Classificacao: " + statusGlicose);

    sc.close();
  }
}
