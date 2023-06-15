package interfaces.model.services;

import java.time.Duration;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Invoice;

public class RentalService {
  private Double pricePerHour;
  private Double pricePerDay;

  private TaxService taxService;

  public RentalService() {
  }

  public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
    this.pricePerHour = pricePerHour;
    this.pricePerDay = pricePerDay;
    this.taxService = taxService;
  }

  public Double getPricePerHour() {
    return pricePerHour;
  }

  public void setPricePerHour(Double pricePerHour) {
    this.pricePerHour = pricePerHour;
  }

  public Double getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(Double pricePerDay) {
    this.pricePerDay = pricePerDay;
  }

  public void processInvoice(CarRental carRental) {
    Duration duration = Duration.between(carRental.getStart(), carRental.getFinish());
    double durationRental = Math.ceil(duration.toMinutes() / 60.0);

    double basicPayment;

    if (durationRental > 12) {
      double durationInDays = (long) Math.ceil(duration.toHours() / 24.0);

      basicPayment = pricePerDay * durationInDays;
    } else {
      basicPayment = pricePerHour * durationRental;
    }

    double tax = basicPayment * taxService.tax(basicPayment);

    carRental.setInvoice(new Invoice(basicPayment, tax));
  }

}
