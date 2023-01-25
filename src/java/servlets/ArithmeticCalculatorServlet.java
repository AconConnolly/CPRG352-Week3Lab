
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexc
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        while (true) {
            if(first.equals("") || second.equals("")){
                String test = "You must give your current age";
                request.setAttribute("test", test);

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                      .forward(request, response);
                break;
            }
            try {
                Integer firstInt = Integer.parseInt(first);
                Integer secondInt = Integer.parseInt(second);
                
                if ()

                request.setAttribute("age", ageInt);
                 getServletContext().getRequestDispatcher("/WEB-INF/sayAge.jsp")
                        .forward(request, response);
                break;
            } catch (NumberFormatException ex) {
                String notInt = "You must enter a number";
              request.setAttribute("notInt", notInt);

              getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                      .forward(request, response);
            }
        }
        
    }

}
