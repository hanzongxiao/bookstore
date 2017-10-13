package myweb_han.util;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * jdbc����������
 * 
 * @author APPle
 *
 */
public class JdbcUtil {
	// �������ӳع��߶���ʹ��c3p0���ӳ�
	private static ComboPooledDataSource ds = new ComboPooledDataSource();

	// ��ȡ���ӳض���ķ���
	public static DataSource getDataSource() {
		return ds;
	}

	// �ر���Դ
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
}
