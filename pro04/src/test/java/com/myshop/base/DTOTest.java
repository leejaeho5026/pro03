package com.myshop.base;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myshop.dto.SampleDTO;

public class DTOTest {

	private static final Logger logger = LoggerFactory.getLogger(DTOTest.class);
	
	@Test
	public void testDTO() {
		SampleDTO sample = new SampleDTO();
		sample.setId("이재호");
		sample.setPw("100");
		logger.info(sample.toString());
	}

}
