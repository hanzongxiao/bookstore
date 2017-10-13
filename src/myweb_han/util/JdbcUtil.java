package myweb_han.util;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * jdbc开发工具类
 * 
 * @author APPle
 *
 */
public class JdbcUtil {
	// 创建连接池工具对象，使用c3p0连接池
	private static ComboPooledDataSource ds = new ComboPooledDataSource();

	// 获取连接池对象的方法
	public static DataSource getDataSource() {
		return ds;
	}

	// 关闭资源
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
