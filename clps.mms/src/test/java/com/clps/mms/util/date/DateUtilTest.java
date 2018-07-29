/**
 * 
 */
package com.clps.mms.util.date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clps.mms.util.date.DateUtil;

/**
 * 
 * @Description: test DateUtil
 * @Author:Gavin.Xu
 * @Since:2018年5月11日上午9:17:24
 * @Version:1.1.0
 */

public class DateUtilTest {

	Date date = new Date();
	private Logger logger = Logger.getLogger(DateUtilTest.class);

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
	 * {@link com.clps.mms.util.date.DateUtil#DateToString1(java.util.Date)}.
	 */
	@Test
	public void testDateToString1() {
		logger.info(DateUtil.DateToString1(date));

	}

	/**
	 * Test method for
	 * {@link com.clps.mms.util.date.DateUtil#DateToString2(java.util.Date)}.
	 */
	@Test
	public void testDateToString2() {
		logger.info(DateUtil.DateToString2(date));
	}
	
	/**
	 * Test method for
	 * {@link com.clps.mms.util.date.DateUtil#DateToString1(java.util.Date)}.
	 */
	@Test
	public void testDateToString3() {
		logger.info(DateUtil.DateToString3(date));

	}
	
	/**
	 * Test method for
	 * {@link com.clps.mms.util.date.DateUtil#DateToString1(java.util.Date)}.
	 */
	@Test
	public void testDateToString4() {
		logger.info(DateUtil.DateToString4(date));

	}
	
	/**
	 * Test method for
	 * {@link com.clps.mms.util.date.DateUtil#DateToString1(java.util.Date)}.
	 */
	@Test
	public void testDateToString5() {
		logger.info(DateUtil.DateToString5(date));

	}

	/**
	 * Test method for
	 * {@link com.clps.mms.util.date.DateUtil#StringToDate1(java.lang.String)}.
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testStringToDate1() throws ParseException {
		String datetime = "2018-05-09 11:10:10";
		logger.info(DateUtil.StringToDate1(datetime));
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.util.date.DateUtil#StringToDate2(java.lang.String)}.
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testStringToDate2() throws ParseException {

		String datetime = "2018年05月09日 11时09分05秒099毫秒";
		logger.info(DateUtil.StringToDate2(datetime));
	}

	/**
	 * Test method for
	 * {@link com.clps.mms.util.date.DateUtil#parse(java.lang.String, java.lang.String)}.
	 * 
	 * @throws ParseException
	 */
	@Test
	public void testParse() {
		try {
			logger.info("test begin...");
			String pattern = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒";
			String dateValue = "2018年05月09日 11时09分05秒099毫秒";
			logger.info(DateUtil.parse(dateValue, pattern));
		} catch (Exception e) {
			logger.error("output error!!!");
		}
	}

	/**
	 * Test method for {@link com.clps.mms.util.date.DateUtil#getTimestamp()}.
	 */
	@Test
	public void testGetTimestamp() {
		long currTime = System.currentTimeMillis();
		Timestamp time = new Timestamp(currTime);
		logger.info(time);

	}

}
