package interfaces.model.services;

public class BrazilTaxService implements TaxService {

  public Double tax(Double amount) {
    if (amount > 100.00) {
      return 0.15;
    }
    return 0.20;
  }

}
