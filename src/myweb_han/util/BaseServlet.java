package myweb_han.util;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 具体业务的基类（通用代码）
 */
public class BaseServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 以下这段代码的共性：
		// 1）接收到action的参数 2）根据不同的参数值调用不同的方法（约定前提：方法名和action的参数值一致！）
		// 1)获取action的参数值
		String action = request.getParameter("action");
		// 2)根据action参数值决定执行什么功能
		/**
		 * 通过反射得到指定方法名的方法对象，且调用方法
		 */
		try {
			Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class,
					HttpServletResponse.class);
			// 执行方法
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
