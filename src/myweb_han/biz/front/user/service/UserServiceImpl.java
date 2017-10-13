package myweb_han.biz.front.user.service;

import myweb_han.biz.front.user.dao.UserDao;
import myweb_han.biz.front.user.dao.UserDaoImpl;
import myweb_han.entity.Users;

public class UserServiceImpl implements UserService {
	UserDao dao = new UserDaoImpl(); 
	
	public Users login(String name) {
		return dao.findByName(name);
	}

}
