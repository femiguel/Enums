package application;

import java.util.Date;

import entities.enums.OrderStatus;
import entitites.Order;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.peding_payment);
	
		System.out.println(order);
		
		OrderStatus o1 = OrderStatus.delivered;
		OrderStatus o2 = OrderStatus.valueOf("Delivered");
		System.out.println(o1);
		System.out.println(o2);
	}
}
