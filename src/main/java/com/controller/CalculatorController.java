package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.CalcBean;

@Controller
public class CalculatorController {

	@GetMapping("/calc") // responsibility to open jsp getmapping will call the following method
	public String openCalc() {
		return "Calc";
	}

	@PostMapping("/saveresult")
	public String saveresult(CalcBean c, Model model) {
		int ans = 0;
		System.out.println(c.getA());
		System.out.println(c.getB());

//spring will convert string to int automatically in bean so u do not need to parse

		switch (c.getOperation()) {
		case "add":
			ans = c.getA() + c.getB();
			break;

		case "sub":
			ans = c.getA() - c.getB();
			break;

		case "mul":
			ans = c.getA() * c.getB();
			break;

		case "div":
			ans = c.getA() / c.getB();
			break;

		default:
			ans = c.getA() * c.getB();
			break;
		}

		model.addAttribute("c", c);
		model.addAttribute("ans", ans);
		return "Output";
	}
}
