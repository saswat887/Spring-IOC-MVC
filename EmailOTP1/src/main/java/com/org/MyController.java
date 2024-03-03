package com.org;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@Autowired
	private MyService service;
	@RequestMapping("/send_otp")
	public ModelAndView sendMail(@RequestParam String email,HttpSession session)
	{
		System.out.println("send mail");
		ModelAndView mav=new ModelAndView("verify_otp.jsp");
		String otp=service.sendOtp(email);
		session.setAttribute("myOtp", otp);
		return mav;
	}
	@RequestMapping("/verify_otp")
	public ModelAndView verifyOtp(@RequestParam String otp,HttpSession session)
	{
		System.out.println("verify otp");
		String myOtp=(String)session.getAttribute("myOtp");
		if(myOtp.equals(otp))
		{
			ModelAndView mav=new ModelAndView("loginform.jsp");
			mav.addObject("success","Password Changed Successfully");
			return mav;
		}
		ModelAndView mav=new ModelAndView("verify_otp.jsp");
		mav.addObject("fail","Please enter a valid OTP");
		return mav;
	}

}
