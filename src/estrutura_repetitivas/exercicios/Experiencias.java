package estrutura_repetitivas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos casos de teste serao digitados? ");

    int casosTeste = sc.nextInt();
    int numeroCobaias;
    char tipoCobaia;
    int sapos = 0;
    int ratos = 0;
    int coelhos = 0;
    int total;

    for (int i = 0; i < casosTeste; i++) {

      System.out.print("Quantidade de cobaias: ");
      numeroCobaias = sc.nextInt();

      System.out.print("Tipo de cobaia: ");
      tipoCobaia = sc.next().toUpperCase().charAt(0);

      if (tipoCobaia == 'S') {
        sapos += numeroCobaias;
      } else if (tipoCobaia == 'R') {
        ratos += numeroCobaias;
      } else if (tipoCobaia == 'C') {
        coelhos += numeroCobaias;
      }
    }
    total = sapos + ratos + coelhos;

    double pcoelhos = ((double) coelhos / total) * 100.0;
    double pratos = ((double) ratos / total) * 100.0;
    double psapos = ((double) sapos / total) * 100.0;

    System.out.println();
    System.out.println("RELATORIO FINAL:");
    System.out.printf("Total: %d cobaias %n", total);
    System.out.println("Total de coelhos: " + coelhos);
    System.out.println("Total de ratos: " + ratos);
    System.out.println("Total de sapos: " + sapos);
    System.out.printf("Percentual de coelhos: %.2f%n ", pcoelhos);
    System.out.printf("Percentual de ratos: %.2f%n", pratos);
    System.out.printf("Percentual de sapos: %.2f%n", psapos);

    sc.close();
  }
}
