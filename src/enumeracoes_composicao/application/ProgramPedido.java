package enumeracoes_composicao.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import enumeracoes_composicao.entities.Cliente;
import enumeracoes_composicao.entities.OrderItem;
import enumeracoes_composicao.entities.Pedido;
import enumeracoes_composicao.entities.Product;
import enumeracoes_composicao.entities.enums.StatusPedido;

public class ProgramPedido {
  public static void main(String[] args) {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter cliente data:");

    System.out.print("Name: ");
    String nome = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();
    System.out.print("Birth date (DD/MM/YYYY): ");
    LocalDate data = LocalDate.parse(sc.nextLine(), fmt);

    Cliente cliente = new Cliente(nome, email, data);

    System.out.println("Enter order data:");
    System.out.print("Status: ");
    StatusPedido statusPedido = StatusPedido.valueOf(sc.nextLine());

    Pedido pedido = new Pedido(LocalDateTime.now(), statusPedido, cliente);

    System.out.print("How many items to this order? ");
    int numeroEntregas = sc.nextInt();

    for (int i = 1; i <= numeroEntregas; i++) {

      System.out.printf("Enter #%d item data:%n", i);
      System.out.print("Product name: ");
      sc.nextLine();
      String nomeProduto = sc.nextLine();
      System.out.print("Product price: ");
      double precoProduto = sc.nextDouble();
      System.out.print("Quantity: ");
      int quantidadeProduto = sc.nextInt();

      Product produto = new Product(nomeProduto, precoProduto);
      OrderItem orderItem = new OrderItem(quantidadeProduto, produto);

      pedido.addItems(orderItem);
    }

    System.out.println();
    System.out.println("ORDER SUMMARY: ");
    System.out.println(pedido);

    sc.close();
  }
}
