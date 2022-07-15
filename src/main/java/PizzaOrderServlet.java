import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/pizza-order")

    public class PizzaOrderServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            RequestDispatcher view = request.getRequestDispatcher("/pizza-order.jsp");
            view.forward(request, response);
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String crust = request.getParameter("crust");
            String sauce = request.getParameter("sauce");
            String size = request.getParameter("size");
            String[] toppings = request.getParameterValues("toppings");
            String address = request.getParameter("address");

            System.out.println("crust = " + crust);
            System.out.println("sauce = " + sauce);
            System.out.println("size = " + size);
            System.out.println("size = " + address);


            for (String topping: toppings) {
                System.out.println("topping = " + topping);
            }

        }

    }

