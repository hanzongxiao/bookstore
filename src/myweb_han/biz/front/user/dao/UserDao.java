package myweb_han.biz.front.user.dao;


import myweb_han.entity.Users;

public interface UserDao {
	//�����������û�����
	public Users findByName(String name);
	public Users findById(String id);
}
