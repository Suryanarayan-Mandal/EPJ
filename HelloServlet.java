package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String context = " ";
        context += new String(Character.toChars(0x1F349));
        
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Hello World" +context);
}

}
