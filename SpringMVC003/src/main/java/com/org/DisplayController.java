package com.org;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayController {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	@RequestMapping("/fetch")
	public ModelAndView display(@RequestParam String name,@RequestParam int age,@RequestParam long mobile,@RequestParam String email,@RequestParam String password){
		ModelAndView mav=new ModelAndView("display.jsp");
		mav.addObject("name",name);
		mav.addObject("age",age);
		mav.addObject("mobile",mobile);
		mav.addObject("email",email);
		mav.addObject("password",password);
		User u=new User();
		u.setName(name);
		u.setAge(age);
		u.setMobile(mobile);
		u.setEmail(email);
		u.setPassword(password);
		
		et.begin();
		em.persist(u);
		et.commit();
		return mav;
		
	}
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String email,@RequestParam String password,HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println(email);
		System.out.println(password);
		ModelAndView mav=new ModelAndView("display.jsp");
		ModelAndView mav1=new ModelAndView("Login.jsp");
		if(email.equals("1") && password.equals("2"))
		{
			System.out.println("Valid");
			HttpSession session=req.getSession();
			return mav;
		}
		else
		{
			System.out.println("Invalid");
			HttpSession session=req.getSession();
			session.setAttribute("fail", "Invalid Email or Password");
			return mav1;
		}
		
		
	}
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("Logout");
		HttpSession session=req.getSession();
		session.invalidate();
		
		return null;
		
	}

}
