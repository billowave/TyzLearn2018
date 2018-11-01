package springmvc.example1.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/areas")
public class AreaControl {

	@RequestMapping(method = RequestMethod.GET)
	public String printAreas(ModelMap model) {

		model.addAttribute("area1", new Area());
		model.addAttribute("area1str", new Area().toString());
		System.out.println("AreaControl-->printAreas-->running");

		return "areatell";
	}

}