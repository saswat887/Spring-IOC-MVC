package com.org.MyController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	{
		System.out.println("Object Created");
	}
	@RequestMapping("/magic1")
	public String method()
	{
		System.out.println("MVC Working Fine");
		return "hii.jsp";
	}
	@RequestMapping("/magic")
	public ModelAndView method1()
	{
		System.out.println("ModelVeiw Working Fine");
		ModelAndView mav=new ModelAndView("hii.jsp");
		return mav;
	}
	@RequestMapping("/readform")
	public void read(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		String name=req.getParameter("n");
		String age=req.getParameter("age");
		System.out.println(name);
		System.out.println(age);
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>"+name+"</h1>");
		out.println("<h1>"+age+"</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("hii.jsp");
		rd.include(req, res);
				
		
		
	}

}
