package com.gqq;


import org.apache.log4j.Logger;

import junit.framework.TestCase;

public class RandomTest extends TestCase{
	static final Logger logger = Logger.getLogger(RandomTest.class);

	@Override
	protected void setUp() throws Exception {
	}

	@Override
	protected void tearDown() throws Exception {
	}
	
	public void testRandom(){
//		for (int i = 0; i < 10; i++) {
//			double randDouble = RandomUtil.randDouble(1.15, 3.27);
//			logger.debug(ItuMathUtil.round(randDouble, 2));
//		}
		logger.info("ok");
	}
}
