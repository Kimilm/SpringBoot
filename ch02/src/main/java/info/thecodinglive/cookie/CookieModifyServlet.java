package info.thecodinglive.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet(urlPatterns= {"/modicookie"})
public class CookieModifyServlet extends HttpServlet {
	   
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html");
    	resp.setCharacterEncoding("utf-8");
    	PrintWriter out = resp.getWriter();
    	out.println("<html><head><title>쿠키 읽기</title></head><body>");
    	
    	Cookie[] cookies = req.getCookies();
    	if (cookies != null) {
    		for (Cookie cookie : cookies) {
    			if (cookie.getName().equals("jpub")) {
    				Cookie modifiedCookie = new Cookie("jpub", "read");
    				resp.addCookie(modifiedCookie);
    			}
    		}
    	}
    	
    	out.println("<a href='/readcookie'>readcookie</a></body></html>");
    }
}
