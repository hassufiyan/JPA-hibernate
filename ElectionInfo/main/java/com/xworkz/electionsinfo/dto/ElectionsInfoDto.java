package com.xworkz.electionsinfo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ElectionInfo")
@NamedQuery(name="readAll",query="Select dto from ElectionsInfoDto dto")
public class ElectionsInfoDto {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	 int id;
	private String name;
	private String adrress;
	private String age;
	private String mobileNo;
	private String pinCode;
	public ElectionsInfoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectionsInfoDto(String name, String adrress, String age, String mobileNo, String pinCode) {
		super();
		this.name = name;
		this.adrress = adrress;
		this.age = age;
		this.mobileNo = mobileNo;
		this.pinCode = pinCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdrress() {
		return adrress;
	}
	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "ElectionsInfoDto [id=" + id + ", name=" + name + ", adrress=" + adrress + ", age=" + age + ", mobileNo="
				+ mobileNo + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
}
