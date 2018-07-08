package com.jm2007.learn.javamail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTLS {

	public static void main(String[] args) {

		String fromAddress = "giveyouremailaddress@gmail.com";
		String toAddress = "ajay7444@gmail.com";
		String ccAddress = "kritika.9jan@gmail.com,amit.robert2010@gmail.com";
		String bccAddress = "atul.wnw@gmail.com";
		String userName = "karaninfo2018@gmail.com";
		String password = "giveyouremailpassword";
		String subject = "JavaMail - Testing";
		String text = "Hello this is test mail. \n You can delete it.";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "25");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		});

		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(fromAddress));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
			message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress));
			message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccAddress));

			// Set Subject: header field
			message.setSubject(subject + " - SimpleMailThruTLS");

			// Now set the actual message
			message.setText(text);
			
			// Send message
			Transport.send(message);

			System.out.println("Sent!");

		} catch (MessagingException e) {
			throw new RuntimeException(e);

		}
	}

}
