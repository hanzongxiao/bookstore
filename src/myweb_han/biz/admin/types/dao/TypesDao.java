package myweb_han.biz.admin.types.dao;

import myweb_han.entity.Types;

import java.util.List;

public interface TypesDao {
	public List<Types> findAll();
	//Ìí¼Ó·ÖÀà
	public void saveTypes(Types type);
}
