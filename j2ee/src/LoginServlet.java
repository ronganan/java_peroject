import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet{	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setCharacterEncoding("UTF-8"); 
		String name = req.getParameter("name");
		String pwd = req.getParameter("password");
		System.out.println(name + "," + pwd);		
		String html = null;
		if ("ÎÒ".equals(name) && "123".equals(pwd))
            html = "<div style='color:green'>µÇÂ¼³É¹¦</div>";
        else
            html = "<div style='color:red'>µÇÂ¼Ê§°Ü</div>"; 
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter  pw = res.getWriter();
		pw.println(html);
	}
}