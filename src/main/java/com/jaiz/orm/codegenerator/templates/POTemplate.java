package com.jaiz.orm.codegenerator.templates;

import com.jaiz.orm.codegenerator.entity.TemplatePlaceHolder;
import com.jaiz.orm.codegenerator.entity.TypeMemberSchema;
import com.jaiz.orm.codegenerator.util.StringUtil;

/**
 * po模板
 * 
 * @author graci
 *
 */
public class POTemplate {

	/**
	 * 模板实际内容
	 */
	private String content;

	public POTemplate(TemplatePlaceHolder holder) {
		//系统换行符
		String lsep=System.lineSeparator();
		StringBuilder sb = new StringBuilder();
		sb.append("package " + holder.getPackageName()+";")
		.append(lsep)
		.append(lsep);
		for(String imp:holder.getImportBlock()) {
			sb.append(imp).append(lsep);
		}
		sb.append(lsep)
		.append(lsep)
		.append("public class "+holder.getClassName()+"{")
		.append(lsep)
		.append(lsep);
		//加入字段
		for(TypeMemberSchema member:holder.getMembers()) {
			//注释
			sb.append("\t/**")
			.append(lsep)
			.append("\t * "+member.getMemberComment())
			.append(lsep)
			.append("\t */")
			.append(lsep)
			//字段
			.append("\tprivate "+member.getMemberType()+" "+member.getMemberName()+";")
			.append(lsep)
			.append(lsep);
		}
		//加入getter/setter方法
		for(TypeMemberSchema member:holder.getMembers()) {
			//getter
			//注释
			sb.append("\t/**")
			.append(lsep)
			.append("\t * "+member.getMemberComment())
			.append(lsep)
			.append("\t * @return")
			.append(lsep)
			.append("\t */")
			.append(lsep)
			.append(lsep)
			//方法
			.append("\tpublic "+member.getMemberType()+" "+StringUtil.memberName2Getter(member.getMemberName())+"() {")
			.append(lsep)
			.append("\t\treturn "+member.getMemberName()+";")
			.append(lsep)
			.append("\t}")
			.append(lsep)
			.append(lsep)
			//setter
			//注释
			.append("\t/**")
			.append(lsep)
			.append("\t * "+member.getMemberComment())
			.append(lsep)
			.append("\t * @param "+member.getMemberName())
			.append(lsep)
			.append("\t */")
			.append(lsep)
			//方法
			.append("\tpublic void "+StringUtil.memberName2Setter(member.getMemberName())+"("+member.getMemberType()+" "+member.getMemberName()+") {")
			.append(lsep)
			.append("\t\tthis."+member.getMemberName()+" = "+member.getMemberName()+";")
			.append(lsep)
			.append("\t}")
			.append(lsep)
			.append(lsep);
		}
		sb.append("}");
		this.content=sb.toString();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
