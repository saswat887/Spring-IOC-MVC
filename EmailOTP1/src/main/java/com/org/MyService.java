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

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public String sendOtp(String email) {

		//step1:set the properties
		String otp="";
				Properties properties=System.getProperties();
				properties.setProperty("mail.smtp.host", "smtp.gmail.com");
				properties.setProperty("mail.smtp.port", "465");
				properties.setProperty("mail.smtp.ssl.enable", "true");
				properties.setProperty("mail.smtp.auth", "true");
				
				//Step 2:get the session object
				
				Session session=Session.getInstance(properties,new Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("saswat8908@gmail.com", "ropi ozin xzzp pfui");
					}
				});
				
				session.setDebug(true);
				MimeMessage message=new MimeMessage(session);
				try {
					Random random=new Random();
					otp=""+random.nextInt(9)+random.nextInt(9)+random.nextInt(9)+random.nextInt(9);
					message.setFrom("saswat8908@gmail.com");
					message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
					message.setSubject("OTP ");
					message.setText("Your OTP is "+otp);
					Transport.send(message);
					System.out.println("Message Sent");
					
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return otp;
	}

	

}
