package com.mani.dependencyinjection;

import org.springframework.stereotype.Service;

@Service("impl2")
public class MailServiceImpl2 implements MailService {

	@Override
	public String sendMail() {
		return "SendMails from Impl2 ... ";
	}

}
