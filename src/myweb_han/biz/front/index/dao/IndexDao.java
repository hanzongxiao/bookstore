package myweb_han.biz.front.index.dao;

import myweb_han.entity.Books;
import myweb_han.entity.Types;

import java.awt.print.Book;
import java.util.List;

public interface IndexDao {

	// 查询图书分类
	public List<Types> queryTypes();

	// 根据分类id查询对应的图书
	public List<Books> queryBooks(String typeId);

	// 根据id查询对应的图书
	public Books queryBook(String id);
}
