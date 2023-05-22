package exercicios;

import java.util.Scanner;

public class ExercicioFixacao4 {
  public static void main(String[] args) {

    int i;
    String x1;
    String x2;
    Scanner sc = new Scanner(System.in);

    i = sc.nextInt();
    sc.nextLine();
    x1 = sc.nextLine();
    x2 = sc.nextLine();
    System.out.println("---------");
    System.out.println(i);
    System.out.println(x1);
    System.out.println(x2);

    sc.close();
  }

}
