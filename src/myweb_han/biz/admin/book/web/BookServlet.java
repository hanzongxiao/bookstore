package myweb_han.biz.admin.book.web;



import myweb_han.biz.admin.book.service.BookService;
import myweb_han.biz.admin.book.service.BookServiceImpl;
import myweb_han.biz.admin.types.service.TypesService;
import myweb_han.biz.admin.types.service.TypesServiceImpl;
import myweb_han.entity.Books;
import myweb_han.entity.Types;
import myweb_han.util.BaseServlet;
import myweb_han.util.WebUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
/**
 * ��̨ͼ��ģ��
 * @author APPle
 *
 */
public class BookServlet extends BaseServlet {
	TypesService typeService = new TypesServiceImpl();
	BookService bookService = new BookServiceImpl();
	/**
	 * ��ת��admin/book/add.jsp,��ת֮ǰ�Ȳ�ѯ������Ϣ
	 */
	public void toAdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			List<Types> types = typeService.queryTypes();
			request.setAttribute("types", types);
			request.getRequestDispatcher("/jsp/admin/book/add.jsp").forward(request, response);
		
	}
	
	/**
	 * ���ͼ�飨���ϴ�����ͼ��ͼƬ�ļ���
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void saveBook(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		try {
			//1)����DiskFileItemFactory�����û����С���ͻ���Ŀ¼
			DiskFileItemFactory factory = new DiskFileItemFactory(10*1024, new File("e:/temps"));
			
			//2)����ServletFileUpload����
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			//3)���������ݣ�����file������ͨ����
			List<FileItem> list = upload.parseRequest(request);
			
			//4)����
			Books book = new Books();
			//�ñ������ڴ洢������Ϣ
			List<String> types = new ArrayList<String>();
			if(list!=null){
				for (FileItem item : list) {
					//�ж��Ƿ�����ͨ��
					if(item.isFormField()){
						//��ͨ��
						if(item.getFieldName().equals("name")){
							book.setName(item.getString("utf-8"));
						}
						if(item.getFieldName().equals("price")){
							book.setPrice(Double.parseDouble(item.getString("utf-8")));
						}
						if(item.getFieldName().equals("auth")){
							book.setAuth(item.getString("utf-8"));
						}
						if(item.getFieldName().equals("rebate")){
							book.setRebate(Double.parseDouble(item.getString("utf-8")));
						}
						//����ͼ����࣬�м��������ִ�л�ȡ����
						
						if(item.getFieldName().equals("types")){
							types.add(item.getString("utf-8"));
						}
						
					}else{
						//file�ļ�
						//1)�����ļ���Ӳ����
						//1.1 ����һ��Ψһ���ļ���
						String uuid = WebUtil.uuid();
						String name = item.getName();
						name = uuid+name.substring(name.lastIndexOf("."));
						
						//1.2 ���浽�������ĵ�ǰ��Ŀ��imgĿ¼��
						//�õ���ǰ��Ŀ��ĳ��Ŀ¼�����ļ����ľ���·��
						String path = this.getServletContext().getRealPath("/imgs");
						FileUtils.copyInputStreamToFile(item.getInputStream(), new File(path+"/"+name));
						//ɾ����ʱ�ļ�
						item.delete();
						
						book.setImg(name);
						
					}
				}
				//����ͼ��ķ���
				book.setTypesId(types);
			}
			//��������
			bookService.saveBook(book);
			
			
			response.sendRedirect(request.getContextPath()+"/jsp/admin/book/addsucc.jsp");
			
		} catch (FileUploadException e) {
			e.printStackTrace();
		}

	}
}
