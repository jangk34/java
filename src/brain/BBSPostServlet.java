package brain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BBSPostServlet
 */
@WebServlet("/brain/bbs-post")
public class BBSPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BBSPostServlet() {

	}
	@SuppressWarnings("unused")
	private void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
		/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub ////// post�� �Ѿ�͵� get���� �ѱ�
		request.setCharacterEncoding("EUC-KR"); // ��������
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		response.setContentType("text/html;charset-euc-kr");
		PrintWriter out = response.getWriter(); 
		out.println( "<HTML>"); 
		out.println("<HEAD><TITLE>�Խ��� �۾��� - ��� ȭ��</TITLE></HEAD>"); 
		out.println( "<BODY>"); out.printf( "�̸�: %s <BR>" , name);
		out.printf( "����: %s <BR>", title); 
		out.println( "-----------<BR> "); 
		out.printf( "<PRE>%s</PRE> ", content);
		out.println( "-----------<BR>" ); 
		out.println( "����Ǿ����ϴ�. "); 
		out.println( "</BODY> ");
		out.println( "</HTML> ");
	}
}
