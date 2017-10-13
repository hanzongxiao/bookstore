package myweb_han.biz.front.address.service;

import java.util.List;

import myweb_han.biz.front.address.dao.AddressDao;
import myweb_han.biz.front.address.dao.AddressDaoImpl;
import myweb_han.entity.Address;

public class AddressServiceImpl implements AddressService {
	
	AddressDao dao = new AddressDaoImpl();
	
	public void save(Address address) {
		dao.save(address);
	}
	
	public List<Address> queryAddress(String userId){
		return dao.queryAddress(userId);
	}

}
