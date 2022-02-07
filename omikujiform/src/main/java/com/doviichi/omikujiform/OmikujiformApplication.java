package com.doviichi.omikujiform;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@SpringBootApplication
public class OmikujiformApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmikujiformApplication.class, args);
	}
	@GetMapping("/")
	public String index() {
		return "redirect:/welcome";
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome.jsp";
	}
	@PostMapping("/processFormData")
	public String process(@RequestParam ("number") int number, 
			@RequestParam ("city") String city, 
			@RequestParam ("person") String person, 
			@RequestParam ("hobby") String hobby, 
			@RequestParam ("thing") String thing, 
			@RequestParam ("nice") String nice, 
			HttpSession session) {
		String resultOmikuji = String.format("In %s years, you will live in %s with %s as your roommate, selling %s for a living. the next time you see a %s, you will have good luck. Also, %s", 
				number, city, person, hobby, thing, nice);
		session.setAttribute("resultOmikuji", resultOmikuji);
//		System.out.println(resultOmikuji);
		return "redirect:/show";
	}
	@GetMapping("/show")
	public String show(HttpSession session, Model model) {
		String result = (String) session.getAttribute("resultOmikuji");
		model.addAttribute("result", result);
		System.out.println(result);
		model.addAttribute("fruit", "apple");
		
		return "show.jsp";
	}

}
