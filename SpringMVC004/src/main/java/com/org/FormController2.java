package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.org.dto.Person;

@Controller
public class FormController2 {
	@Autowired
	private PersonDao persondao;
	@RequestMapping("/fetch")
	public ModelAndView fetch()
	{
		List<Person1> person=persondao.fetchAllPerson();
		ModelAndView mav=new ModelAndView("displayperson.jsp");
		mav.addObject("veiwList",person);
		return mav;
	}
	@RequestMapping("/passEmpty")
	public ModelAndView passEmpty()
	{
		Person1 person =new Person1();
		ModelAndView mav=new ModelAndView("personform.jsp");
		mav.addObject("personObj",person);
		return mav;
	}
	@RequestMapping("/submitform")
	public ModelAndView submit(@ModelAttribute Person PersonObj)
	{
		System.out.println(PersonObj.getName());
		System.out.println(PersonObj.getEmail());
		System.out.println(PersonObj.getAge());
		System.out.println(PersonObj.getPwd());
		
		return new ModelAndView("passEmpty.jsp");
	}
	

}
