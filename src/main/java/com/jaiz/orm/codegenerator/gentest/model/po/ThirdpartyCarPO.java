package com.jaiz.orm.codegenerator.gentest.model.po;

import java.util.Date;
import java.math.BigDecimal;


public class ThirdpartyCarPO{

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 车源id
	 */
	private Long carId;

	/**
	 * 车源名称
	 */
	private String carName;

	/**
	 * 价格
	 */
	private BigDecimal price;

	/**
	 * 图片url
	 */
	private String image;

	/**
	 * 里程
	 */
	private BigDecimal mileage;

	/**
	 * 上牌年份
	 */
	private Long registrationDate;

	/**
	 * 车源类型，1：个人，2：4s店，22：4s店（认证），3：经销商，23：经销商（认证），4：贩子
	 */
	private Integer sourceId;

	/**
	 * 发布时间
	 */
	private Date publishDate;

	/**
	 * 发布时间描述
	 */
	private String pdate;

	/**
	 * 车系id
	 */
	private Long seriesId;

	/**
	 * 车系名称
	 */
	private String seriesName;

	/**
	 * 车型id
	 */
	private Long specId;

	/**
	 * 车型名称
	 */
	private String specName;

	/**
	 * 是否为新车（0：否，1：是)
	 */
	private Integer isNewCar;

	/**
	 * 是否有质保（原厂或延长）
	 */
	private Integer invoice;

	/**
	 * 销售状态（5：已售，9：在售）
	 */
	private Integer dealerType;

	/**
	 * 是否有图（0：否，1：是）
	 */
	private Integer goodCarOfPic;

	/**
	 * 是否站名车源（0：否，1：是）
	 */
	private Integer isOutSite;

	/**
	 * 省份id
	 */
	private Long pid;

	/**
	 * 省份名称
	 */
	private String pname;

	/**
	 * 城市id
	 */
	private Long cid;

	/**
	 * 城市名称
	 */
	private String cname;

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
	 * 车源id
	 * @return
	 */

	public Long getCarId() {
		return carId;
	}

	/**
	 * 车源id
	 * @param carId
	 */
	public void setCarId(Long carId) {
		this.carId = carId;
	}

	/**
	 * 车源名称
	 * @return
	 */

	public String getCarName() {
		return carName;
	}

	/**
	 * 车源名称
	 * @param carName
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}

	/**
	 * 价格
	 * @return
	 */

	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 价格
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 图片url
	 * @return
	 */

	public String getImage() {
		return image;
	}

	/**
	 * 图片url
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * 里程
	 * @return
	 */

	public BigDecimal getMileage() {
		return mileage;
	}

	/**
	 * 里程
	 * @param mileage
	 */
	public void setMileage(BigDecimal mileage) {
		this.mileage = mileage;
	}

	/**
	 * 上牌年份
	 * @return
	 */

	public Long getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * 上牌年份
	 * @param registrationDate
	 */
	public void setRegistrationDate(Long registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * 车源类型，1：个人，2：4s店，22：4s店（认证），3：经销商，23：经销商（认证），4：贩子
	 * @return
	 */

	public Integer getSourceId() {
		return sourceId;
	}

	/**
	 * 车源类型，1：个人，2：4s店，22：4s店（认证），3：经销商，23：经销商（认证），4：贩子
	 * @param sourceId
	 */
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * 发布时间
	 * @return
	 */

	public Date getPublishDate() {
		return publishDate;
	}

	/**
	 * 发布时间
	 * @param publishDate
	 */
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * 发布时间描述
	 * @return
	 */

	public String getPdate() {
		return pdate;
	}

	/**
	 * 发布时间描述
	 * @param pdate
	 */
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	/**
	 * 车系id
	 * @return
	 */

	public Long getSeriesId() {
		return seriesId;
	}

	/**
	 * 车系id
	 * @param seriesId
	 */
	public void setSeriesId(Long seriesId) {
		this.seriesId = seriesId;
	}

	/**
	 * 车系名称
	 * @return
	 */

	public String getSeriesName() {
		return seriesName;
	}

	/**
	 * 车系名称
	 * @param seriesName
	 */
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	/**
	 * 车型id
	 * @return
	 */

	public Long getSpecId() {
		return specId;
	}

	/**
	 * 车型id
	 * @param specId
	 */
	public void setSpecId(Long specId) {
		this.specId = specId;
	}

	/**
	 * 车型名称
	 * @return
	 */

	public String getSpecName() {
		return specName;
	}

	/**
	 * 车型名称
	 * @param specName
	 */
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	/**
	 * 是否为新车（0：否，1：是)
	 * @return
	 */

	public Integer getIsNewCar() {
		return isNewCar;
	}

	/**
	 * 是否为新车（0：否，1：是)
	 * @param isNewCar
	 */
	public void setIsNewCar(Integer isNewCar) {
		this.isNewCar = isNewCar;
	}

	/**
	 * 是否有质保（原厂或延长）
	 * @return
	 */

	public Integer getInvoice() {
		return invoice;
	}

	/**
	 * 是否有质保（原厂或延长）
	 * @param invoice
	 */
	public void setInvoice(Integer invoice) {
		this.invoice = invoice;
	}

	/**
	 * 销售状态（5：已售，9：在售）
	 * @return
	 */

	public Integer getDealerType() {
		return dealerType;
	}

	/**
	 * 销售状态（5：已售，9：在售）
	 * @param dealerType
	 */
	public void setDealerType(Integer dealerType) {
		this.dealerType = dealerType;
	}

	/**
	 * 是否有图（0：否，1：是）
	 * @return
	 */

	public Integer getGoodCarOfPic() {
		return goodCarOfPic;
	}

	/**
	 * 是否有图（0：否，1：是）
	 * @param goodCarOfPic
	 */
	public void setGoodCarOfPic(Integer goodCarOfPic) {
		this.goodCarOfPic = goodCarOfPic;
	}

	/**
	 * 是否站名车源（0：否，1：是）
	 * @return
	 */

	public Integer getIsOutSite() {
		return isOutSite;
	}

	/**
	 * 是否站名车源（0：否，1：是）
	 * @param isOutSite
	 */
	public void setIsOutSite(Integer isOutSite) {
		this.isOutSite = isOutSite;
	}

	/**
	 * 省份id
	 * @return
	 */

	public Long getPid() {
		return pid;
	}

	/**
	 * 省份id
	 * @param pid
	 */
	public void setPid(Long pid) {
		this.pid = pid;
	}

	/**
	 * 省份名称
	 * @return
	 */

	public String getPname() {
		return pname;
	}

	/**
	 * 省份名称
	 * @param pname
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * 城市id
	 * @return
	 */

	public Long getCid() {
		return cid;
	}

	/**
	 * 城市id
	 * @param cid
	 */
	public void setCid(Long cid) {
		this.cid = cid;
	}

	/**
	 * 城市名称
	 * @return
	 */

	public String getCname() {
		return cname;
	}

	/**
	 * 城市名称
	 * @param cname
	 */
	public void setCname(String cname) {
		this.cname = cname;
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