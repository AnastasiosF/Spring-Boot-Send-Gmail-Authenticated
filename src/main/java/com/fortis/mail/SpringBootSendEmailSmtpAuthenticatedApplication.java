package com.fortis.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSendEmailSmtpAuthenticatedApplication  implements CommandLineRunner {

	@Autowired
	private MailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSendEmailSmtpAuthenticatedApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		// send a simple mail
		senderService.sendSimpleMail(new SimpleMail("ftasos2@gmail.com"));

		//send an HTML mail
		senderService.sendHTMLMail(new HTMLMail("ftasos2@gmail.com"));
	}


}



