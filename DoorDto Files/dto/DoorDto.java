package com.xworkz.door.dto;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="door")
public class DoorDto {
	@Id
	private int id;
	private String type;
	private int price;
	private String color;
	private int size;
	public int getId() {
		return id;
	}
	
	public DoorDto(int id, String type, int price, String color, int size) {
		super();
		this.id = id;
		this.type = type;
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "DoorDto [id=" + id + ", type=" + type + ", price=" + price + ", color=" + color + ", size=" + size
				+ "]";
	}

}
	
	
	
	


