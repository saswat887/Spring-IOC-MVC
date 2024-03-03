package com.org.MyController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
	@RequestMapping("/add")
	public void add(@RequestParam int first,@RequestParam int second)
	{
		System.out.println(first+second);
	}
	@RequestMapping("/sub")
	public void sub(HttpServletResponse res,HttpServletRequest req,@RequestParam int first,@RequestParam int second) throws ServletException, IOException
	{
		req.setAttribute("result", first-second);
		RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
		rd.include(req, res);
	}
	@RequestMapping("/mul")
	public ModelAndView mul(@RequestParam int first,@RequestParam int second)
	{
		ModelAndView mav=new ModelAndView("result.jsp");
		mav.addObject("result",first*second);
		return mav;
	}
	@RequestMapping("/div")
	public ModelAndView div(@RequestParam int first,@RequestParam int second)
	{
		ModelAndView mav=new ModelAndView("result.jsp");
		mav.addObject("result",first/second);
		return mav;
	}

}
