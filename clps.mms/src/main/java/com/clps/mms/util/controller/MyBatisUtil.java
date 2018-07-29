package com.clps.mms.util.controller;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
	* @desc: clps.mms
	* @author: Harley.gu
	* @createTime: 2018年5月14日 上午11:06:18
	* @description:
	* @history:
	* @version: v1.0
 */
public class MyBatisUtil {
	
	private final static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "mybatis-config.xml";
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}