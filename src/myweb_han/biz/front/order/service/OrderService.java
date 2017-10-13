package myweb_han.biz.front.order.service;

import java.util.List;

import myweb_han.entity.Orders;

public interface OrderService {
	public void saveOrder(Orders orders);
	public List<Orders> queryOrders(String userId);
}
