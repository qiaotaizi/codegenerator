package com.jaiz.orm.codegenerator.entity;

/**
 * 表列实体类
 * @author graci
 *
 */
public class TableColumn {

	/**
	 * 列名
	 */
	private String columnName;
	
	/**
	 * 类型
	 */
	private String dataType;
	
	/**
	 * 数值精度
	 */
	private Integer numericPrecision;
	
	/**
	 * 小数位数
	 */
	private Integer numericScale;
	
	/**
	 * 列注解
	 */
	private String columnComment;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getNumericPrecision() {
		return numericPrecision;
	}

	public void setNumericPrecision(Integer numericPrecision) {
		this.numericPrecision = numericPrecision;
	}

	public Integer getNumericScale() {
		return numericScale;
	}

	public void setNumericScale(Integer numericScale) {
		this.numericScale = numericScale;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}
	
	
}
