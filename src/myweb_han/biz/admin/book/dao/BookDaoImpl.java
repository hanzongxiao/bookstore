package myweb_han.biz.admin.book.dao;

import myweb_han.entity.Books;
import myweb_han.util.JdbcUtil;
import myweb_han.util.WebUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

public class BookDaoImpl implements BookDao {

	/**
	 * ����ͼ�飺
	 * 		1)����ͼ����Ϣ��books��
	 *      2������ͼ��ͷ���Ĺ�ϵ��Ϣ(һ��������ж������)
	 */
	public void saveBook(Books book) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			//��������
			conn.setAutoCommit(false);
			String bookId = WebUtil.uuid();
			//1)����ͼ����Ϣ��books��
			qr.update(conn,"insert into books(id,name,price,auth,img,rebate) values(?,?,?,?,?,?)",
					new Object[]{
					bookId,
					book.getName(),
					book.getPrice(),
					book.getAuth(),
					book.getImg(),
					book.getRebate()
			});
			
			//2)����ͼ��ͷ���Ĺ�ϵ��Ϣ(һ��������ж������)
			List<String> typesId = book.getTypesId();
			for (String id : typesId) {
				qr.update(conn,"insert into booktype(bookid,typeid) values(?,?)",
						new Object[]{
						bookId,
						id
				});
			}
			//�ύ����
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			//�ع�
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
