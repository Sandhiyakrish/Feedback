
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class First extends HttpServlet {

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     
         int Q =Integer.parseInt(request.getParameter("Quantity"));
         out.println("hello");
        

        if(Q>0)
        {
           out.println(Q*180);
        }
        else
         {
         out.println(Q*0);
            }
               
           
        }
        
    }
