/**
 * 
 */
package com.clps.mms.util.stringconversion;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clps.mms.util.stringconversion.StringConversionUtil;

/**
 * 
 * @Description:test StringConversionUtil
 * @Author:Gavin.Xu
 * @Since:2018年5月11日上午9:27:40
 * @Version:1.1.0
 */

public class StringConversionUtilTest {
	private Logger logger = Logger.getLogger(StringConversionUtilTest.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.util.stringconversion.StringConversionUtil#removespaces(java.lang.String)}.
	 */
	@Test
	public void testRemovespaces() {
		String name = "  a 123 2  a ";
		String a = StringConversionUtil.removespaces(name);
		logger.info(a);
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.util.stringconversion.StringConversionUtil#removespace(java.lang.String)}.
	 */
	@Test
	public void testRemovespace() {
		String name = "  a 123 2  a ";
		String a = StringConversionUtil.removespace(name);
		logger.info(a);
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.util.stringconversion.StringConversionUtil#stringToint(java.lang.String)}.
	 */
	@Test
	public void testStringToint() {
		String j = "12";
		logger.info(StringConversionUtil.stringToint(j));
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.util.stringconversion.StringConversionUtil#intTostring(int)}.
	 */
	@Test
	public void testIntTostring() {
		Integer i = 1;
		logger.info(StringConversionUtil.intTostring(i));
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.util.stringconversion.StringConversionUtil#RemoveNum(java.lang.String)}.
	 */
	@Test
	public void testRemoveNum() {

		String i = "adasd11as";
		logger.info(StringConversionUtil.removeNum(i));
	}

}
