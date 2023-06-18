package interfaces.model.entities;

public class Employee implements Comparable<Employee> {
  private String name;
  private Double salary;

  public Employee() {
  }

  public Employee(String name, Double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public int compareTo(Employee employee) {
    return getSalary().compareTo(employee.getSalary());
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((salary == null) ? 0 : salary.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (salary == null) {
      if (other.salary != null)
        return false;
    } else if (!salary.equals(other.salary))
      return false;
    return true;
  }

}
