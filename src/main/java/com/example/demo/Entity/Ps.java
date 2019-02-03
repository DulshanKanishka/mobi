package com.example.demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phons_and_shops")
public class Ps {
	@Id
	@Column(name = "phone_and_shops_id")
	private String psid;
	
	@ManyToOne(cascade = CascadeType.ALL)
//	@Column(name = "phone")
//	@Column(name="FK_Phone",nullable = false, length=100)
	private Phone phone;
	
	@ManyToOne(cascade = CascadeType.ALL)
//	@Column(name = "shops")
//	@Column(name="FK_Shops",nullable = false, length=100)
	private Shops shops;
	
	public Ps() {
	}
	
	public Ps(String psid, Phone phone, Shops shops) {
		this.psid = psid;
		this.phone = phone;
		this.shops = shops;
	}
	
	public String getPsid() {
		return psid;
	}
	
	public void setPsid(String psid) {
		this.psid = psid;
	}
	
	public Phone getPhone() {
		return phone;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public Shops getShops() {
		return shops;
	}
	
	public void setShops(Shops shops) {
		this.shops = shops;
	}
	
	@Override
	public String toString() {
		return "Ps [psid=" + psid + ", phone=" + phone + ", shops=" + shops + "]";
	}
	

}
