package springmvc.example3.staticpages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

   @RequestMapping(value = "/index", method = RequestMethod.GET)
   public String index() {
	   System.out.println("WebController-->index-->running");

       return "staticpages/index";
   }

   @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
   public String redirect() {
	   System.out.println("WebController-->redirect-->running");

	   return "redirect:staticpages/final.html";
  }
}