package com.scm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.scm.services.EmailService;

@SpringBootTest
class ScmProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private EmailService service;

	// for email testing
	@Test
	void sendEmailTest() {
		service.sendEmail(
				"your email Id",
				"Just managing the email service",
				"This is scm project working on emial service.");
	}

}
