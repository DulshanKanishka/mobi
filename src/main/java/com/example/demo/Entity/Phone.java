package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone")
public class Phone {
	    @Id
	    @Column(name ="phone_name")
	    private String phoneName;
	    @Column(name ="phone_brand")
	    private String brand;
		public Phone() {
		}
		public Phone(String phoneName, String brand) {
			this.phoneName = phoneName;
			this.brand = brand;
		}
		public String getPhoneName() {
			return phoneName;
		}
		public void setPhoneName(String phoneName) {
			this.phoneName = phoneName;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		@Override
		public String toString() {
			return "Phone [phoneName=" + phoneName + ", brand=" + brand + "]";
		}
		
	   
}
