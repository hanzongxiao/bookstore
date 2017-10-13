package myweb_han.biz.admin.book.service;

import myweb_han.biz.admin.book.dao.BookDao;
import myweb_han.biz.admin.book.dao.BookDaoImpl;
import myweb_han.entity.Books;

public class BookServiceImpl implements BookService {
	BookDao dao = new BookDaoImpl();
	
	public void saveBook(Books book) {
		dao.saveBook(book);
	}

}
