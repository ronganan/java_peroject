package com.how2j;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.how2j.pojo.Category;
import com.how2j.pojo.Product;

public class TestMybatis {

	public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();
        
        // ���һ��ϵ
        List<Product> ps = session.selectList("listProduct");
        for(Product p : ps) {
        	System.out.println( p +" ��Ӧ�ķ����� \\t " + p.getCategory());
        }
        
        
        //  һ�Զ��ϵ
//        List<Category> cs = session.selectList("listCategory");
//        for(Category c : cs) {
//        	System.out.println(c);
//        	List<Product> ps = c.getProducts();
//        	for (Product p : ps) {
//                System.out.println("\t"+p);
//            }
//        }        
        
        // ��ѯ
//        List<Category> cs=session.selectList("listCategory");
//        for (Category c : cs) {
//            System.out.println(c.getName());
//        }
        //ģ����ѯ
//        List<Category> cs = session.selectList("listCategoryByName", "1");
//        for (Category c : cs) {
//        	System.out.println(c.getName());
//        }
        // ����
//        Category cate = new Category();
//        cate.setName("����");
//        session.insert("addCategory", cate);
        // ����
//        Category cate = session.selectOne("getCategory", 2);
//        Category cate = new Category();
//        cate.setName("����");
//        cate.setId(3);
//        session.update("updateCategory", cate);
        // ɾ��
//        Category cate = new Category();
//        cate.setId(2);
//        session.delete("deleteCategory", cate);
        
	}
}