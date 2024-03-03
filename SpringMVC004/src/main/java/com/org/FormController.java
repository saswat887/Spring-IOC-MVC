package com.org;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("P");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute Person p)
	{
		ModelAndView mav=new ModelAndView("display.jsp");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getMobile());
		System.out.println(p.getEmail());
		System.out.println(p.getPassword());
		
		mav.addObject("name",p.getName());
		mav.addObject("age",p.getAge());
		mav.addObject("mobile",p.getMobile());
		mav.addObject("email",p.getEmail());
		mav.addObject("password",p.getPassword());
		
		
		et.begin();
		em.persist(p);
		et.commit();
		
		return mav;
	}

}
