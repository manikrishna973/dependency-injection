package com.mani.dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary 
public class MailServiceImpl implements MailService {

	@Override
	public String sendMail() {
		return "Hey there ! SendMails from primary impl";
	}

}
