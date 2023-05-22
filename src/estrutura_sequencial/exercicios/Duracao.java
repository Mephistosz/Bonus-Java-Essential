package exercicios;

import java.util.Scanner;

public class Duracao {
  public static void main(String[] args) {
    int duracao;
    int horas;
    int minutos;
    int segundos;
    int resto;

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a duracao em segundos: ");
    duracao = sc.nextInt();
    sc.close();

    horas = duracao / 3600;
    resto = duracao % 3600;

    minutos = resto / 60;
    segundos = resto % 60;

    System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

  }
}
