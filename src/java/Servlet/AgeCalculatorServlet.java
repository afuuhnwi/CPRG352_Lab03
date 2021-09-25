
package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 794974
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // loading the form 
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        return;
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String _age = (request.getParameter("age"));
        // ***** Form Validation section*********
        // checks if the string is not null and not empty
        
        if( _age == null || _age.equals("")){
            
            request.setAttribute("message", "*You must give your current age");
            
        }
        // statment checks if age entered is atleast a single digit interger
        else if(!_age.matches("\\d+")){
            
            request.setAttribute("message", "*You must enter a number");
            
        }
        else {
            
            int _age1 = Integer.parseInt(request.getParameter("age"));
            request.setAttribute("Age", _age1);
            request.setAttribute("message", "Your age next birthday will be " + (_age1 + 1) );
        }
        //******** End of Validation*******
        
        // redeploy page after executing code in oder for it to be in effect
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        
        return;
        
        
       
    }
}
