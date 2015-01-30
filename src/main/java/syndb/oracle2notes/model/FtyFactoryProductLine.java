package syndb.oracle2notes.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the FTY_FACTORY_PRODUCT_LINES database table.
 * 
 */
@Entity
@Table(name="FTY_FACTORY_PRODUCT_LINES")
@NamedQuery(name="FtyFactoryProductLine.findAll", query="SELECT f FROM FtyFactoryProductLine f")
public class FtyFactoryProductLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="FACTORY_ID")
	private String factoryId;

	@Column(name="PARM_PRODUCT_FAMILY_ID")
	private String parmProductFamilyId;

	@Column(name="UPDATE_TIME")
	private Timestamp updateTime;

	public FtyFactoryProductLine() {
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getFactoryId() {
		return this.factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}

	public String getParmProductFamilyId() {
		return this.parmProductFamilyId;
	}

	public void setParmProductFamilyId(String parmProductFamilyId) {
		this.parmProductFamilyId = parmProductFamilyId;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}