package springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;

@Controller
public class ContactController {

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Registration Form ");
		m.addAttribute("Desc", "Home for Programmer");
		System.out.println("adding command data to model.");
	}

	@RequestMapping("/Contact")
	public String showForm(Model m) {
		System.out.println("Creating form");
		return "Contact";

	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)

	public String handleForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		return "success";
	}
}

//		public String handleForm(
//		@RequestParam("email") String userEmail,
//		@RequestParam("userName" ) String userName, 
//		@RequestParam("Password") String userPassword, Model model) {

//		System.out.println("user :" + userEmail);
//		System.out.println("userName: " + userName);
//		System.out.println("Password :" +userPassword);
//		System.out.println("_______________________________");
//		
//		User user = new User();
//		user.setEmail(userEmail);
//		user.setUserName(userName);
//		user.setPassword(userPassword);

//		
//		model.addAttribute("user",user);
//		

//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
