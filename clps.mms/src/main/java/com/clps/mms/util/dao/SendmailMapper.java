/**   
* @Title: ISendMail.java 
* @Package com.clps.mms.util.dao
* @Description: sendmail 实体层接口
* @author martin.dai   
* @date 2018年5月7日 上午9:28:39 
* @version V1.0   
*/
package com.clps.mms.util.dao;

import java.util.List;

import com.clps.mms.util.paging.PagingVO;
import com.clps.mms.util.pojo.Sendmail;

/** 
* @ClassName: SendmailMapper 
* @Description: sendmail接口
* @author martin.dai
* @date 2018年5月14日 上午9:56:47 
*  
*/
public interface SendmailMapper {
	
    
    /** 
    * @Title: deleteByEmailId 
    * @Description: 根据邮件id号删除邮件
    * @param @param emailId
    * @param @return 
    * @return int 
    * @throws 
    */
    int deleteByEmailId(Integer emailId);

   
    /** 
    * @Title: insertSendMail 
    * @Description: 插入邮件
    * @param @param record
    * @param @return 
    * @return int 
    * @throws 
    */
    int addSendMail(Sendmail record);


   
    /** 
    * @Title: querySendmailByEmailId 
    * @Description: 根据邮件id号查询邮件信息
    * @param @param emailId
    * @param @return 
    * @return Sendmail 
    * @throws 
    */
    Sendmail querySendmailByEmailId(Integer emailId);
    
    
    /** 
    * @Title: queryAllSendmail 
    * @Description: 查询所有邮件信息
    * @param @return 
    * @return Sendmail 
    * @throws 
    */
    List<Sendmail> queryAllSendmail();
    
    
    /** 
    * @Title: querySendmailByName 
    * @Description: 根据收件人名查询邮件信息
    * @param @return 
    * @return List<Sendmail> 
    * @throws 
    */
    List<Sendmail> querySendmailByName(String emailRecipient);

    
    /** 
    * @Title: updateSendMail 
    * @Description: 修改邮件信息
    * @param @param record
    * @param @return 
    * @return int 
    * @throws 
    */
    int updateSendMail(Sendmail record);
    
    /** 
    * @Title: countByExample 
    * @Description: 计数
    * @param @return 
    * @return int 
    * @throws 
    */
    int countByExample();
    
    /** 
    * @Title: findByPaging 
    * @Description: 分页查询信息
    * @param @param pagingVO
    * @param @return 
    * @return List<Sendmail> 
    * @throws 
    */
    List<Sendmail> findByPaging(PagingVO pagingVO);
    
    

}