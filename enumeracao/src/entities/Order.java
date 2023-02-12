package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import enums.OrderStatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus status;
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	public Order() {
	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido Nº = " + id + ", Data do Pedido = " + formatter.format(moment) + ", Status = " + status ;
	}

	
}
