package com.dn.freemarker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dn.freemarker.empty.User;

/**
 * @author  大牛哥 
 * @E-mail: 201309512@qq.com 
 * @date 创建时间：2017年2月25日 下午12:23:59
 * @version 1.0
 * @parameter
 * @since
 * @return  */
@Controller("/")
public class IndexController {
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("username","Nihao");
		mv.addObject("userList",getData());
		System.out.println("index");
		return mv;
	}
	public List<User> getData(){
		List<User> list = new ArrayList<User>();
		for(int i =0 ;i < 5 ;i++)
		{
			User user = new User();
			user.setName("用户"+i);
			user.setBerithTime(new Date());
			list.add(user);
			
		}
		return list;
	}
}
