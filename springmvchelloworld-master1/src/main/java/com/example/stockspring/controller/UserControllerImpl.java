package com.example.stockspring.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.User;
import com.example.stockspring.service.UserService;
import com.example.stockspring.service.UserServiceImpl;

@Controller
public class UserControllerImpl implements UserController{
	
	@Autowired
	private UserService userService=new UserServiceImpl();
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin(ModelMap model) throws SQLException {
		System.out.println("inside get login");
		User user=new User();
		//e.setEmail("sdfsf");
	//	e.setSalary(4564.56f);
	
		model.addAttribute("l1", user);
		//model.addAttribute("sectorList", companyService.getSectorList());
		return "login";
		
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submitLogin(@Valid User user, 
			BindingResult result, Model model) throws SQLException {
		System.out.println("inside post login");
		//user.setUsertype("admin");
		//System.out.println(user);
		/*
		if(result.hasErrors()){
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			model.addAttribute("l1", user);
			return "redirect:/login";
		}*/
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		User u=userService.login(user.getUsername(),user.getPassword());
		//model.addAttribute("name", employee.getName());
		System.out.println(u);
	/*	if((user.getUsername()==u.getUsername()) && (user.getPassword()==u.getPassword()))*/
		if(u!=null) {
			//session.setAttribute("user", u);
		 return "redirect:/adminLandingPage";
		}
		else
			return "redirect:/login";
	}
	
	
	 @RequestMapping(value = "/register", method = RequestMethod.GET) 
	 public String getRegister(ModelMap model) throws SQLException {
	 //System.out.println("add company"); 
		 User user=new User();
	 //e.setEmail("sdfsf"); // e.setSalary(4564.56f);
	 
	 model.addAttribute("r1", user);
	 
	 //model.addAttribute("sectorList", companyService.getSectorList()); 
	 return "register";
	 
	 }
	 
	
	@RequestMapping(value = "/register1", method = RequestMethod.POST)
	public String adminLogin(@Valid User user, 
			BindingResult result, Model model) throws SQLException {
		System.out.println("inside post admin register");
		user.setUsertype("admin");
		System.out.println(user);
		
		if(result.hasErrors()){
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			model.addAttribute("r1", user);
			return "redirect:/register";
		}
		userService.insertUser(user);
		//model.addAttribute("name", employee.getName());
		 return "redirect:/login";
	}
	
	@RequestMapping(value = "/register2", method = RequestMethod.POST)
	public String userLogin(@Valid User user, 
			BindingResult result, Model model) throws SQLException {
		System.out.println("inside post user register");
		user.setUsertype("user");
		System.out.println(user);
		if(result.hasErrors()){
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			model.addAttribute("r1", user);
			return "redirect:/register";
		}
		userService.insertUser(user);
		//model.addAttribute("name", employee.getName());
		 return "redirect:/login";
	}
	
	
/*	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String formHandlerRegisterAdmin(@Valid User user, 
			BindingResult result, Model model) throws SQLException {
		System.out.println("inside post admin register");
		System.out.println(user);
		if(result.hasErrors()){
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			model.addAttribute("r1", user);
			model.addAttribute("r2", user);
			return "redirect:/register";
		}
		userService.insertUser(user);
		//model.addAttribute("name", employee.getName());
		 return "redirect:/login";
	}
	
	@RequestMapping(value = "/register2", method = RequestMethod.POST)
	public String formHandlerRegisterUser(@Valid User user, 
			BindingResult result, Model model) throws SQLException {
		System.out.println("inside post user register");
		System.out.println(user);
		if(result.hasErrors()){
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			model.addAttribute("r2", user);
			return "redirect:/register";
		}
		userService.insertUser(user);
		//model.addAttribute("name", employee.getName());
		 return "redirect:/login";*/
	
	@RequestMapping(value = "/adminLandingPage", method = RequestMethod.GET)
	public String getAdminLandingPage(ModelMap model) throws SQLException {
		
		return "adminLandingPage";
		
	}
	
	
	
	
	}
	


