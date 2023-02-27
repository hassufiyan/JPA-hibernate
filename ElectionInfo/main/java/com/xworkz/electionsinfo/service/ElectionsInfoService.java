package com.xworkz.electionsinfo.service;

import java.util.List;

import com.xworkz.electionsinfo.dto.ElectionsInfoDto;

public interface ElectionsInfoService {

	public boolean save(ElectionsInfoDto dto);
	
	public List<ElectionsInfoDto> readAll();
} 
