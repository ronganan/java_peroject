package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;


//����spring mvc����һ����������
@Controller
@RequestMapping("")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page) {
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),5);
		List<Category> cs = categoryService.list();
		int total = (int) new PageInfo<>(cs).getTotal();
//		List<Category> cs = categoryService.list(page);
//		int total = categoryService.total();
		page.caculateLast(total);
		// ����ת������
		mav.addObject("cs", cs);
		mav.addObject("total", total);
		// ����jsp·��
		mav.setViewName("listCategory");
		return mav;
	}
}
