package classesAtributosMetodosStatic.entities;

public class Employee {
  public String name;
  double grossSalary;
  double tax;

  public Employee() {
  }

  public Employee(String name, double grossSalary, double tax) {
    this.name = name;
    this.grossSalary = grossSalary;
    this.tax = tax;
  }

  public double netSalary() {
    return grossSalary - tax;
  }

  public void increaseSalary(double percentage) {
    grossSalary += grossSalary * (percentage / 100);
  }
}
