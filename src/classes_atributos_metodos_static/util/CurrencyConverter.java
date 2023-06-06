package classes_atributos_metodos_static.util;

public class CurrencyConverter {

  public static final double IOF_PORCENTAGEM = 0.06;

  private CurrencyConverter() {
  }

  public static double valorPago(double valorDolar, double quantidadeDolares) {
    return valorDolar * quantidadeDolares * (1.0 + IOF_PORCENTAGEM);
  }

}
