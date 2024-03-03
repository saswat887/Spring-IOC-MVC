package com.org;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	int otp=0;
	@RequestMapping("/send")
	public ModelAndView send(@RequestParam String email)
	{
		ModelAndView m=new ModelAndView("otp.jsp");
		Properties properties=System.getProperties();
		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
		properties.setProperty("mail.smtp.port", "465");
		properties.setProperty("mail.smtp.ssl.enable", "true");
		properties.setProperty("mail.smtp.auth", "true");
		Session session=Session.getInstance(properties,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("saswat8908@gmail.com", "ropi ozin xzzp pfui");
			}
		});
		session.setDebug(true);
		Random r=new Random();
		otp=r.nextInt(9000)+1000;
		MimeMessage message=new MimeMessage(session);
		try {
			message.setFrom("saswat8908@gmail.com");
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject("OTP for changing password");
			message.setText("OTP IS "+otp);
			Transport.send(message);
			System.out.println("Message Sent");
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addObject("otp", otp);
		return m;
	}
	@RequestMapping("/check")
	public ModelAndView check(@RequestParam int otp1)
	{
		System.out.println(otp);
		System.out.println(otp1);
		if(otp1==otp)
		{
			ModelAndView m=new ModelAndView("change.jsp");
			System.out.println("Correct");
			return m;
		}
		else {
			ModelAndView m=new ModelAndView("otp.jsp");
			String s="WRONG OTP";
			System.out.println(s);
			m.addObject("wrong", s);
			return m;
		}
	}

}
