
package servlets;

import java.io.IOException;
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
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String math = request.getParameter("math");
        
        
        while (true) {
            if(first.equals("") || second.equals("")){
                String test = "Invalid";
                request.setAttribute("test", test);
                

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                      .forward(request, response);
                break;
            }
            try {
                Double firstDouble = Double.parseDouble(first);
                Double secondDouble = Double.parseDouble(second);
                
                double total = 0;
                switch (math) {
                    case "+": 
                        total = firstDouble + secondDouble;
                        request.setAttribute("total", total);
                        break;
                    case "-": 
                        total = firstDouble - secondDouble;
                        request.setAttribute("total", total);
                        break;
                    case "*": 
                        total = firstDouble * secondDouble;
                        request.setAttribute("total", total);
                        break;
                    case "%": 
                        total = firstDouble / secondDouble;
                        request.setAttribute("total", total);
                        break;
                        
                }
                
                 getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
            } catch (NumberFormatException ex) {
                String notInt = "Invalid";
              request.setAttribute("notInt", notInt);

              getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                      .forward(request, response);
            }
        }
        
    }

}
