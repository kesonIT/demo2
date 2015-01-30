package syndb.oracle2notes.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the FTY_SUPPLIER_PRODUCT_LINES database table.
 * 
 */
@Entity
@Table(name="FTY_SUPPLIER_PRODUCT_LINES")
@NamedQuery(name="FtySupplierProductLine.findAll", query="SELECT f FROM FtySupplierProductLine f")
public class FtySupplierProductLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FtySupplierProductLinePK id;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="UPDATE_TIME")
	private Timestamp updateTime;

	public FtySupplierProductLine() {
	}

	public FtySupplierProductLinePK getId() {
		return this.id;
	}

	public void setId(FtySupplierProductLinePK id) {
		this.id = id;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}