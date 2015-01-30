package syndb.oracle2notes.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the FTY_MODI database table.
 * 
 */
@Entity
@Table(name="FTY_MODI")
@NamedQuery(name="FtyModi.findAll", query="SELECT f FROM FtyModi f")
public class FtyModi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="SUPPLIER_ID")
	private String supplierId;

	private String sync;

	@Column(name="TABLE_NAME")
	private String tableName;

	public FtyModi() {
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSync() {
		return this.sync;
	}

	public void setSync(String sync) {
		this.sync = sync;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}