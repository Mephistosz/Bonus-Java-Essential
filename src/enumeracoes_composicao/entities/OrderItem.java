package enumeracoes_composicao.entities;

public class OrderItem {

  private Integer quantity;
  private Double preco;

  private Product produto;

  public OrderItem() {
  }

  public OrderItem(Integer quantity, Product produto) {
    this.quantity = quantity;
    this.preco = produto.getPreco();
    this.produto = produto;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public Product getProduto() {
    return produto;
  }

  public void setProduto(Product produto) {
    this.produto = produto;
  }

  public Double subTotal() {
    return quantity * preco;
  }

}
