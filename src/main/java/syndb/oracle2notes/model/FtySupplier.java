package syndb.oracle2notes.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the FTY_SUPPLIER database table.
 * 
 */
@Entity
@Table(name="FTY_SUPPLIER")
@NamedQuery(name="FtySupplier.findAll", query="SELECT f FROM FtySupplier f")
public class FtySupplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SUPPLIER_ID")
	private String supplierId;

	private String address;

	@Column(name="BUS_LIC")
	private String busLic;

	private String city;

	private String country;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="CUST_ID")
	private String custId;

	@Column(name="CUST_LOGIN")
	private String custLogin;

	@Column(name="EMPLOYEE_NB")
	private String employeeNb;

	@Column(name="EXPORT_LIC")
	private String exportLic;

	private String fix;

	@Column(name="IS_MULTI_LOCATION")
	private String isMultiLocation;

	@Column(name="IS_NEW_SUPPLIER")
	private String isNewSupplier;

	@Column(name="ISO_CERT")
	private String isoCert;

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

	@Column(name="OTHER_DOC")
	private String otherDoc;

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

	@Column(name="ROHS_CERT")
	private String rohsCert;

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

	@Column(name="SUPPL_NAME")
	private String supplName;

	@Column(name="SUPPL_NAME_CN")
	private String supplNameCn;

	@Column(name="TAX_CERT")
	private String taxCert;

	@Column(name="TEST_REPORT")
	private String testReport;

	private String turnover;

	@Column(name="UPDATE_TIME")
	private Timestamp updateTime;

	private String website;

	public FtySupplier() {
	}

	public String getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusLic() {
		return this.busLic;
	}

	public void setBusLic(String busLic) {
		this.busLic = busLic;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustLogin() {
		return this.custLogin;
	}

	public void setCustLogin(String custLogin) {
		this.custLogin = custLogin;
	}

	public String getEmployeeNb() {
		return this.employeeNb;
	}

	public void setEmployeeNb(String employeeNb) {
		this.employeeNb = employeeNb;
	}

	public String getExportLic() {
		return this.exportLic;
	}

	public void setExportLic(String exportLic) {
		this.exportLic = exportLic;
	}

	public String getFix() {
		return this.fix;
	}

	public void setFix(String fix) {
		this.fix = fix;
	}

	public String getIsMultiLocation() {
		return this.isMultiLocation;
	}

	public void setIsMultiLocation(String isMultiLocation) {
		this.isMultiLocation = isMultiLocation;
	}

	public String getIsNewSupplier() {
		return this.isNewSupplier;
	}

	public void setIsNewSupplier(String isNewSupplier) {
		this.isNewSupplier = isNewSupplier;
	}

	public String getIsoCert() {
		return this.isoCert;
	}

	public void setIsoCert(String isoCert) {
		this.isoCert = isoCert;
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

	public String getOtherDoc() {
		return this.otherDoc;
	}

	public void setOtherDoc(String otherDoc) {
		this.otherDoc = otherDoc;
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

	public String getRohsCert() {
		return this.rohsCert;
	}

	public void setRohsCert(String rohsCert) {
		this.rohsCert = rohsCert;
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

	public String getSupplName() {
		return this.supplName;
	}

	public void setSupplName(String supplName) {
		this.supplName = supplName;
	}

	public String getSupplNameCn() {
		return this.supplNameCn;
	}

	public void setSupplNameCn(String supplNameCn) {
		this.supplNameCn = supplNameCn;
	}

	public String getTaxCert() {
		return this.taxCert;
	}

	public void setTaxCert(String taxCert) {
		this.taxCert = taxCert;
	}

	public String getTestReport() {
		return this.testReport;
	}

	public void setTestReport(String testReport) {
		this.testReport = testReport;
	}

	public String getTurnover() {
		return this.turnover;
	}

	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}