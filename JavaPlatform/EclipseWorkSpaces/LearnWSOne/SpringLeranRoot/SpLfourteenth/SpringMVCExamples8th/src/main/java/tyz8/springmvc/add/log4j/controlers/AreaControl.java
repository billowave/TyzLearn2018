package tyz8.springmvc.add.log4j.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tyz8.springmvc.add.log4j.modelbeans.Area;

import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/areas")
public class AreaControl {

	@RequestMapping(method = RequestMethod.GET)
	public String printAreas(ModelMap model) {

		model.addAttribute("area1", new Area());
		model.addAttribute("area1str", new Area().toString());
		System.out.println("AreaControl-->printAreas-->running");

		return "jsp/areatell";
	}

}