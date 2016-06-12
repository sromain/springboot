package com.javamind.springboot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="qualificatifs")
public class Qualificatif {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="qual_id")
	private Integer qualId;

	@Column(name="qual_code")
	private String qualCode;

	@Column(name="qual_libelle")
	private String qualLibelle;

	public Qualificatif() {}

	public Qualificatif(String code, String libelle) {
		super();
		this.qualCode = code;
		this.qualLibelle = libelle;
	}

	public Integer getQualId() {
		return this.qualId;
	}

	public void setQualId(Integer qualId) {
		this.qualId = qualId;
	}

	public String getQualCode() {
		return this.qualCode;
	}

	public void setQualCode(String qualCode) {
		this.qualCode = qualCode;
	}

	public String getQualLibelle() {
		return this.qualLibelle;
	}

	public void setQualLibelle(String qualLibelle) {
		this.qualLibelle = qualLibelle;
	}

}
