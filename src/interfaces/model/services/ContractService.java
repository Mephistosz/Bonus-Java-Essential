package interfaces.model.services;

import java.time.LocalDate;

import interfaces.model.entities.Contract;
import interfaces.model.entities.Installment;

public class ContractService {

  private OnlinePaymentService onlinePaymentService;

  public ContractService() {
  }

  public ContractService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public OnlinePaymentService getOnlinePaymentService() {
    return onlinePaymentService;
  }

  public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public void processContract(Contract contract, Integer months) {

    double amountDividedByMonth = contract.getTotalValue() / months;

    for (int i = 1; i <= months; i++) {
      LocalDate dueDate = contract.getDate().plusMonths(i);

      double amountInstallment = onlinePaymentService.interest(amountDividedByMonth, i);
      amountInstallment += onlinePaymentService.paymentFee(amountInstallment);

      contract.addInstallment(new Installment(dueDate, amountInstallment));
    }
  }
}
