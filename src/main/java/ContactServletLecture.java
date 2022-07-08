import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/contact-us")
public class ContactServletLecture extends HttpServlet {

    int pageViews = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        pageViews += 1;
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Contact Us</h1>");
        resp.getWriter().println("<h1>View Count: " + pageViews + "</h1>");
    }

}
