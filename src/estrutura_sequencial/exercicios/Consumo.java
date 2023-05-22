package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
  public static void main(String[] args) {

    int distancia;
    double combustivel;
    double consumo;

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Distancia percorrida: ");
    distancia = sc.nextInt();

    System.out.print("Combustível gasto: ");
    combustivel = sc.nextDouble();
    sc.close();

    consumo = distancia / combustivel;

    System.out.printf("Consumo medio = %.3f", consumo);
  }
}
