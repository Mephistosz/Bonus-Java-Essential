package heranca.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca.entities.Company;
import heranca.entities.Individual;
import heranca.entities.TaxPayer;

public class ProgramTaxPayer {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    List<TaxPayer> list = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int numberOfTaxPayer = sc.nextInt();

    for (int i = 1; i <= numberOfTaxPayer; i++) {
      System.out.printf("Tax payer #%d data: %n", i);
      System.out.print("Individual or company (i/c)? ");
      char validateTypeOfTaxPayer = sc.next().toUpperCase().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Anual income: ");
      double anualIncome = sc.nextDouble();

      if (validateTypeOfTaxPayer == 'I') {
        System.out.print("Health expenditures: ");
        double healthExpenditures = sc.nextDouble();

        list.add(new Individual(name, anualIncome, healthExpenditures));
      } else {
        System.out.print("Number of employees: ");
        int numberOfEmployees = sc.nextInt();

        list.add(new Company(name, anualIncome, numberOfEmployees));
      }
    }

    System.out.println();
    System.out.println("TAXES PAID:");

    double sum = 0.0;
    for (TaxPayer taxPayer : list) {

      System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));

      sum += taxPayer.tax();
    }

    System.out.println();
    System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    sc.close();
  }
}
