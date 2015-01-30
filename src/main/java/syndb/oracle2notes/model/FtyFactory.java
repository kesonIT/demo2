package syndb.oracle2notes.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the FTY_FACTORY database table.
 * 
 */
@Entity
@Table(name="FTY_FACTORY")
@NamedQuery(name="FtyFactory.findAll", query="SELECT f FROM FtyFactory f")
public class FtyFactory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FACTORY_ID")
	private String factoryId;

	private String address;

	private String city;

	private String continent;

	private String country;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="FCTY_NAME")
	private String fctyName;

	@Column(name="FCTY_NAME_CN")
	private String fctyNameCn;

	private String fix;

	@Column(name="MGR_EMAIL")
	private String mgrEmail;

	@Column(name="MGR_FIX")
	private String mgrFix;

	@Column(name="MGR_FOLLOW_NAME")
	private String mgrFollowName;

	@Column(name="MGR_MOBILE")
	private String mgrMobile;

	@Column(name="MGR_NAME")
	private String mgrName;

	@Column(name="NEAR_AI_OFC")
	private String nearAiOfc;

	@Column(name="OTHER_FIX")
	private String otherFix;

	@Column(name="OTHER_FOLLOW_NAME")
	private String otherFollowName;

	@Column(name="OTHER_MAIL")
	private String otherMail;

	@Column(name="OTHER_MOBILE")
	private String otherMobile;

	@Column(name="OTHER_NAME")
	private String otherName;

	@Column(name="POST_CODE")
	private String postCode;

	private String province;

	@Column(name="SALES_FIX")
	private String salesFix;

	@Column(name="SALES_FOLLOW_NAME")
	private String salesFollowName;

	@Column(name="SALES_MAIL")
	private String salesMail;

	@Column(name="SALES_MOBILE")
	private String salesMobile;

	@Column(name="SALES_NAME")
	private String salesName;

	@Column(name="SUPPLIER_ID")
	private String supplierId;

	@Column(name="UPDATE_TIME")
	private Timestamp updateTime;

	public FtyFactory() {
	}

	public String getFactoryId() {
		return this.factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContinent() {
		return this.continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getFctyName() {
		return this.fctyName;
	}

	public void setFctyName(String fctyName) {
		this.fctyName = fctyName;
	}

	public String getFctyNameCn() {
		return this.fctyNameCn;
	}

	public void setFctyNameCn(String fctyNameCn) {
		this.fctyNameCn = fctyNameCn;
	}

	public String getFix() {
		return this.fix;
	}

	public void setFix(String fix) {
		this.fix = fix;
	}

	public String getMgrEmail() {
		return this.mgrEmail;
	}

	public void setMgrEmail(String mgrEmail) {
		this.mgrEmail = mgrEmail;
	}

	public String getMgrFix() {
		return this.mgrFix;
	}

	public void setMgrFix(String mgrFix) {
		this.mgrFix = mgrFix;
	}

	public String getMgrFollowName() {
		return this.mgrFollowName;
	}

	public void setMgrFollowName(String mgrFollowName) {
		this.mgrFollowName = mgrFollowName;
	}

	public String getMgrMobile() {
		return this.mgrMobile;
	}

	public void setMgrMobile(String mgrMobile) {
		this.mgrMobile = mgrMobile;
	}

	public String getMgrName() {
		return this.mgrName;
	}

	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}

	public String getNearAiOfc() {
		return this.nearAiOfc;
	}

	public void setNearAiOfc(String nearAiOfc) {
		this.nearAiOfc = nearAiOfc;
	}

	public String getOtherFix() {
		return this.otherFix;
	}

	public void setOtherFix(String otherFix) {
		this.otherFix = otherFix;
	}

	public String getOtherFollowName() {
		return this.otherFollowName;
	}

	public void setOtherFollowName(String otherFollowName) {
		this.otherFollowName = otherFollowName;
	}

	public String getOtherMail() {
		return this.otherMail;
	}

	public void setOtherMail(String otherMail) {
		this.otherMail = otherMail;
	}

	public String getOtherMobile() {
		return this.otherMobile;
	}

	public void setOtherMobile(String otherMobile) {
		this.otherMobile = otherMobile;
	}

	public String getOtherName() {
		return this.otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getSalesFix() {
		return this.salesFix;
	}

	public void setSalesFix(String salesFix) {
		this.salesFix = salesFix;
	}

	public String getSalesFollowName() {
		return this.salesFollowName;
	}

	public void setSalesFollowName(String salesFollowName) {
		this.salesFollowName = salesFollowName;
	}

	public String getSalesMail() {
		return this.salesMail;
	}

	public void setSalesMail(String salesMail) {
		this.salesMail = salesMail;
	}

	public String getSalesMobile() {
		return this.salesMobile;
	}

	public void setSalesMobile(String salesMobile) {
		this.salesMobile = salesMobile;
	}

	public String getSalesName() {
		return this.salesName;
	}

	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}

	public String getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}