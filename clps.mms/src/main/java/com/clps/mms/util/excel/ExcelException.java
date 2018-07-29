
package com.clps.mms.util.excel;

/**
 * 
* @ClassName: ExcelException  
* @Description: 导出异常 
* @author Clement.chen  
* @date 2018年5月11日 上午10:10:51  
*
 */
public class ExcelException extends Exception {  
    
    /**  
	 * @Fields serialVersionUID 
	 */  
	private static final long serialVersionUID = 8523005781633694257L;

	public ExcelException() {  
        
    }  
  
    public ExcelException(String message) {  
        super(message);  
    }  
  
    public ExcelException(Throwable cause) {  
        super(cause);  
    }  
  
    public ExcelException(String message, Throwable cause) {  
        super(message, cause);  
    }  
}