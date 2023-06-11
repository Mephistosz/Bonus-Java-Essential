package heranca.entities;

public class OutSourceEmployee extends Employee {

  private Double additionalCharge;

  public OutSourceEmployee() {
    super();
  }

  public OutSourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
    super(name, hours, valuePerHour);
    this.additionalCharge = additionalCharge;
  }

  public Double getAdditionalCharge() {
    return additionalCharge;
  }

  public void setAdditionalCharge(Double additionalCharge) {
    this.additionalCharge = additionalCharge;
  }

  public Double additionalCharge() {
    return additionalCharge * 1.10;
  }

  @Override
  public Double payment() {
    return super.payment() + additionalCharge();
  }
}
