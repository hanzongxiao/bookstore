package myweb_han.biz.front.address.dao;

import myweb_han.entity.Address;

import java.util.List;

public interface AddressDao {
	
	public void save(Address address);
	//�����û�id��ѯ��ַ�б�
	public List<Address> queryAddress(String userId);
}
