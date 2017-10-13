package myweb_han.biz.front.user.dao;

import myweb_han.entity.Users;
import myweb_han.util.BaseDao;
import myweb_han.util.JdbcUtil;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class UserDaoImpl extends BaseDao<Users> implements UserDao {

	public Users findByName(String name) {
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			return (Users)qr.query("select * from users where name=?", 
						new BeanHandler(Users.class),
						new Object[]{name});
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
