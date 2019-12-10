package com.jaiz.orm.codegenerator.util;

import java.io.File;

/**
 * 字符串处理工具类
 * 
 * @author graci
 *
 */
public class StringUtil {

	/**
	 * 下划线变量名转驼峰
	 * 
	 * @param varName 变量名 非空
	 * @return
	 */
	public static String dash2Camel(String varName) {
		varName = varName.toLowerCase();
		char[] carr = varName.toCharArray();
		boolean caseChange = false;
		StringBuilder sb = new StringBuilder(varName.length());
		for (char c : carr) {
			if (c == '_') {
				caseChange = true;
			} else {
				if (caseChange) {
					// 小写转大写
					c = charToUpperCase(c);
					caseChange=false;
				}
				// 拼接
				sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * 小写字符转大写
	 * 
	 * @param c
	 * @return
	 */
	private static char charToUpperCase(char c) {
		return (char) (c - 32);
	}

	/**
	 * 表名转VO类
	 * @param tableName
	 * @return
	 */
	public static String tableName2POClassName(String tableName) {
		tableName = tableName.toLowerCase();
		char[] carr = tableName.toCharArray();
		//首字母转大写
		boolean caseChange = true;
		StringBuilder sb = new StringBuilder(tableName.length());
		for (char c : carr) {
			if (c == '_') {
				caseChange = true;
			} else {
				if (caseChange) {
					// 小写转大写
					c = charToUpperCase(c);
					caseChange=false;
				}
				// 拼接
				sb.append(c);
			}
		}
		sb.append("VO");
		return sb.toString();
	}

	/**
	 * 包名转文件系统路径
	 * @param packageName
	 * @return
	 */
	public static String packageName2FilePath(String packageName) {
		return packageName.replace(Constants.PACKAGE_NAME_SEPERATOR, File.separator);
	}

	/**
	 * 变量名转getter方法
	 * @param memberName
	 * @return
	 */
	public static String memberName2Getter(String memberName) {
		return "get"+(char)(memberName.charAt(0)-32)+memberName.substring(1);
	}
	
	/**
	 * 变量名转setter方法
	 * @param memberName
	 * @return
	 */
	public static String memberName2Setter(String memberName) {
		return "set"+(char)(memberName.charAt(0)-32)+memberName.substring(1);
	}
}
