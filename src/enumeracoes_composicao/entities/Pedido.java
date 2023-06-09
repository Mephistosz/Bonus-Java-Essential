package enumeracoes_composicao.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import enumeracoes_composicao.entities.enums.StatusPedido;

public class Pedido {

  private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
  private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  private LocalDateTime data;
  private StatusPedido statusPedido;
  private Cliente cliente;

  private List<OrderItem> items = new ArrayList<>();

  public Pedido() {
  }

  public Pedido(LocalDateTime data, StatusPedido statusPedido, Cliente cliente) {
    this.data = data;
    this.statusPedido = statusPedido;
    this.cliente = cliente;
  }

  public LocalDateTime getData() {
    return data;
  }

  public void setData(LocalDateTime data) {
    this.data = data;
  }

  public StatusPedido getStatusPedido() {
    return statusPedido;
  }

  public void setStatusPedido(StatusPedido statusPedido) {
    this.statusPedido = statusPedido;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public List<OrderItem> getItems() {
    return items;
  }

  public void addItems(OrderItem item) {
    items.add(item);
  }

  public void removeItems(OrderItem item) {
    items.remove(item);
  }

  public Double total() {
    double sum = 0.0;
    for (OrderItem orderItem : items) {
      sum += orderItem.subTotal();
    }
    return sum;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: " + getData().format(fmt) + "\n");
    sb.append("Order status: " + getStatusPedido() + "\n");
    sb.append("Client: " + getCliente().getName() + " (" + getCliente().getDateDeNascimento().format(fmt1) + ") - "
        + getCliente().getEmail() + "\n");
    sb.append("Order items:" + "\n");
    for (OrderItem orderItem : items) {
      sb.append(orderItem.getProduto().getName() + ", $" + String.format("%.2f", orderItem.getPreco()) + ", Quantity: "
          + orderItem.getQuantity() + ", Subtotal: $" + String.format("%.2f", orderItem.subTotal()) + "\n");
    }
    sb.append("Total price: $" + String.format("%.2f", total()));

    return sb.toString();
  }

}
