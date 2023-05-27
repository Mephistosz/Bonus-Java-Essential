package estrutura_repetitivas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite as idades: ");

    int idadeInicial = sc.nextInt();
    int idade = 0;
    int count = 0;

    if (idadeInicial < 0) {
      System.out.println("IMPOSSIVEL CALCULAR");
    } else {
      while (idadeInicial > 0) {
        idade += idadeInicial;
        count++;
        idadeInicial = sc.nextInt();
      }
      double media = (double) idade / count;
      System.out.printf("MEDIA = %.2f", media);
    }

    sc.close();
  }
}
