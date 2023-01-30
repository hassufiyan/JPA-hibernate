package com.xworkz.specs.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="specs")
@NamedQuery(name="readAll",query="Select dto  from SpecsDto dto")
@NamedQuery(name="findByShapeAndPrice",query="Select dto from SpecsDto dto where dto.shape=:sh and dto.price=:pr")
@NamedQuery(name="updatePriceByName",query="Update SpecsDto dto set dto.price=:pr where brandName=:bnm")
@NamedQuery(name="updateColorByShapeAndprice",query="Update SpecsDto dto set dto.color=:clr where dto.shape=:shp and dto.price=:prc")
@NamedQuery(name="deleteByPriceAndColor",query="Delete From SpecsDto dto where dto.price=:pr and dto.color=:clr")
@NamedQuery(name="deleteByNameAndId",query="Delete From SpecsDto dto where dto.brandName=:brn and dto.id=:id")
public class SpecsDto {
	
	@Id
	private int id;
	private String brandName;
	private String color;
	private String shape;
	private int price;
	public SpecsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpecsDto(int id, String brandName, String color, String shape, int price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.color = color;
		this.shape = shape;
		this.price = price;
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
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "SpecsDto [id=" + id + ", brandName=" + brandName + ", color=" + color + ", shape=" + shape + ", price="
				+ price + "]";
	}

	
	
	
	
	
	
	
	
}
