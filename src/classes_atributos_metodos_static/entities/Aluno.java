package classes_atributos_metodos_static.entities;

public class Aluno {

  String nome;

  double nota1;
  double nota2;
  double nota3;

  public Aluno() {
  }

  public Aluno(String nome, double nota1, double nota2, double nota3) {
    this.nome = nome;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public double soma() {
    return (nota1 + nota2 + nota3);
  }

  public double pontosNecessarios() {
    if (soma() > 60) {
      return 0.0;
    } else {
      return 60 - soma();
    }
  }

  public void status() {
    if (pontosNecessarios() == 0) {
      System.out.println("PASSOU");
    } else {
      System.out.printf("REPROVOU%nFALTARAM %.2f PONTOS", pontosNecessarios());
    }
  }

}
