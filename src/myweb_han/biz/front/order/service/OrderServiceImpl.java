package myweb_han.biz.front.order.service;

import java.util.List;

import myweb_han.biz.front.order.dao.OrderDao;
import myweb_han.biz.front.order.dao.OrderDaoImpl;
import myweb_han.entity.Orders;

public class OrderServiceImpl implements OrderService {
	OrderDao dao = new OrderDaoImpl();
	public void saveOrder(Orders orders) {
		dao.saveOrder(orders);
	}
	public List<Orders> queryOrders(String userId) {
		return dao.queryOrders(userId);
	}

}
