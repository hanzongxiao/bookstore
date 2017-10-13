package myweb_han.biz.admin.types.service;

import myweb_han.biz.admin.types.dao.TypesDao;
import myweb_han.biz.admin.types.dao.TypesDaoImpl;
import myweb_han.entity.Types;

import java.util.List;

public class TypesServiceImpl implements TypesService {
	TypesDao dao = new TypesDaoImpl();
	
	public List<Types> queryTypes() {
		return dao.findAll();
	}

	public void saveTypes(Types type) {
		dao.saveTypes(type);
	}

}
