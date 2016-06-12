package com.javamind.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.orm.jpa.EntityScan;


@Entity
@Table(name="sites")
public class Site {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="site_id")
	private Integer id;
	
	@Column(name="site_code")
	private String code;
	
	@Column(name="site_libelle")
	private String libelle;
	
	public Site() {
		super();
	}

	public Site(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
