package enumeracoes_composicao.application;

import java.util.Date;

import enumeracoes_composicao.entities.Order;
import enumeracoes_composicao.entities.enums.OrderStatus;

public class Program {
  public static void main(String[] args) {

    Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

    System.out.println(order);

    OrderStatus os1 = OrderStatus.DELIVERED;
    OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // String para enum

    System.out.println(os1);
    System.out.println(os2);
  }
}
