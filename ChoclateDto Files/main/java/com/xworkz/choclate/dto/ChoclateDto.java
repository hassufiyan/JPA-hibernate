package com.xworkz.choclate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="choclate")
@NamedQuery(name="findByColorAndWeight",query="Select dto from ChoclateDto dto where dto.color=:clr and dto.weight=:wt")
@NamedQuery(name="findByPriceAndName",query="Select dto from ChoclateDto dto where dto.price=:pr and dto.name=:nm")
@NamedQuery(name="updateNameByIdAndWeight",query="Update ChoclateDto dto set name=:nm where dto.id=:id and dto.weight=:wt")
@NamedQuery(name="updateWeightByNameAndColor",query="Update ChoclateDto dto set weight=:wt where dto.name=:nm and dto.color=:clr")
@NamedQuery(name="deleteByNameAndColor",query="Delete From ChoclateDto dto where dto.name=:nm and color=:clr")
@NamedQuery(name="readAll",query="Select dto from ChoclateDto dto")
public class ChoclateDto {
	
	@Id
	private int id;
	private String name;
	private String color;
	private int price;
	private double weight;
	public ChoclateDto() {
		super();
	System.out.println("default constructor");
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public ChoclateDto(int id, String name, String color, int price, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "ChoclateDto [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", weight="
				+ weight + "]";
	}
	
	

}
