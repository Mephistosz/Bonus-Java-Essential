package enumeracoes_composicao.entities;

public class Product {

  private String name;
  private Double preco;

  public Product() {
  }

  public Product(String name, Double preco) {
    this.name = name;
    this.preco = preco;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

}
