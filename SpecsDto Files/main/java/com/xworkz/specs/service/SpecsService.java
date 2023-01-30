package com.xworkz.specs.service;

import java.util.List;

import com.xworkz.specs.dto.SpecsDto;

public interface SpecsService {
	
	public SpecsDto create(SpecsDto dto);
	
	public SpecsDto findById(int id);
	
	public List<SpecsDto> readAll();
	
	public SpecsDto findByShapeAndPrice(String shape,int price);
	
	public boolean updatePriceByName(int price,String name);
	
	public boolean updateColorByShapeAndprice(String color,String shape,int price);
	
	public boolean deleteByPriceAndColor(int price,String color);
	
	public boolean deleteByNameAndId(String name,int id);
	
	

}
