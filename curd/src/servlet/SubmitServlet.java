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
		System.out.println("����˽��յ��������ǣ�" +data);
		
		JSONObject json = JSONObject.fromObject(data);
		System.out.println("ת��ΪJSON����֮���ǣ�"+ json);
		
		Hero hero = (Hero)JSONObject.toBean(json,Hero.class); 
        System.out.println("ת��ΪHero����֮���ǣ�"+hero);
        
        // ��ȡһ������
//        JSONObject json= new JSONObject();
//        
//        json.put("hero", JSONObject.fromObject(hero));
        // ��ȡ�������    ͨ��JSONSerializer.toJSON(heros)�Ѽ���ת��ΪJSON�ַ���
//        String result =JSONSerializer.toJSON(heros).toString();
	}
}