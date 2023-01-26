package com.xworkz.cap.service;

import java.util.List;

import com.xworkz.cap.dto.CapDto;
import com.xworkz.cap.repo.CapRepo;
import com.xworkz.cap.repo.CapRepoImpl;

public class CapServiceImpl implements CapService {

	
private CapRepo repo=new CapRepoImpl();	
	
	
	public CapDto save(CapDto dto) {
		if(dto!=null) {
		if(dto.getId()>0) {
	System.out.println("id is valid");
	return repo.save(dto);
		}
		System.out.println("id is not valid");
		}
		return null;
	}

	public CapDto findById(int id) {
if(id>0) {
System.out.println("id is valid");

}else {
System.out.println("id is not valid");
	}
return repo.findById(id);
}
	

	public List<CapDto> readAll() {

		return repo.readAll();
	}

	public boolean updateBrandNameById(String name, int id) {
if(name.length()>=3) {
	if(id>0) {
		System.out.println("id is valid");
		return repo.updateBrandNameById(name,id);
	}
	System.out.println("Id is not valid");
}
		return false;
	}

	public boolean deleteById(int id) {
if(id>0) {
	return repo.deleteById(id);
	
}
System.out.println("id is not valid");
		return false;
	}

}
