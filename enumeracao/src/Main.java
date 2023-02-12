

import java.util.Date;

import entities.Order;
import enums.OrderStatus;

public class Main {

	public static void main(String[] args) {

Order order = new Order(1080, new Date(), OrderStatus.SHIPPED);

System.out.println(order);

	}

}
