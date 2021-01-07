package info.thecodinglive.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("title", "Jpub Spring Web");
		mv.addObject("today", new Date().toString());
		
		System.out.println("index controller");
		
		return mv;
	}
    
}
