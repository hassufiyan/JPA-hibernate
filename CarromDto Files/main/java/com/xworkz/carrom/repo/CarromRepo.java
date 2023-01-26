package com.xworkz.carrom.repo;

import java.util.List;

import com.xworkz.carrom.dto.CarromDto;

public interface CarromRepo {

	CarromDto save(CarromDto dto);
	

	public CarromDto findById(int id);
	
	public List<CarromDto> readAll();
	
	public boolean updateBrandNameById(String name,int id);
	
	public boolean deleteById(int id);

}
