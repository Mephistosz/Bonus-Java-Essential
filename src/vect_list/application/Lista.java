package vect_list.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    final String separador = "---------------------";

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add(2, "Marco");

    System.out.println(list.size());

    for (String x : list) {
      System.out.println(x);
    }

    System.out.println(separador);

    list.removeIf(x -> x.charAt(0) == 'M');

    for (String x : list) {
      System.out.println(x);
    }

    System.out.println(separador);

    System.out.println("Index of Bob: " + list.indexOf("Bob"));
    System.out.println("Index of Marco: " + list.indexOf("Marco"));

    System.out.println(separador);

    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

    for (String x : result) {
      System.out.println(x);
    }

    System.out.println(separador);

    String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

    System.out.println(name);
  }

}