package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Hero;
public class HeroDAO {
	
	public HeroDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hero?characterEncoding=UTF-8&serverTimezone=GMT", "root",
                "123456");
	}
	public int getTotal() {
		int total = 0;
		try (Connection c = getConnection(); Statement s = c.createStatement();) {
			String sql = "select count(*) from hero";
			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {
				total = rs.getInt(1);
			}
			System.out.println(total);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
	public void add(Hero hero) {
		String sql = "insert into hero values(null, ?, ?, ?)";
		try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {			
			ps.setString(1, hero.name);
			ps.setFloat(2, hero.hp);
			ps.setInt(3, hero.damage);
			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				int id = rs.getInt(1);
				hero.id = id;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(Hero hero) {
		String sql = "update hero set name = ?, hp = ?, damage = ? where id = ?";
		try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {			
			ps.setString(1, hero.name);
			ps.setFloat(2, hero.hp);
			ps.setInt(3, hero.damage);
			ps.setInt(4, hero.id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void delete(int id) {
		String sql = "delete from hero where id = ?";
		try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {			
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Hero get(int id) {
		Hero hero = null;
		String sql = "select * from hero where id = ?";
		try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				hero = new Hero();
				hero.name = rs.getString("name");
				hero.hp = rs.getFloat("hp");
				hero.damage = rs.getInt("damage");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hero;
	}
	public List<Hero> list() {
		return list(0, Short.MAX_VALUE);
	}
	public List<Hero> list(int start, int count) {
		List<Hero> heros = new ArrayList<>();
		String sql = "select * from hero order by id desc limit ?, ?";
		try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {			
			ps.setInt(1, start);
			ps.setInt(2, count);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Hero hero = new Hero();
				hero.id = rs.getInt(1);
				hero.name = rs.getString(2);
				hero.hp = rs.getFloat(3);
				hero.damage = rs.getInt(4);
				heros.add(hero);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return heros;
	}
	
	
	
	
	
	
	
	
	
}