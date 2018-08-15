package kr.or.connect.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.or.connect.mvcexam.dto.User;

@Controller
public class UserController {
	@GetMapping(path = "/userform")
	public String user() {
		return "userform";
	}
	
	@PostMapping(path = "/regist")
	public String regist(@ModelAttribute User user) {
		System.out.println("사용자 정보는!!!!!");
		System.out.println(user);
		return "regist";
	}
}
