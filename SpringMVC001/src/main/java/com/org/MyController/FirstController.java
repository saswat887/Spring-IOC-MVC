package com.org.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping("/hii")
	public String msg()
	{
		System.out.println("My Controller Executing");
		return "hello.jsp";
	}

}
