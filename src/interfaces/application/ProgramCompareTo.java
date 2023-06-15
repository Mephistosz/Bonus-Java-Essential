package interfaces.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.model.entities.Employee;

public class ProgramCompareTo {
  public static void main(String[] args) {

    List<Employee> list = new ArrayList<>();

    String path = "C:\\temp\\testeCompareTo.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String employeeCSV = br.readLine();

      while (employeeCSV != null) {
        String[] fields = employeeCSV.split(",");
        list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
        employeeCSV = br.readLine();
      }

      Collections.sort(list);

      for (Employee s : list) {
        System.out.println(s.getName() + " - " + s.getSalary());
      }

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}