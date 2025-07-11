package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = "/config",
    initParams = @WebInitParam(name = "Student", value = "Surya")
)
public class Configservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Getting init parameter
        String trainerName = getServletConfig().getInitParameter("Student");

        out.println("<html><body>");
        out.println("<h2>Student: " + trainerName + "</h2>");
        out.println("</body></html>");

        out.close(); // Properly close the writer
    }
}
