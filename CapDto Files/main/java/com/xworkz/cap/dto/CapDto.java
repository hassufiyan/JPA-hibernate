package com.xworkz.cap.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cap")
public class CapDto {
	
	@Id
	private int id;
	private String brandName;
	private String color;
	private int price;
	private String type;
	
	public CapDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CapDto(int id, String brandName, String color, int price, String type) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.color = color;
		this.price = price;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CapDto [id=" + id + ", brandName=" + brandName + ", color=" + color + ", price=" + price + ", type="
				+ type + "]";
	}
	
	

}
