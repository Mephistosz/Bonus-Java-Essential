package datas.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {
  public static void main(String[] args) {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    LocalDate d01 = LocalDate.now(); // data sem horas
    LocalDateTime d02 = LocalDateTime.now(); // data com horas
    Instant d03 = Instant.now(); // data sem horas, porem como GMT

    LocalDate d04 = LocalDate.parse("2023-06-06"); // texto para objeto, sem horas
    LocalDateTime d05 = LocalDateTime.parse("2023-06-06T06:03:01"); // texto para objeto, com horas
    Instant d06 = Instant.parse("2023-06-06T06:03:01Z"); // texto para objeto, com horas, porem como GMT
    Instant d07 = Instant.parse("2023-06-06T06:03:01-03:00"); // texto para objeto, com horas, porem como GMT e fuso

    LocalDate d08 = LocalDate.parse("06/06/2023", fmt1); // texto para objeto, sem horas, para ISO 8601
    LocalDateTime d09 = LocalDateTime.parse("06/06/2023T06:26:01", fmt2); // texto para objeto, com horas, para ISO 8601
    LocalDateTime d10 = LocalDateTime.parse("06/06/2023 06:26:01", fmt3); // texto para objeto, sem horas, para ISO 8601

    LocalDate d11 = LocalDate.of(2023, 6, 6); // valores separados para ISO 8601
    LocalDateTime d12 = LocalDateTime.of(2023, 6, 6, 6, 32, 1); // valores separados para ISO 8601, com horas

    System.out.println("d01 = " + d01);
    System.out.println("d02 = " + d02);
    System.out.println("d03 = " + d03);
    System.out.println("d04 = " + d04);
    System.out.println("d05 = " + d05);
    System.out.println("d06 = " + d06);
    System.out.println("d07 = " + d07);
    System.out.println("d08 = " + d08);
    System.out.println("d09 = " + d09);
    System.out.println("d10 = " + d10);
    System.out.println("d11 = " + d11);
    System.out.println("d12 = " + d12);

  }
}
