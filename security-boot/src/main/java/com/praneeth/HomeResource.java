package com.praneeth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	@RequestMapping("/")
 public String welcome()
 {
	 return( "<h1>welcome </h1>");
	 
 }
	@RequestMapping("/admin")
	public String admin()
	{
		return ("<h1> admin</h1>");
	}
	@RequestMapping("/user")
	public String user()
{
		
		return ("<h1> user </h1>");
		}
}
