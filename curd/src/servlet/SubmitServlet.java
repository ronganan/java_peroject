package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hero;
import net.sf.json.JSONObject;
public class SubmitServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException {
		
		String data = req.getParameter("data");
		System.out.println("服务端接收到的数据是：" +data);
		
		JSONObject json = JSONObject.fromObject(data);
		System.out.println("转换为JSON对象之后是："+ json);
		
		Hero hero = (Hero)JSONObject.toBean(json,Hero.class); 
        System.out.println("转换为Hero对象之后是："+hero);
        
        // 获取一个对象
//        JSONObject json= new JSONObject();
//        
//        json.put("hero", JSONObject.fromObject(hero));
        // 获取多个对象    通过JSONSerializer.toJSON(heros)把集合转换为JSON字符串
//        String result =JSONSerializer.toJSON(heros).toString();
	}
}