package com.example.demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "home_list")
public class HomeList {
    @Id
    @Column(name ="home_list_id")
    private String hlid;
    @ManyToOne(cascade = CascadeType.ALL)
//    @Column(name ="phone")
//	@Column(name="Student",nullable = false, length=100)
    private Phone phone;
    @Column(name ="type")
    private String typee;
	
    public HomeList(String hlid, Phone phone, String typee) {
		this.hlid = hlid;
		this.phone = phone;
		this.typee = typee;
	}

	public HomeList() {
	}

	public String getHlid() {
		return hlid;
	}

	public void setHlid(String hlid) {
		this.hlid = hlid;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getTypee() {
		return typee;
	}

	public void setTypee(String typee) {
		this.typee = typee;
	}

	@Override
	public String toString() {
		return "HomeList [hlid=" + hlid + ", phone=" + phone + ", typee=" + typee + "]";
	}

    
    
    
}
