package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;

public interface BulbService {
	
	public BulbDto create(BulbDto dto);
	
	public List<BulbDto> readAll();
	
	public BulbDto findById(int id);
	
	public BulbDto findByBrandName(String name);
	

}
