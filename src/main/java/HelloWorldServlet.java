import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")

public class HelloWorldServlet extends HttpServlet {

    int pageViews = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        pageViews += 1;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        if (name != null) {
            out.println("<h2>Hello, " + name + "!</h2>");
        }
//        } else{
//            out.println("<h2>Hello World!</h2>");
//        }
        response.getWriter().println("<h2>Hello, World!</h2" +
                ">");

        response.getWriter().println("<h3>Page Count: " + pageViews + "</h3>");
    }

}
