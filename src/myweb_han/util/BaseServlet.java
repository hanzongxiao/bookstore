package myweb_han.util;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����ҵ��Ļ��ࣨͨ�ô��룩
 */
public class BaseServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ������δ���Ĺ��ԣ�
		// 1�����յ�action�Ĳ��� 2�����ݲ�ͬ�Ĳ���ֵ���ò�ͬ�ķ�����Լ��ǰ�᣺��������action�Ĳ���ֵһ�£���
		// 1)��ȡaction�Ĳ���ֵ
		String action = request.getParameter("action");
		// 2)����action����ֵ����ִ��ʲô����
		/**
		 * ͨ������õ�ָ���������ķ��������ҵ��÷���
		 */
		try {
			Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class,
					HttpServletResponse.class);
			// ִ�з���
			method.invoke(this, request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
