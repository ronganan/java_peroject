package com.how2java.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.springboot.mapper.CategoryMapper;
import com.how2java.springboot.pojo.Category;

@Controller
public class CategoryController {
	@Autowired
	CategoryMapper categoryMapper;

	@RequestMapping("/listCategory")
	// 在参数里接受当前是第几页 start ，以及每页显示多少条数据 size。 默认值分别是0和5。
	public String listCategory(Model m, @RequestParam(value = "start", defaultValue = "0") int start,
			@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
		// 根据start,size进行分页，并且设置id 倒排序
		PageHelper.startPage(start, size, "id asc");
		// 因为PageHelper的作用，这里就会返回当前分页的集合了
		List<Category> cs = categoryMapper.findAll();
		// 根据返回的集合，创建PageInfo对象
		PageInfo<Category> page = new PageInfo<>(cs);
		// 把PageInfo对象扔进model，以供后续显示
		m.addAttribute("page", page);
		// 跳转到listCategory.jsp
		return "listCategory";
	}

	@RequestMapping("/addCategory")
	public String listCategory(Category c) throws Exception {
		categoryMapper.save(c);
		return "redirect:listCategory";
	}

	@RequestMapping("/deleteCategory")
	public String deleteCategory(Category c) throws Exception {
		categoryMapper.delete(c.getId());
		return "redirect:listCategory";
	}

	@RequestMapping("/updateCategory")
	public String updateCategory(Category c) throws Exception {
		categoryMapper.update(c);
		return "redirect:listCategory";
	}

	@RequestMapping("/editCategory")
	public String listCategory(int id, Model m) throws Exception {
		Category c = categoryMapper.get(id);
		m.addAttribute("c", c);
		return "editCategory";
	}
}