package enums.application;

import enums.entities.Order;
import enums.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os = OrderStatus.DELIVERED;
        OrderStatus os1 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os);
        System.out.println(os1);
    }
}
