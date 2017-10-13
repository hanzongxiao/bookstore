package myweb_han.biz.front.address.dao;

import myweb_han.entity.Address;

import java.util.List;

public interface AddressDao {
	
	public void save(Address address);
	//根据用户id查询地址列表
	public List<Address> queryAddress(String userId);
}
