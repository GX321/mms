/**   
* @Title: SendmailMapperTest.java 
* @Package com.clps.mms.util.dao 
* @Description: mybatis test
* @author martin.dai   
* @date 2018年5月4日 上午11:19:27 
* @version V1.0   
*/
package com.clps.mms.util.dao;



import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clps.mms.util.controller.MyBatisUtil;
import com.clps.mms.util.dao.SendmailMapper;
import com.clps.mms.util.pojo.Sendmail;


/** 
* @ClassName: SendmailMapperTest 
* @Description: SendmailMapper  Test
* @author martin.dai
* @date 2018年5月4日 上午11:19:27 
*  
*/
public class SendmailMapperTest {
	
	private SqlSessionFactory sf = null;
	private SqlSession session = null;
	private SendmailMapper mapper = null;
	private Sendmail sendmail =null;
	private Logger logger = Logger.getLogger(SendmailMapperTest.class);

	/** 
	* @Title: setUp 
	* @Description: set up
	* @param @throws java.lang.Exception 
	* @return void 
	* @throws 
	*/
	@Before
	public void setUp() throws Exception {
		
		this.sf = MyBatisUtil.getSqlSessionFactory();
		this.session = sf.openSession();
		this.mapper = session.getMapper(SendmailMapper.class);
		this.sendmail =new Sendmail();
		sendmail.setEmailSubject("love");
		sendmail.setEmailRecipient("djx");
		sendmail.setEmailAddresser("dd");
		sendmail.setEmailSendtime(new Timestamp(new Date().getTime()));
		sendmail.setEmailStatus(true);
		sendmail.setEmailDefault1("");
		sendmail.setEmailDefault2("");
		sendmail.setEmailIsVisable(true);
		sendmail.setEmailLetter(" i love you");
	}

	/** 
	* @Title: tearDown 
	* @Description:  tear down
	* @param @throws java.lang.Exception 
	* @return void 
	* @throws 
	*/
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.clps.mms.sm.dao.SendmailMapper#deleteByEmailId(java.lang.Integer)}.
	 */
	@Test
	public void testDeleteByEmailId() {
		try {
			int i = mapper.deleteByEmailId(3);
			if(i>0){
				logger.info("delete susses!");
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		}finally{
			if(session!=null)
				session.close();
		}
	}

	/**
	 * Test method for {@link com.clps.mms.sm.dao.SendmailMapper#insertSendMail(com.clps.mms.sm.pojo.Sendmail)}.
	 */
	@Test
	public void testInsertSendMail() {
		try {
			int i = mapper.addSendMail(sendmail);
			if(i>0){
				logger.info("insert susses!");
			}
			session.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		}finally{
			if(session!=null)
				session.close();
		}
	}

	/**
	 * Test method for {@link com.clps.mms.sm.dao.SendmailMapper#querySendmailByEmailId(java.lang.Integer)}.
	 */
	@Test
	public void testQuerySendmailByEmailId() {
		try {
			Sendmail sendmail = mapper.querySendmailByEmailId(1);
			logger.info(sendmail);
			session.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		}finally{
			if(session!=null)
				session.close();
		}
		
	}
	
	
	@Test
	public void testQuerySendmailByName(){
		try {
			List<Sendmail> listSendmail = mapper.querySendmailByName("d");
			Iterator<Sendmail> its = listSendmail.iterator();
			while(its.hasNext()){
				logger.info(its.next());
			}
			session.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		}finally{
			if(session!=null)
				session.close();
		}
	}

	/**
	 * Test method for {@link com.clps.mms.sm.dao.SendmailMapper#queryAllSendmail()}.
	 */
	@Test
	public void testQueryAllSendmail() {
		try {
			List<Sendmail> listSendmail = mapper.queryAllSendmail();
			Iterator<Sendmail> its = listSendmail.iterator();
			while(its.hasNext()){
				logger.info(its.next());
			}
			session.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		}finally{
			if(session!=null)
				session.close();
		}
	}

	/**
	 * Test method for {@link com.clps.mms.sm.dao.SendmailMapper#updateSendMail(com.clps.mms.sm.pojo.Sendmail)}.
	 */
	@Test
	public void testUpdateSendMail() {
		
		try {
			sendmail.setEmailId(3);
			int  i = mapper.updateSendMail(sendmail);
			if(i>0){
				logger.info("update susses!");
			}
			session.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
			session.rollback();
		}finally{
			if(session!=null)
				session.close();
		}
	}


}
