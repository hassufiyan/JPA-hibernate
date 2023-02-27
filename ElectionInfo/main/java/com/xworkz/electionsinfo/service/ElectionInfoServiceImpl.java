package com.xworkz.electionsinfo.service;

import java.util.List;

import com.xworkz.electionsinfo.dto.ElectionsInfoDto;
import com.xworkz.electionsinfo.repository.ElectionsInfoRepo;
import com.xworkz.electionsinfo.repository.ElectionsInfoRepoImpl;

public class ElectionInfoServiceImpl implements ElectionsInfoService {

	ElectionsInfoRepo repo=new ElectionsInfoRepoImpl();
	
	@Override
	public boolean save(ElectionsInfoDto dto) {
	if(dto.getName().length()>=4 && dto.getAge().length()>=2) {
		System.out.println("Valid name and age");
		return repo.save(dto);
	}
		System.out.println("Credentials are not valid");
		return false;
	}

	@Override
	public List<ElectionsInfoDto> readAll() {
		return repo.readAll();
	}

}
