
package com.clps.mms.util.pojo;

import com.clps.mms.util.dao.ExcelAttribute;

/**
 * 
* @ClassName: UserTestModule  
* @Description: User测试用信息   
* @author Clement.chen  
* @date 2018年5月11日 上午10:08:49  
*
 */
public class UserTestModule {
	@ExcelAttribute(name = "序号", column = "A")
	private int id;

	@ExcelAttribute(name = "姓名", column = "B", isExport = true)
	private String name;

	@ExcelAttribute(name = "年龄", column = "C", prompt = "年龄", isExport = true)
	private int age;

	/*@ExcelAttribute(name = "班级", column = "D", combo = { "五期提高班", "六期提高班", "七期提高班" })
	private String clazz;*/

	@ExcelAttribute(name = "公司", column = "D")
	private String company;

	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/* (非 Javadoc)  
	 * <p>Title: toString</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see java.lang.Object#toString()  
	 */
	@Override
	public String toString() {
		return "UserTestModule [id=" + id + ", name=" + name + ", age=" + age + ", company=" + company + "]";
	}

	
}
