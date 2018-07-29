package com.clps.mms.util.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
		* @author: Sail.Zhang
		* @createTime: 2018年5月8日 上午9:04:24
 */
public class MyBatisUtil {
	

	private final static SqlSessionFactory sqlSessionFactory;
	
	static {
		String resource = "mybatis.xml";
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