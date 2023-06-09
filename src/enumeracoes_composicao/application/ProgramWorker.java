package enumeracoes_composicao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import enumeracoes_composicao.entities.Department;
import enumeracoes_composicao.entities.HourContract;
import enumeracoes_composicao.entities.Worker;
import enumeracoes_composicao.entities.enums.WorkerLevel;

public class ProgramWorker {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter department's name: ");
    Department department = new Department(sc.nextLine());

    System.out.println("Enter worker data:");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Level: ");
    WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());
    System.out.print("Base salary: ");
    Double baseSalary = sc.nextDouble();

    System.out.print("How many contracts to this worker? ");
    int nContracts = sc.nextInt();

    Worker worker = new Worker(name, workerLevel, baseSalary, department);

    for (int i = 1; i <= nContracts; i++) {

      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      System.out.printf("Enter contract #%d data:", i);
      System.out.print("Date (DD/MM/YYYY): ");
      sc.nextLine();
      LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
      System.out.print("Value per hour: ");
      Double valuePerHour = sc.nextDouble();
      System.out.print("Duration (hours): ");
      Integer hours = sc.nextInt();

      worker.addContract(new HourContract(date, valuePerHour, hours));

    }

    System.out.println();
    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    sc.nextLine();
    String dateIncome = sc.nextLine();

    int month = Integer.parseInt(dateIncome.substring(0, 2));
    int year = Integer.parseInt(dateIncome.substring(3));

    System.out.printf("Name: %s%n", worker.getName());
    System.out.printf("Department: %s%n", worker.getDepartment().getName());
    System.out.printf("Income for %s: %.2f", dateIncome, worker.income(year, month));

    sc.close();
  }
}
