package contrutores.entities;

public class Conta {
  int numero;
  String nome;
  double saldo;

  public Conta(int numero, String nome) {
    this.numero = numero;
    this.nome = nome;
  }

  public Conta(int numero, String nome, double depositoInicial) {
    this.numero = numero;
    this.nome = nome;
    deposito(depositoInicial);
  }

  public int getNumero() {
    return numero;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSaldo() {
    return saldo;
  }

  public void deposito(double saldo) {
    this.saldo += saldo;
  }

  public void saque(double saldo) {
    this.saldo -= saldo + 5.00;
  }

  @Override
  public String toString() {
    return "Conta " + numero + ", nome: " + nome + ", saldo: $ " + String.format("%.2f", saldo);
  }

}
