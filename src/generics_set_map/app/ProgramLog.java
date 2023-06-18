package generics_set_map.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import generics_set_map.model.entities.LogEntry;

public class ProgramLog {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter file full path: ");
    String path = sc.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String line = br.readLine();

      Set<LogEntry> set = new HashSet<>();

      while (line != null) {
        String[] fields = line.split(" ");
        set.add(new LogEntry(fields[0], Instant.parse(fields[1])));
        line = br.readLine();
      }

      System.out.println("Total users: " + set.size());

      for (LogEntry logEntry : set) {
        System.out.println(logEntry);
      }

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    sc.close();
  }
}
