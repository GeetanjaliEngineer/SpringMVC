package springmvc.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/Contact")
	public String showForm() {
		return "Contact";

	}

	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("userName" ) String userName, 
			@RequestParam("userPassword") String userPassword, Model model) {
	
		System.out.println("user email:" + userEmail);
		System.out.println("user name: " + userName);
		System.out.println("userpassword :" +userPassword);
		System.out.println("_______________________________");
		
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		return "success";
	}

}
