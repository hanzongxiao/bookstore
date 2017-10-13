package myweb_han.biz.front.address.service;

import java.util.List;

import myweb_han.entity.Address;

public interface AddressService {
	public void save(Address address);
	public List<Address> queryAddress(String userId);
}
