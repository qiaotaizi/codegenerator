package com.jaiz.orm.codegenerator.entity;

/**
 * 类成员元数据
 * @author graci
 *
 */
public class TypeMemberSchema {

	/**
	 * 变量名
	 */
	private String memberName;
	
	/**
	 * 变量类型
	 */
	private String memberType;
	
	/**
	 * 变量注释
	 */
	private String memberComment;

	public String getMemberComment() {
		return memberComment;
	}

	public void setMemberComment(String memberComment) {
		this.memberComment = memberComment;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	
}
