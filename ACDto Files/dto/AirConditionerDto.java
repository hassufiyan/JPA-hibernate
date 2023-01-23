package com.xworkz.airconditioner.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="AIrConditioner")
public class AirConditionerDto {
	
	@Id
	private int id;
	private String brandName;
	private int price;
	private String color;
	private int stars;
	public AirConditionerDto(int id, String brandName, int price, String color, int stars) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.price = price;
		this.color = color;
		this.stars = stars;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	@Override
	public String toString() {
		return "AirConditionerDto [id=" + id + ", brandName=" + brandName + ", price=" + price + ", color=" + color
				+ ", stars=" + stars + "]";
	}





}
