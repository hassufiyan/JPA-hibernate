package com.xworkz.bulb.repo;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;

public interface BulbRepo {
	
	
	public BulbDto create(BulbDto dto);
	
	public List<BulbDto> readAll();
	
	public BulbDto findById(int id);
	
	public BulbDto findByBrandName(String name);

}
