package com.praneeth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloService {
@RequestMapping("/")
	public ModelAndView welcome()
	{
		ModelAndView model =new ModelAndView();
model.addObject("msg", "welcome");
model.setViewName("welcome");
return model ;}
@RequestMapping("/admin")
	public String admin()
	{
		return "admin";
		
	}
@RequestMapping("/user")
	public String user()
	{
		return "user";
	}
}
