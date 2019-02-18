package com.jaiz.orm.codegenerator.gentest.model.po;

import java.util.Date;


public class OperateRecPO{

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 线索id
	 */
	private Long clueId;

	/**
	 * 操作人ID,默认0,即"system"
	 */
	private Long operatorId;

	/**
	 * 操作人姓名冗余
	 */
	private String operatorName;

	/**
	 * 操作行为
	 */
	private String content;

	/**
	 * 是否存在录音(0否1是)
	 */
	private Integer recExist;

	/**
	 * 录音链接
	 */
	private String recUrl;

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 主键
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 主键
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 线索id
	 * @return
	 */
	public Long getClueId() {
		return clueId;
	}

	/**
	 * 线索id
	 * @param clueId
	 */
	public void setClueId(Long clueId) {
		this.clueId = clueId;
	}

	/**
	 * 操作人ID,默认0,即"system"
	 * @return
	 */
	public Long getOperatorId() {
		return operatorId;
	}

	/**
	 * 操作人ID,默认0,即"system"
	 * @param operatorId
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * 操作人姓名冗余
	 * @return
	 */
	public String getOperatorName() {
		return operatorName;
	}

	/**
	 * 操作人姓名冗余
	 * @param operatorName
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	/**
	 * 操作行为
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 操作行为
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 是否存在录音(0否1是)
	 * @return
	 */
	public Integer getRecExist() {
		return recExist;
	}

	/**
	 * 是否存在录音(0否1是)
	 * @param recExist
	 */
	public void setRecExist(Integer recExist) {
		this.recExist = recExist;
	}

	/**
	 * 录音链接
	 * @return
	 */
	public String getRecUrl() {
		return recUrl;
	}

	/**
	 * 录音链接
	 * @param recUrl
	 */
	public void setRecUrl(String recUrl) {
		this.recUrl = recUrl;
	}

	/**
	 * 修改时间
	 * @return
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * 修改时间
	 * @param modifyTime
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * 创建时间
	 * @return
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}