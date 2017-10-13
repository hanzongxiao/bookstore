package myweb_han.biz.front.user.dao;


import myweb_han.entity.Users;

public interface UserDao {
	//根据名称找用户对象
	public Users findByName(String name);
	public Users findById(String id);
}
