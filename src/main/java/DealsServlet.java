import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Deals")
public class DealsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = (String) request.getSession().getAttribute("name");
        String favorite = (String) request.getSession().getAttribute("favorite");

        if (name != null && favorite != null) {
            request.getRequestDispatcher("WEB-INF/deals.jsp").forward(request, response);
        } else {
            response.sendRedirect("/Cookies");
        }

    }
}
