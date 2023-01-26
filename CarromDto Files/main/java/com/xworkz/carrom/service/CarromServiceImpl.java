package com.xworkz.carrom.service;

import java.util.List;

import com.xworkz.carrom.dto.CarromDto;
import com.xworkz.carrom.repo.CarromRepo;
import com.xworkz.carrom.repo.CarromRepoImpl;

public class CarromServiceImpl implements CarromService {

	private CarromRepo repo=new CarromRepoImpl();
	
	public CarromDto save(CarromDto dto) {
		if(dto!=null){
			if(dto.getId()>0) {
				System.out.println("Id is valid");
			return	repo.save(dto);
			}
			System.out.println("Id is not valid");
		}
		
		return null;
	}

	public CarromDto findById(int id) {
if(id>0) {
	System.out.println("id is valid");
return repo.findById(id);
}
else {
	System.out.println("id is not valid");
}
		return null;
	}

	public List<CarromDto> readAll() {
return repo.readAll();
	}

	public boolean updateBrandNameById(String name, int id) {
if(name.length()>=2) {
	if(id>0) {
		return repo.updateBrandNameById(name, id);
	}
	System.out.println("id is not valid");
}
		return false;
	}

	public boolean deleteById(int id) {
if(id>0) {
	System.out.println("id is valid");
	return repo.deleteById(id);
}
System.out.println("is is not valid");
		return false;
	}

}
