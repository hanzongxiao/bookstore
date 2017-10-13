package myweb_han.biz.front.index.service;

import myweb_han.entity.Books;
import myweb_han.entity.Types;

import java.util.List;

public interface IndexService {

	public List<Types> queryTypes();

	public List<Books> queryBooks(String typeId);
	
	public Books queryBook(String id);
}
