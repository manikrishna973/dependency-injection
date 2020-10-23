package com.mani.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		System.out.println(context.getBean(MailChimpService.class).sendMail());
		System.out.println(context.getBean(sendGridMailSerive.class).sendMail());

	}

}

@Component
class MailChimpService {

	@Autowired
	MailService mailService;

	public String sendMail() {
		return mailService.sendMail();
	}
}

@Component
class sendGridMailSerive {
	@Autowired
	@Qualifier("impl2") MailService mailService;

	public String sendMail() {
		return mailService.sendMail();
	}
}
