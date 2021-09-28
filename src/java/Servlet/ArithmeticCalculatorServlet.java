
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 794974
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = "---";
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;   
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String _first = request.getParameter("first");
        String _second = request.getParameter("second");
        String message ="";
        String operator = request.getParameter("operator");
        if( !_first.matches("\\d+") || !_second.matches("\\d+") ||_first == null || _second == null || _first.equals("") || _second.equals("")){
            request.setAttribute("message","invalid");
        }
        else{
            int _first1 = Integer.parseInt(request.getParameter("first"));
            int _second1 = Integer.parseInt(request.getParameter("second"));
            
            request.setAttribute("place_first", _first1);
             request.setAttribute("place_second", _second1);
            int added_ans = _first1 + _second1;
            int subtract_ans = _first1 - _second1;
            int multiply_ans = _first1 * _second1;
            int mod_ans = _first1 % _second1;
            
          switch(operator){
              case "+":
                 request.setAttribute("message",added_ans);
                 break;
              case "-":
                  request.setAttribute("message",subtract_ans);
                  break;
              case "*":
                  request.setAttribute("message",multiply_ans);
                  break;
              case "%":
                request.setAttribute("message",mod_ans);
                break;
              default:
                  request.setAttribute("message", "---");
          }  
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }
}
