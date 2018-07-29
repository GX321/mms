/**
 * 
 */
package com.clps.mms.util.dao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
* @ClassName: ExcelAttribute  
* @Description: 导出模板  
* @author Clement.chen  
* @date 2018年5月11日 上午10:06:12  
*
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.FIELD })
public @interface ExcelAttribute {

	/**
	 * 导出到Excel中的名字.
	 */
	public abstract String name();

	/**
	 * 配置列的名称,对应A,B,C,D....
	 */
	public abstract String column();

	/**
	 * 提示信息
	 */
	public abstract String prompt() default "";

	/**
	 * 设置只能选择不能输入的列内容.
	 */
	public abstract String[] combo() default {};

	/**
	 * 是否导出数据,应对需求:我们需要导出一份模板.
	 */
	public abstract boolean isExport() default true;

}
