package tratamento_excecoes.application;

import java.util.Locale;
import java.util.Scanner;

import tratamento_excecoes.model.entities.Account;
import tratamento_excecoes.model.exceptions.Domain2Exception;

public class ProgramAccount {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter account data");
    try {
      System.out.print("Number: ");
      int number = sc.nextInt();

      System.out.print("Holder: ");
      sc.nextLine();
      String holder = sc.nextLine();

      System.out.print("Initial balance: ");
      double initialBalance = sc.nextDouble();

      System.out.print("Withdraw limit: ");
      double withdrawLimit = sc.nextDouble();

      Account acc = new Account(number, holder, initialBalance, withdrawLimit);

      System.out.println();
      System.err.print("Enter amount for withdraw: ");
      double withdrawAmount = sc.nextDouble();

      acc.withdraw(withdrawAmount);

      System.out.printf("New balance: %.2f", acc.getBalance());
    } catch (Domain2Exception e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Unexpected Error!");
    }
    sc.close();
  }
}
