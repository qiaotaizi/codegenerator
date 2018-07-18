package com.jaiz.orm.codegenerator.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class DataSourceHolder {

	private static Logger logger=Logger.getLogger(DataSourceHolder.class);
	
	private static SqlSessionFactory sessionFactory=null;
	
	static {
		System.out.println("正在初始化数据源");
		InputStream in=null;
		try {
			in = Resources.getResourceAsStream("mybatis_config.xml");
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			sessionFactory=builder.build(in);
		} catch (IOException e) {
			logger.error(e.getMessage());
			System.out.println("数据源初始化失败");
		}finally {
			if(in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					logger.error(e.getMessage());
				}
			}
		}
		System.out.println("初始化数据源完毕");
		System.out.println(Constants.STDOUT_SEPERATOR);
	}
	
	public static SqlSessionFactory getFactoryInstance() {
		return sessionFactory;
	}
}
