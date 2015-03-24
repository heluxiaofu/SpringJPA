package po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tperson entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tperson", schema = "dbo", catalog = "OriginalWorksGallery")
public class Tperson implements java.io.Serializable {

	// Fields

	private Long tpersonId;
	private Long tpersonBelong;

	// Constructors

	/** default constructor */
	public Tperson() {
	}

	/** full constructor */
	public Tperson(Long tpersonId, Long tpersonBelong) {
		this.tpersonId = tpersonId;
		this.tpersonBelong = tpersonBelong;
	}

	// Property accessors
	@Id
	@Column(name = "tpersonId", unique = true, nullable = false)
	public Long getTpersonId() {
		return this.tpersonId;
	}

	public void setTpersonId(Long tpersonId) {
		this.tpersonId = tpersonId;
	}

	@Column(name = "tpersonBelong", nullable = false)
	public Long getTpersonBelong() {
		return this.tpersonBelong;
	}

	public void setTpersonBelong(Long tpersonBelong) {
		this.tpersonBelong = tpersonBelong;
	}

}