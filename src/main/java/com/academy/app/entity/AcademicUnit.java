package com.academy.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "academic_unit")
public class AcademicUnit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name="academic_unit_key")
	private String academicUnitKey;
	
	@Column(name="academic_unit_value")
	private String academicUnitValue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcademicUnitKey() {
		return academicUnitKey;
	}

	public void setAcademicUnitKey(String academicUnitKey) {
		this.academicUnitKey = academicUnitKey;
	}

	public String getAcademicUnitValue() {
		return academicUnitValue;
	}

	public void setAcademicUnitValue(String academicUnitValue) {
		this.academicUnitValue = academicUnitValue;
	}
	
}
