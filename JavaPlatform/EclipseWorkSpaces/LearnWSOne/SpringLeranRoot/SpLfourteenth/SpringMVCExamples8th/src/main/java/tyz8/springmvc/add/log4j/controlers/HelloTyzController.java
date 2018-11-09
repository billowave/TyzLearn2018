package tyz8.springmvc.add.log4j.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hellotyz")
public class HelloTyzController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");

		
		System.out.println("HelloController-->printHello-->running");

		return "jsp/hellotyz";
	}

}