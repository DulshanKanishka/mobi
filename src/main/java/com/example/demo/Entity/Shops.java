package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shops")
public class Shops {
	@Id
	@Column(name = "shops_id")
	private String sid;
	@Column(name = "shop_name")
	private String sname;
	@Column(name = "shop_place")
	private String place;
	public Shops() {
	}
	public Shops(String sid, String sname, String place) {
		this.sid = sid;
		this.sname = sname;
		this.place = place;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Shops [sid=" + sid + ", sname=" + sname + ", place=" + place + "]";
	}
	

}
