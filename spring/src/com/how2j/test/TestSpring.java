package com.how2j.test;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.how2j.pojo.Category;
import com.how2j.pojo.Product;
 
public class TestSpring {
 
    public static void main(String[] args) {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "applicationContext.xml" } );
 
//        Category c = (Category) context.getBean("c");
        Product p = (Product) context.getBean("p");
         
        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());
    }
}