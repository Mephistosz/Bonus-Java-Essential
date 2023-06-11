package heranca.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca.entities.ImportedProduct;
import heranca.entities.Product;
import heranca.entities.UsedProduct;

public class ProgramProduct {
  public static void main(String[] args) {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    List<Product> list = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {

      System.out.printf("Product #%d data:%n", i);

      System.out.print("Common, used or imported (c/u/i)? ");
      char typeProduct = sc.next().toUpperCase().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Price: ");
      double price = sc.nextDouble();

      if (typeProduct == 'C') {
        list.add(new Product(name, price));
      } else if (typeProduct == 'I') {
        System.out.print("Customs fee: ");
        double customsFee = sc.nextDouble();

        list.add(new ImportedProduct(name, price, customsFee));
      } else {
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        sc.nextLine();
        String date = sc.nextLine();

        list.add(new UsedProduct(name, price, LocalDate.parse(date, fmt)));
      }

    }

    System.out.println();
    System.out.println("PRICE TAGS:");

    for (Product product : list) {
      System.out.println(product.priceTag());
    }

    sc.close();
  }
}
