package com.github.ghthou.learning.spring;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = "/index")
	public String test(Model model) {
		model.addAttribute("date", new Date().toLocaleString());
		return "index";
	}

}
