package com.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.OrderEntity;
import com.test.model.UserEntity;
import com.test.service.order.OrderService;
import com.test.service.user.UserService;

//@RestController
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private OrderService orderService;
	
	/**
	 * 	返回json数据
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/home/{id}")
	@ResponseBody
	public Object jsonData(@PathVariable("id") long id) {
		UserEntity u = userService.getUserInfo(id);
		OrderEntity o = orderService.getOrderInfo(id);
		
		return u;
	}
	
	/**
	 * spring mvc 返回到指定login.jsp页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/home")
	public String home(Model model) {
		model.addAttribute("userName","userName-");
		model.addAttribute("orderDesc", "orderDesc-");
		return "login";
	}
	
}
