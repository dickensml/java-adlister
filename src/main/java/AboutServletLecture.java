import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/about")
public class AboutServletLecture extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // check for a query string parameter of name and display it
        String name = request.getParameter("name");

        if (name == null) {
            name = "User";
        }

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String html = "<h1>About Us</h1>";
        html += "<h2>More HTML</h2>";
        html += "<h2>Another Line</h2>";
        // add a link to the contact us page
        html += "<a href='/contact-us'>Contact Us</a>";
        html += "<h2>Name is: " + name + "</h2>";


        // add a form to add your email address to a mailing list

        html += "<h3>Email List Sign Up</h3>";
        html += "<form action='/about' method='POST'>" +
                "<label>Email</label>" +
                "<input name='email' type='email' placeholder='Enter email'>" +
                "<button>Submit</button>" +
                "</form>";
        if (request.getParameter("saved") != null) {
            html += "<script>alert('You saved your email!!!')</script>";
        }

        out.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        System.out.println(email); // print out form input here
        // saved the email to database
        resp.sendRedirect("/about?saved");
    }
}
