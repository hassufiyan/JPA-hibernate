package com.xwrokz.buscuit.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name="buscuit")
public class BuscuitDto {
	
	
	@Id
	private int id;
	private String name;
	private int price;
	private String type;
	private int noOfBuscuits;
	private String shape;
	
	public BuscuitDto() {
		System.out.println("Default constructor");
	}
	
	
	
	public BuscuitDto(int id, String name, int price, String type, int noOfBuscuits, String shape) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.noOfBuscuits = noOfBuscuits;
		this.shape = shape;
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
	public int getNoOfBuscuits() {
		return noOfBuscuits;
	}
	public void setNoOfBuscuits(int noOfBuscuits) {
		this.noOfBuscuits = noOfBuscuits;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "BuscuitDto [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", noOfBuscuits="
				+ noOfBuscuits + ", shape=" + shape + "]";
	}

	
	
	
	
	
	
	
	
	
}
