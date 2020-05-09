package com.academy.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff_band")
public class StaffBand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="staff_band")
	private String staffBand;
	
	@Column(name="band_desc")
	private String bandDesc;

	public StaffBand() {
		super();
	}

	public StaffBand(String staffBand, String bandDesc) {
		super();
		this.staffBand = staffBand;
		this.bandDesc = bandDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffBand() {
		return staffBand;
	}

	public void setStaffBand(String staffBand) {
		this.staffBand = staffBand;
	}

	public String getBandDesc() {
		return bandDesc;
	}

	public void setBandDesc(String bandDesc) {
		this.bandDesc = bandDesc;
	}

	@Override
	public String toString() {
		return "StaffBand [id=" + id + ", staffBand=" + staffBand + ", bandDesc=" + bandDesc + "]";
	}

}
