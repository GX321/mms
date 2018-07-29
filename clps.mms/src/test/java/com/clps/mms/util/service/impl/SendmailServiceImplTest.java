/**   
* @Title: SendmailServiceImplTest.java 
* @Package com.clps.mms.util.service.impl 
* @Description: spring test
* @author martin.dai   
* @date 2018年5月7日 下午1:51:31 
* @version V1.0   
*/
package com.clps.mms.util.service.impl;


import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;


import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.clps.mms.util.controller.SpringTestBase;
import com.clps.mms.util.pojo.Sendmail;
import com.clps.mms.util.service.ISendmailService;

/** 
* @ClassName: SendmailServiceImplTest 
* @Description: SendmailServiceImpl  Test 
* @author martin.dai
* @date 2018年5月7日 下午1:51:31 
*  
*/
public class SendmailServiceImplTest extends SpringTestBase {
	
	@Autowired
	private ISendmailService ism;
	
	private Sendmail sendmail = null;
	
	private Logger logger = Logger.getLogger(SendmailServiceImplTest.class);

	/** 
	* @Title: setUp 
	* @Description: set  Up 
	* @param @throws java.lang.Exception 
	* @return void 
	* @throws 
	*/
	@Before
	public void setUp() throws Exception {
		
		this.sendmail =new Sendmail();
		sendmail.setEmailSubject("hate");
		sendmail.setEmailRecipient("syy");
		sendmail.setEmailAddresser("dd");
		sendmail.setEmailSendtime(new Timestamp(new Date().getTime()));
		sendmail.setEmailStatus(true);
		sendmail.setEmailDefault1("");
		sendmail.setEmailDefault2("");
		sendmail.setEmailIsVisable(true);
		sendmail.setEmailLetter(" i very hate you");
	}

	/** 
	* @Title: tearDown 
	* @Description: tear  Down 
	* @param @throws java.lang.Exception 
	* @return void 
	* @throws 
	*/
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.SendmailServiceImpl#queryAllSendmail()}.
	 */
	@Test
	public void testQueryAllSendmail() {
		Iterator<Sendmail> its = ism.queryAllSendmail().iterator();
		while(its.hasNext()){
			logger.info(its.next());
		}
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.SendmailServiceImpl#insertSendMail(com.clps.mms.sm.pojo.Sendmail)}.
	 */
	@Test
	public void testInsertSendMail() {
		ism.addSendMail(sendmail);
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.SendmailServiceImpl#deleteByEmailId(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteByEmailId() {
		ism.deleteByEmailId(3);
	}

	/**
	 * Test method for {@link com.clps.mms.sm.service.impl.SendmailServiceImpl#updateSendMail(com.clps.mms.sm.pojo.Sendmail)}.
	 */
	@Test
	public void testUpdateSendMail() {
		sendmail.setEmailId(1);
		ism.updateSendMail(sendmail);
	}

}
