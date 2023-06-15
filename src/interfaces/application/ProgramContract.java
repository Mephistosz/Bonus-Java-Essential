package interfaces.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.model.entities.Contract;
import interfaces.model.entities.Installment;
import interfaces.model.services.ContractService;
import interfaces.model.services.PaypalService;

public class ProgramContract {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Entre os dados do contrato: ");
    System.out.print("Numero: ");
    int number = sc.nextInt();

    System.out.print("Data (dd/MM/yyyy): ");
    LocalDate date = LocalDate.parse(sc.next(), fmt);

    System.out.print("Valor do contrato: ");
    double totalValue = sc.nextDouble();

    System.out.print("Entre com o numero de parcelas: ");
    int numberOfInstallments = sc.nextInt();

    Contract contract = new Contract(number, date, totalValue);

    ContractService cs = new ContractService(new PaypalService());

    cs.processContract(contract, numberOfInstallments);

    System.out.println("Parcelas:");

    for (Installment installment : contract.getInstallments()) {
      System.out.println(installment);
    }

    sc.close();
  }
}