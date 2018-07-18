package com.jaiz.orm.codegenerator.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigHolder {

	private static Properties config=new Properties();
	
	static {
		try {
			System.out.println("初始化配置文件...");
			config.load(ConfigHolder.class.getResourceAsStream("/config.properties"));
			System.out.println("初始化配置文件成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 根据名称获取property
	 * @param name
	 * @return
	 */
	public static String getStringByName(String name) {
		return config.getProperty(name);
	}
	
	/**
	 * 直接获取bool类型的配置项
	 * @param name
	 * @return
	 */
	public static boolean getBoolByName(String name) {
		return Boolean.parseBoolean(getStringByName(name));
	}
	
	
}
