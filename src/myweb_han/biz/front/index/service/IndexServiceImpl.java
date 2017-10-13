package myweb_han.biz.front.index.service;

import myweb_han.biz.front.index.dao.IndexDao;
import myweb_han.biz.front.index.dao.IndexDaoImpl;
import myweb_han.entity.Books;
import myweb_han.entity.Types;

import java.util.List;
/**
 * Ö÷Ò³µÄservice
 * @author APPle
 *
 */
public class IndexServiceImpl implements IndexService {
	IndexDao dao = new IndexDaoImpl();
	
	public List<Types> queryTypes() {
		return dao.queryTypes();
	}

	public List<Books> queryBooks(String typeId) {
		return dao.queryBooks(typeId);
	}

	public Books queryBook(String id) {
		return dao.queryBook(id);
	}

}
