package generics_set_map.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramMapExercise {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter file full path: ");
    String path = sc.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      Map<String, Integer> map = new HashMap<>();

      String line = br.readLine();

      while (line != null) {
        String[] fields = line.split(",");

        String name = fields[0];
        int count = Integer.parseInt(fields[1]);

        if (map.containsKey(name)) {
          int sum = map.get(name);
          map.put(name, count + sum);
        } else {
          map.put(name, count);
        }

        line = br.readLine();
      }

      // Ordena o Map por seus valores
      Map<String, Integer> sortedMap = new LinkedHashMap<>();
      map.entrySet().stream()
          .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
          .forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

      for (Map.Entry<String, Integer> x : sortedMap.entrySet()) {
        System.out.println(x.getKey() + " - " + x.getValue());
      }

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    sc.close();
  }
}
