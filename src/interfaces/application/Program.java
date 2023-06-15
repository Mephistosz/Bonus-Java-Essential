package interfaces.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Vehicle;
import interfaces.model.services.BrazilTaxService;
import interfaces.model.services.RentalService;

public class Program {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("Enter with the datas to rental");
    System.out.print("Car model: ");
    Vehicle vehicle = new Vehicle(sc.nextLine());
    System.out.print("Withdraw (dd/MM/yyyy hh:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
    System.out.print("Return (dd/MM/yyyy hh:mm): ");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
    System.out.print("Enter with the price in hours: ");
    double pricePerHour = sc.nextDouble();
    System.out.print("Enter with the price in Days: ");
    double pricePerDay = sc.nextDouble();

    CarRental cr = new CarRental(start, finish, vehicle);

    RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

    rentalService.processInvoice(cr);

    System.out.println();
    System.out.println("INVOICE: ");
    System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
    System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
    System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().totalPayment()));

    sc.close();
  }
}
