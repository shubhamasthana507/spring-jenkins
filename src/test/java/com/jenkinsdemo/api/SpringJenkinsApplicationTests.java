package com.jenkinsdemo.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringJenkinsApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		logger.info("Test case executing second log statement...");
		assertThat(true);

	}

}
