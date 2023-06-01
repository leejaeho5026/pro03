package com.myshop.base;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myshop.dto.SampleDTO;

public class LombokTest {


	private static final Logger logger = LoggerFactory.getLogger(LombokTest.class);
	
	@Test
	public void testLombok() {
		SampleDTO sample = new SampleDTO();
		sample.setId("이재호");
		sample.setPw("1234");
		logger.info(sample.toString());
	}
}
