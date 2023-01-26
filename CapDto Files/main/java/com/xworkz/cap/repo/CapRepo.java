package com.xworkz.cap.repo;

import java.util.List;

import com.xworkz.cap.dto.CapDto;

public interface CapRepo {

	public CapDto save(CapDto dto);
	
	public CapDto findById(int id);
	
	public List<CapDto> readAll();
	
	public boolean updateBrandNameById(String name,int id);
	
	public boolean deleteById(int id);

}
