package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home",method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("Run Successfully!");
		model.addAttribute("name", "Ankit kumar joshi ");
		model.addAttribute("id", 1231);

		List<String> friends = new ArrayList<String>();
		friends.add("Vandan");
		friends.add("Roshani");
		friends.add("ABC");
		friends.add("utkarsh");
		model.addAttribute("f", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("y");
		return "about";
	}

	// services
	// help

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller.");
		// creating modelandView object

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", " Uttam Shukla ");
		modelAndView.addObject("RollNo", 2124342);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		
		//marks 
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(2313);
		list.add(3424);
		list.add(9090);
		list.add(563);
		modelAndView.addObject("marks",list);
		
		// for jsp page
		modelAndView.setViewName("help");
		return modelAndView;

	}

}
