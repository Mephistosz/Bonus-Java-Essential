package enumeracoes_composicao.entities;

import java.time.LocalDate;

public class Cliente {

  private String name;
  private String email;
  private LocalDate dateDeNascimento;

  public Cliente() {
  }

  public Cliente(String name, String email, LocalDate dateDeNascimento) {
    this.name = name;
    this.email = email;
    this.dateDeNascimento = dateDeNascimento;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getDateDeNascimento() {
    return dateDeNascimento;
  }

  public void setDateDeNascimento(LocalDate dateDeNascimento) {
    this.dateDeNascimento = dateDeNascimento;
  }

}
