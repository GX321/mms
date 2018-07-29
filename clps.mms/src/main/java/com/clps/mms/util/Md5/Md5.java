/**   
* @Title: Md5.java 
* @Package com.clps.mms.util.Md5 
* @Description: MD5加密
* @author martin.dai  
* @date 2018年6月1日 上午9:50:22 
* @version V1.0   
*/
package com.clps.mms.util.Md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/** 
* @ClassName: Md5 
* @Description: MD5加密
* @author martin.dai
* @date 2018年6月1日 上午9:50:22 
*  
*/
public class Md5 {
	
	/** 
	*  无参构造
	*   
	*/
	private Md5() {

    }
    /** 
    * @Title: md5 
    * @Description: md5加密
    * @param @param originString
    * @param @return
    * @param @throws UnsupportedEncodingException 
    * @return String 
    * @throws 
    */
    public static String md5(String originString)
            throws UnsupportedEncodingException {
        String result = "";
        if (originString != null) {
            try {
                // 指定加密的方式为MD5
                MessageDigest md = MessageDigest.getInstance("MD5");
                // 进行加密运算
                byte bytes[] = md.digest(originString.getBytes("ISO8859-1"));
                for (int i = 0; i < bytes.length; i++) {
                    // 将整数转换成十六进制形式的字符串 这里与0xff进行与运算的原因是保证转换结果为32位
                    String str = Integer.toHexString(bytes[i] & 0xFF);
                    if (str.length() == 1) {
                        str += "F";
                    }
                    result += str;
                }
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
