package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class SessionController {

	// service

	// method -> open -> jsp

	@Autowired // depend. eject -> ioc container -> spring -> singleton
	UserDao userDao;

	@GetMapping("/signup")
	public String openSignup() {
		System.out.println("signup........");
		return "Signup"; // jsp
	}

	@GetMapping("/login")
	public String Login() {
		return "Login";
	}

	@PostMapping("/saveuser")
	public String saveUser(@Valid UserBean user, BindingResult result, Model model) // Model is used for to transfering
																					// // data from 1 jasp to another
																					// jsp
	{
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			System.out.println(result.getFieldErrors());

			for (FieldError error : result.getFieldErrors()) {
				System.out.println(error.getField() + " " + error.getDefaultMessage());
				model.addAttribute(error.getField(), error.getDefaultMessage());
			}
			model.addAttribute("user", user);
			return "Signup";
		} else {
			System.out.println(user.getFirstName());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			userDao.insertUser(user);

			model.addAttribute("user", user); // request.setAttribute("user",user);
			// return "Home"; //
			// request.getRequestDispatcher("Login.jsp").forward(request,response)
			return "redirect:/listusers"; // url => listusers
		}
	}
	
	@GetMapping("/listusers")
	public String listUsers(Model model) {

		List<UserBean> users = userDao.getAllUsers();
		model.addAttribute("users", users);
		return "ListUsers";
	}
	
	@GetMapping("/deleteuser")
	public String deleteUser(@RequestParam("userId") int userId)
	{
		userDao.deleteuser(userId);
		return "redirect:/listusers";
	}
	
	@GetMapping("/edituser")
	public String editUser(@RequestParam("userId") int userId,Model model)
	{
		UserBean user=userDao.getuserbyid(userId);
		model.addAttribute("user", user);
		return "EditUser";
	}
	
	@PostMapping("/updateuser")
	public String updateUser(UserBean user)
	{
		userDao.updateUser(user);
		return "redirect:/listusers";
		
	}
	
	@GetMapping("/searchuser")
	public String searchUser() {
		return "SearchUser";
	}
	@GetMapping("/searchuserbyname")
	public String searchUserByName(@RequestParam("search") String search, Model model) {

		List<UserBean> users = userDao.getUserByName(search);
		model.addAttribute("users", users);
		return "ListUsers";
	}
}
