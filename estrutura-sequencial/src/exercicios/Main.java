package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Integer value1;
    String continuar;

    Double teste = 35.00 / 2;

    System.out.println(teste);
    Locale.setDefault(Locale.US);
    System.out.printf("%.2f%n", teste);

    String nome = "Maria";
    int idade = 31;
    double renda = 4000.0;
    System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    do {

      System.out.println("Digite o valor para checar se é impar ou par:");
      value1 = sc.nextInt();

      Integer resultado = value1 % 2;

      if (resultado == 0) {
        System.out.println("Seu numero é par " + resultado);
      } else {
        System.out.println("Seu número é impar: " + resultado);
      }
      System.out.println("Deseja checar mais números? Y/N");
      continuar = sc.next();

    } while (continuar.equalsIgnoreCase("Y"));

    sc.close();

  }

}