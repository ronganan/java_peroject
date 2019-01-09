package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hero;
import dao.HeroDAO;

public class HeroUpdateServlet extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		Hero hero = new Hero();
		hero.setId(Integer.parseInt(req.getParameter("id")));
		hero.setName(req.getParameter("name"));
		hero.setHp(Float.parseFloat(req.getParameter("hp")));
		hero.setDamage(Integer.parseInt(req.getParameter("damage")));
		new HeroDAO().update(hero);
		res.sendRedirect("/listHero");
	}
}