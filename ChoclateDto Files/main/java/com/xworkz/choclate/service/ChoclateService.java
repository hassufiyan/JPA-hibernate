package com.xworkz.choclate.service;

import java.util.List;

import com.xworkz.choclate.dto.ChoclateDto;

public interface ChoclateService {

public ChoclateDto	create(ChoclateDto dto);

public List<ChoclateDto> readAll();

public ChoclateDto findByColorAndWeight(String color,double weight);

public ChoclateDto findByPriceAndName(int price,String name);

public boolean updateWeightByNameAndColor(double weight,String name,String color);

public boolean updateNameByIdAndWeight(String name,int id,double weight);

public boolean deleteByNameAndColor(String name,String color);




	
	
	
	
	
	
	
}
