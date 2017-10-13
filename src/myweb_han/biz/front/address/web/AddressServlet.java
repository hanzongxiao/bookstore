package myweb_han.biz.front.address.web;



import myweb_han.biz.front.address.service.AddressService;
import myweb_han.biz.front.address.service.AddressServiceImpl;
import myweb_han.entity.Address;
import myweb_han.entity.Users;
import myweb_han.util.BaseServlet;
import myweb_han.util.WebUtil;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ע�⣺��������з����������ڵ�¼֮�����ִ�У�����
 * @author APPle
 *
 */
public class AddressServlet extends BaseServlet {
	
	AddressService service = new AddressServiceImpl();
	
	/**
	 * ����ջ���ַ
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 *  /address?action=addAddress
	 */
	public void addAddress(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1)��������
		Address addr = WebUtil.copyRequestToBean(request, Address.class);
		
		//���õ�ǰ�û�id
		//�õ���ǰ��¼�û�
		Users loginUser = (Users)request.getSession().getAttribute("user");
		addr.setUser(loginUser);
		
		//2)���÷�������
		service.save(addr);

		//3)���ص�addback.jspҳ��
		response.sendRedirect(request.getContextPath()+"/jsp/front/address/addback.jsp");
	}
	
	/**
	 * �����û�id��ѯ�ջ���ַ
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 *  /address?action=queryAddress
	 */
	public void queryAddress(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			//��sesssion��ȡ����ǰ��¼�û�����
			Users loginUser = (Users)request.getSession().getAttribute("user");
			
			//��ѯ��Ӧ�ĵ�ַ
			List<Address> addressList = service.queryAddress(loginUser.getId());
			
			//�������ݣ�Ȼ����ת���б�ҳ��
			request.setAttribute("addressList", addressList);
			request.getRequestDispatcher("/jsp/front/address/list.jsp").forward(request, response);
	}
}
