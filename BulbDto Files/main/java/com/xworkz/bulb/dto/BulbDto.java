package com.xworkz.bulb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Bulb")
@NamedQuery(name="findByBrandName",query="SELECT dto FROM BulbDto dto where dto.brandName=:find")

public class BulbDto {

	@Id
	private int id;
	private String brandName;
	private int watts;
	private String color;
	private String type;
	
	public BulbDto() {
		super();
	}

	public BulbDto(int id, String brandName, int watts, String color, String type) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.watts = watts;
		this.color = color;
		this.type = type;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getWatts() {
		return watts;
	}

	public void setWatts(int watts) {
		this.watts = watts;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BulbDto [id=" + id + ", brandName=" + brandName + ", watts=" + watts + ", color=" + color + ", type="
				+ type + "]";
	}

	
	
	
	
}
