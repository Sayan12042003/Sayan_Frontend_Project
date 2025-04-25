package servletpack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Index extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Demonstrating POST Request</title>");            
            out.println("<link rel='stylesheet' type='text/css' href='Design.css'></link>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div class=formatdiv>");
            out.println("<form method=post action=PostParameter>");
            out.println("<table width=100%>");
            out.println("<tr>");
            out.println("<td colspan=2><p class=format1>ENTER USER PROFILE</p>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>ENTER USER ID");
            out.println("<td><INPUT type=text name=user_id class=format2>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>ENTER PASSWORD");
            out.println("<td><INPUT type=PASSWORD name=password class=format2>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>SELECT SEX");
            out.println("<td><INPUT type=radio name=sexual_status value=Male> Male");
            out.println("    <INPUT type=radio name=sexual_status value=Female> Female");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>ENTER DATE OF BIRTH");
            out.println("<td><INPUT type=DATE name=dob class=format2>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>HOUSE NO. AND STREET");
            out.println("<td><INPUT type=TEXT name=houseno class=format2>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>SELECT CITY");
            out.println("<td><SELECT name=city size=0 class=format2>");
            out.println("<option value=None>--Select City--</option>");
            out.println("<option value=Delhi>Delhi</option>");
            out.println("<option value=Mumbai>Mumbai</option>");
            out.println("<option value=Kolkata>Kolkata</option>");
            out.println("<option value=Bangaluru>Bangaluru</option>");
            out.println("</SELECT>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>SELECT COUNTRY");
            out.println("<td><SELECT name=country size=0 class=format2>");
            out.println("<option value=None>--Select Country--</option>");
            out.println("<option value=India>India</option>");
            out.println("<option value=Bhutan>Bhutan</option>");
            out.println("<option value=Bangladesh>Bangladesh</option>");
            out.println("<option value=Nepal>Nepal</option>");
            out.println("</SELECT>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>ENTER PIN CODE");
            out.println("<td><INPUT type=TEXT name=pin class=format2>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td align=center><INPUT type=SUBMIT class=format3>");
            out.println("<td align=center><INPUT type=RESET  class=format3>");
            out.println("</tr>");
            
            out.println("</table>");
            out.println("</form>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
        catch(IOException ex){}
        catch(Exception ex){}
    }
}
