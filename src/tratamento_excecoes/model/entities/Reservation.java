package tratamento_excecoes.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import tratamento_excecoes.model.exceptions.DomainException;

public class Reservation {

  private Integer roomNumber;
  private LocalDate checkIn;
  private LocalDate checkOut;

  private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public Reservation() {
  }

  public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
    this.roomNumber = roomNumber;
    updateDates(checkIn, checkOut);
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public LocalDate getCheckIn() {
    return checkIn;
  }

  public LocalDate getCheckOut() {
    return checkOut;
  }

  public Long duration() {
    return ChronoUnit.DAYS.between(checkIn, checkOut);
  }

  public void updateDates(LocalDate checkIn, LocalDate checkOut) {
    if (!checkOut.isAfter(checkIn)) {
      throw new DomainException("Error in reservation: Check-out date must be after check-in date");
    }
    if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())) {
      throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
    }
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  @Override
  public String toString() {
    return "Reservation : Room "
        + getRoomNumber()
        + ", check-in: "
        + getCheckIn().format(fmt)
        + ", check-out: "
        + getCheckOut().format(fmt)
        + ", "
        + duration()
        + " nights";
  }

}
