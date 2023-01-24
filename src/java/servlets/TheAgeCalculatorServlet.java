
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
public class TheAgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
      String age = request.getParameter("age");
      Integer ageInt = (Integer.parseInt(age)) + 1;
     
      request.setAttribute("age", ageInt);
      
      if(age.equals("")){
          String test = "You must give your current age";
          request.setAttribute("test", test);
           
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
          return;
      }
      if(age instanceof String) {
          String notInt = "You must enter a number";
          request.setAttribute("notInt", notInt);
          
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                  .forward(request, response);
      }
     
        getServletContext().getRequestDispatcher("/WEB-INF/sayAge.jsp")
                .forward(request, response);
        }
    

}
