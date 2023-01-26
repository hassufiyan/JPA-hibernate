package com.xworkz.carrom.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carrom")

public class CarromDto {

	@Id
	private int id;
	private String bandName;
	private int noOfCoins;
	private String color;
	private int noOfPlayers;
	private String gameType;
	public CarromDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarromDto(int id, String bandName, int noOfCoins, String color, int noOfPlayers, String gameType) {
		super();
		this.id = id;
		this.bandName = bandName;
		this.noOfCoins = noOfCoins;
		this.color = color;
		this.noOfPlayers = noOfPlayers;
		this.gameType = gameType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBandName() {
		return bandName;
	}
	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	public int getNoOfCoins() {
		return noOfCoins;
	}
	public void setNoOfCoins(int noOfCoins) {
		this.noOfCoins = noOfCoins;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	@Override
	public String toString() {
		return "CarromDto [id=" + id + ", bandName=" + bandName + ", noOfCoins=" + noOfCoins + ", color=" + color
				+ ", noOfPlayers=" + noOfPlayers + ", gameType=" + gameType + "]";
	}
	
}
