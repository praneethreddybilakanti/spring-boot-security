package com.praneeth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  
public class HomeController {  
      
    @RequestMapping(value="/", method=RequestMethod.GET)  
    public String home() {  
        return "home";  
    }  
      
    @RequestMapping(value="/admin", method=RequestMethod.GET)  
    public String privateHome() {  
        return "privatePage";  
    }  
}  