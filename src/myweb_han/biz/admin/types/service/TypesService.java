package myweb_han.biz.admin.types.service;

import myweb_han.entity.Types;

import java.util.List;

public interface TypesService {
	public List<Types> queryTypes();
	public void saveTypes(Types type);
}
