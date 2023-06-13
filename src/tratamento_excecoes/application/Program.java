package tratamento_excecoes.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {
      String[] vect = sc.nextLine().split(" ");
      int n = sc.nextInt();
      System.out.println(vect[n]);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Invalid position!");
      e.printStackTrace();
    } catch (InputMismatchException e) {
      System.out.println("Input error");
    } finally {
      System.out.println("End of program");
    }

    sc.close();

  }
}
