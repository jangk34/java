package jsjspone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;   // ctrl + shift + o 를 누르면 전부 임포트


@SuppressWarnings("serial")
public class ServletTest extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
									throws ServletException, IOException {
		int total = 0 ;
		for (int cnt=1; cnt<101; cnt++)
		total += cnt;	
		
		response.setContentType("text/html;charset=euc-kr"); // 문서타입 설정
		
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>1부터 100까지 더하는 서블릿</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("1부터 100까지의 합은 = %d", total);
		out.println("</BODY>");
		out.println("</HTML>");
		
		
		out.println( "<HTML>");
		out.println( "<HEAD><TITLE>1부터 100까지의 합</TITLE></HEAD>");
		out.println( "<BODY>"); int total1 = 0; 
		for (int cnt = 1; cnt <= 100; cnt++) 
			total += cnt; out.print( "1부터 100까지 더한 값은? ");
			out.println(total1); 
			out.println( "</BODY>" ); 
			out.println( "</HTML>");
			
		out.println("");
 
			
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
