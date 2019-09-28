package net.kzm.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greet","Welcome to spring web MVC");
		return mv;
		
	}
	
	@RequestMapping(value= {"/test"})
	public ModelAndView test(@RequestParam(value="greet",required=false)String greet)
	{
		if(greet==null)
		{
			greet="Null value";
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greet",greet);
		return mv;
		
	}
	
	@RequestMapping(value= {"/path/{greet}"})
	public ModelAndView path(@PathVariable(value="greet",required=false)String greet)
	{
		if(greet==null)
		{
			greet="Null value";
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greet",greet);
		return mv;
		
	}


}
