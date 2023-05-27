package estrutura_repetitivas.exercicios;

import java.util.Scanner;

public class DentroFora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dentro = 0;
    int fora = 0;

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {

      System.out.print("Digite um numero: ");
      int numeroValidar = sc.nextInt();

      if (numeroValidar < 10 || numeroValidar > 20) {
        fora++;
      } else {
        dentro++;
      }
    }

    System.out.println(dentro + " DENTRO");
    System.out.println(fora + " FORA");

    sc.close();

  }

}
