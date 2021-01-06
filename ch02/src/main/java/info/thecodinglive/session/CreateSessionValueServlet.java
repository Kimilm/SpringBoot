package info.thecodinglive.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/createse"})
public class CreateSessionValueServlet extends HttpServlet {
	   
    @Override
    protected void doGet
    (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html");
    	resp.setCharacterEncoding("utf-8");
    	PrintWriter out = resp.getWriter();
    	out.println("<html><head><title>세션</title></head><body>");
    	out.println("<br/>");
    	
    	HttpSession session = req.getSession();
    	session.setAttribute("jpub", "book");
    	out.println("세션이 완성되었습니다.");
    	out.println("<a href='/readse'>세션 읽기</a></body></html>");

    }
}
