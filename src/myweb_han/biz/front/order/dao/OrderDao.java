package myweb_han.biz.front.order.dao;

import myweb_han.entity.Orders;

import java.util.List;

public interface OrderDao {
	//�¶���
	public void saveOrder(Orders orders);//orders��һ��Ҫ����List<OrderLine>
	//�����û�id��ѯ��Ӧ�Ķ���
	public List<Orders> queryOrders(String userId);
}
