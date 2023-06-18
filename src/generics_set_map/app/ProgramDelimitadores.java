package generics_set_map.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import generics_set_map.model.entities.Product;
import generics_set_map.model.services.CalculationService;

public class ProgramDelimitadores {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    String path = "C:\\temp\\testeDelimitadores.txt";

    List<Product> list = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String productCSV = br.readLine();
      while (productCSV != null) {
        String[] fields = productCSV.split(",");
        list.add(new Product(fields[0], Double.parseDouble(fields[1])));
        productCSV = br.readLine();
      }

      System.out.println(CalculationService.max(list));

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}