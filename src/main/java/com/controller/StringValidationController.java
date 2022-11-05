package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StringBean;

@Controller
public class StringValidationController {

	@GetMapping("/inputStrings")
	public String takeInputStrings() {
		return "InputString";
	}

	@PostMapping("/saveString")
	public String saveString(StringBean s, Model model) {
		System.out.println(s.getName1());
		System.out.println(s.getName2());
		String iserror="";
		if (s.getName1() == null || s.getName2() == null || s.getName1().trim().length() == 0
				|| s.getName2().trim().length() == 0 || s.getName1().contains("1234567890") == false
				|| s.getName2().contains("1234567890") == true) {
			iserror="Enter valid inputs";
			model.addAttribute("iserror", iserror);
			return "InputString";
		}

		else {
			if (s.getName1().equals(s.getName2())) {
				System.out.println("same");
				System.out.println(s.getName1().toUpperCase());
				System.out.println(s.getName2().toUpperCase());
				String n1 = s.getName1().toUpperCase();
				String n2 = s.getName2().toUpperCase();
				model.addAttribute("n1", n1);
				model.addAttribute("n2", n2);
			} else {
				StringBuilder sb1 = new StringBuilder(s.getName1());
				StringBuilder sb2 = new StringBuilder(s.getName2());

				String n1 = sb1.reverse().toString();
				String n2 = sb2.reverse().toString();
				model.addAttribute("n1", n1);
				model.addAttribute("n2", n2);
			}
		}
		model.addAttribute("names", s);
		return "Home1";
	}
}
