package MemoriaVetoresListas.application;

import java.util.Locale;
import java.util.Scanner;

import MemoriaVetoresListas.entities.Produto;

public class Program1 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double total = 0.0;
    double media = 0.0;
    Produto[] vect = new Produto[n];

    for (int i = 0; i < vect.length; i++) {
      sc.nextLine();
      String name = sc.nextLine();
      double price = sc.nextDouble();
      vect[i] = new Produto(name, price);
    }

    for (Produto produto : vect) {
      total += produto.getPreco();
    }

    media = total / vect.length;

    System.out.printf("Media: %.2f", media);

    sc.close();
  }

}
