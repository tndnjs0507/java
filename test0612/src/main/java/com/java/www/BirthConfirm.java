package com.java.www;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class BirthConfirm
 */
@WebServlet("/BirthConfirm")
public class BirthConfirm extends HttpServlet {
	//form에 있는 모든 데이터는 request에 다 들어온다. 굉장히 중요!!!!!!!!!
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//한글처리
		System.out.println("doAction");
		String birth= request.getParameter("birth"); //request안에 있는 파라미터에 벌스를 가져와라!
		int num_birth = Integer.parseInt(birth);
		Date today = new Date(System.currentTimeMillis());
		int year = today.getYear();
		
		int age = 2023 - num_birth;
		System.out.println("년도 :");
		System.out.println("당신의 나이: " + age);
		String content="";
		if(age>=18) {
			content = "<h2 style='color:blue; font-weight:600;'>주류 판매가 가능합니다.</h2>";
		}else {
			content = "<h2 style='color:red; font-weight:600;'>미성년자! 주류판매 금지합니다.</h2>";
		}
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>미성년자 확인</title></head>");
		writer.println("<body>");
		writer.println(content);
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("doGet");
		doAction(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}
}