/**
 * 
 */
package com.clps.mms.util.date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @Title:日期工具类
 * @Description:进行日期格式转换 时间的获取
 * @Author:Gavin.Xu
 * @Since:2018年5月11日上午9:23:18
 * @Version:1.1.0
 */
public class DateUtil {
	private static final String DATETIME_YMD1 = "yyyy-MM-dd";
	private static final String DATETIME_YMD2 = "yyyy/MM/dd";
	private static final String DATETIME_YMDMS1 = "yyyy-MM-dd HH:mm:ss.SSS";
	private static final String DATETIME_YMDMS2 = "yyyy/MM/dd HH:mm:ss.SSS";
	private static final String DATETIME_YMDMS3 = "yyyy-MM-dd HH:mm:ss";
	private static final String DATETIME_YMDMS4 = "yyyy/MM/dd HH:mm:ss";
	private static final String DATETIME_YMDMSS = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒";
	SimpleDateFormat simpleDateTime = null;

	public DateUtil() {
		this.simpleDateTime = new SimpleDateFormat();
	}

	/**
	 * 
	 * @param date
	 *            需要格式化的日期字符串类型
	 * @return 返回java.util 的日期时间 2018-05-09 
	 */
	public static String DateToString1(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(DATETIME_YMD1);
		return sdf.format(date);
	}

	/**
	 * 
	 * @param date
	 *            需要格式化的日期字符串类型
	 * @return 返回java.util 的日期时间 2018/05/09
	 */
	public static String DateToString2(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(DATETIME_YMD2);
		return sdf.format(date);
	}
	/**
	 * 
	 * @param date
	 *            需要格式化的日期字符串类型
	 * @return 返回java.util 的日期时间 2018-05-09 11:10:10.003
	 */
	public static String DateToString3(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(DATETIME_YMDMS1);
		return sdf.format(date);
	}
	/**
	 * 
	 * @param date
	 *            需要格式化的日期字符串类型
	 * @return 返回java.util 的日期时间 2018/05/09 11:10:10.003
	 */
	public static String DateToString4(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(DATETIME_YMDMS2);
		return sdf.format(date);
	}
	/**
	 * 
	 * @param date
	 *            需要格式化的日期字符串类型
	 * @return 返回java.util 的日期时间 2018-05-09 11:10:10
	 */
	public static String DateToString5(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(DATETIME_YMDMS3);
		return sdf.format(date);
	}
	
	/**
	 * 
	 * @param date
	 *            需要格式化的日期字符串类型
	 * @return 返回java.util 的日期时间 2018/05/09 11:10:10
	 */
	public static String DateToString6(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(DATETIME_YMDMS4);
		return sdf.format(date);
	}
	/**
	 * 
	 * @param date
	 *            需要格式化的日期字符串类型
	 * @return 返回java.util 的日期时间 2018年05月09日 11时09分05秒099毫秒
	 */
	public static String DateToString7(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(DATETIME_YMDMS3);
		return sdf.format(date);
	}
	/**
	 * 
	 * @param datetime
	 *            需要格式化的日期字符串类型 2018-05-09 11:10:10.003
	 * @return 返回
	 * @throws ParseException
	 */
	public static Date StringToDate1(String datetime) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(DATETIME_YMDMS3);
		return sdf.parse(datetime);

	}

	/**
	 * 
	 * @param datetime
	 *            需要格式化的日期字符串类型 2018年05月09日 11时09分05秒099毫秒
	 * @return 返回
	 * @throws ParseException
	 */
	public static Date StringToDate2(String datetime) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(DATETIME_YMDMSS);
		return sdf.parse(datetime);

	}

	/**
	 * 将符合pattern格式的dateValue转换成Date
	 * 
	 * @param dateValue
	 *            样例:2018/05/10
	 * @param pattern
	 *            样例:yyyy/MM/dd
	 * @return
	 * @throws ParseException
	 */
	public static Date parse(String dateValue, String pattern) throws ParseException {
		SimpleDateFormat formatTool = new SimpleDateFormat();
		formatTool.applyPattern(pattern);
		return formatTool.parse(dateValue);
	}
	


	/**
	 * 获取时间戳
	 * 
	 * @return 返回当前时间
	 */
	public Timestamp getTimestamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp;
	}

}
