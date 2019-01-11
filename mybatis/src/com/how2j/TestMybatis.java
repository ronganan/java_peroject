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
        
        // 多对一关系
        List<Product> ps = session.selectList("listProduct");
        for(Product p : ps) {
        	System.out.println( p +" 对应的分类是 \\t " + p.getCategory());
        }
        
        
        //  一对多关系
//        List<Category> cs = session.selectList("listCategory");
//        for(Category c : cs) {
//        	System.out.println(c);
//        	List<Product> ps = c.getProducts();
//        	for (Product p : ps) {
//                System.out.println("\t"+p);
//            }
//        }        
        
        // 查询
//        List<Category> cs=session.selectList("listCategory");
//        for (Category c : cs) {
//            System.out.println(c.getName());
//        }
        //模糊查询
//        List<Category> cs = session.selectList("listCategoryByName", "1");
//        for (Category c : cs) {
//        	System.out.println(c.getName());
//        }
        // 插入
//        Category cate = new Category();
//        cate.setName("胖子");
//        session.insert("addCategory", cate);
        // 更新
//        Category cate = session.selectOne("getCategory", 2);
//        Category cate = new Category();
//        cate.setName("明明");
//        cate.setId(3);
//        session.update("updateCategory", cate);
        // 删除
//        Category cate = new Category();
//        cate.setId(2);
//        session.delete("deleteCategory", cate);
        
	}
}