package generics_set_map.app;

import java.util.Scanner;

import generics_set_map.model.services.PrintService;

public class Program {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("How many values? ");
    int n = sc.nextInt();

    PrintService<Integer> ps = new PrintService<>();

    for (int i = 0; i < n; i++) {
      int value = sc.nextInt();
      ps.addValue(value);
    }

    ps.print();

    sc.close();
  }
}
