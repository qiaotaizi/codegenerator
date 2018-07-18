package com.jaiz.orm.codegenerator.entity;

import java.util.List;

/**
 * 模板填充类
 * @author graci
 *
 */
public class TemplatePlaceHolder {

	/**
	 * 类名
	 */
	private String className;
	
	/**
	 * 包名
	 */
	private String packageName;
	
	/**
	 * 所有字段
	 */
	private List<TypeMemberSchema> members;
	
	/**
	 * 导入语句块
	 */
	private List<String> importBlock;
	
	public List<String> getImportBlock() {
		return importBlock;
	}

	public void setImportBlock(List<String> importBlock) {
		this.importBlock = importBlock;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<TypeMemberSchema> getMembers() {
		return members;
	}

	public void setMembers(List<TypeMemberSchema> members) {
		this.members = members;
	}

	
	
}
