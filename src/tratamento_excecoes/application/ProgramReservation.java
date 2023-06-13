package tratamento_excecoes.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import tratamento_excecoes.model.entities.Reservation;
import tratamento_excecoes.model.exceptions.DomainException;

public class ProgramReservation {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    try {
      System.out.print("Room number: ");
      int roomNumber = sc.nextInt();
      System.out.print("Check-in date (dd/MM/yyyy): ");
      LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
      System.out.print("Check-out date (dd/MM/yyyy): ");
      LocalDate checkOut = LocalDate.parse(sc.next(), fmt);

      Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);

      System.out.println(reservation);

      System.out.println();
      System.out.println("Enter data to update the reservation:");
      System.out.print("Check-in date (dd/MM/yyyy): ");
      checkIn = LocalDate.parse(sc.next(), fmt);
      System.out.print("Check-out date (dd/MM/yyyy): ");
      checkOut = LocalDate.parse(sc.next(), fmt);

      reservation.updateDates(checkIn, checkOut);

      System.out.println(reservation);
    } catch (IllegalArgumentException | InputMismatchException | DateTimeParseException | DomainException e) {
      System.out.println(e.getMessage());
    }

    sc.close();
  }
}
