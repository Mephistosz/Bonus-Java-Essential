package exercicios;

import java.util.Scanner;

public class TempoDeJogo {
  public static void main(String[] args) {

    int horaInicial;
    int horaFinal;

    Scanner sc = new Scanner(System.in);

    System.out.print("Hora inicial: ");
    horaInicial = sc.nextInt();
    System.out.print("Hora final: ");
    horaFinal = sc.nextInt();

    if (horaInicial < horaFinal) {
      System.out.printf("O JOGO DUROU %d HORA(S)%n", horaFinal - horaInicial);
    } else {
      System.out.printf("O JOGO DUROU %d HORA(S)%n", 24 - (horaInicial - horaFinal));
    }

    sc.close();
  }
}
