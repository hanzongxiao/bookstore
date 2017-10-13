package myweb_han.biz.admin.types.dao;

import myweb_han.entity.Types;
import myweb_han.util.BaseDao;
import myweb_han.util.JdbcUtil;
import myweb_han.util.WebUtil;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class TypesDaoImpl extends BaseDao<Types> implements TypesDao {

	public void saveTypes(Types type) {
		try {
			QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
			qr.update("insert into types(id,name,descr) values(?,?,?)",
						new Object[]{
						WebUtil.uuid(),
						type.getName(),
						type.getDescr()
			});
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	
	/*@Test
	public void test(){
		TypesDaoImpl dao = new TypesDaoImpl();
		List<Types> list = dao.findAll();
		for (Types types : list) {
			System.out.println(types);
		}
	}*/
}
