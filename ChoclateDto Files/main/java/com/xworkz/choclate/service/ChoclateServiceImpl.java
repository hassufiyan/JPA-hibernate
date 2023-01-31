package com.xworkz.choclate.service;



import java.util.List;

import com.xworkz.choclate.dto.ChoclateDto;
import com.xworkz.choclate.repo.ChoclateRepo;
import com.xworkz.choclate.repo.ChoclateRepoImpl;

public class ChoclateServiceImpl implements ChoclateService {

	ChoclateRepo repo=new ChoclateRepoImpl();
	
	
	
	public ChoclateDto create(ChoclateDto dto) {
if(dto!=null) {
	if(dto.getId()>0) {
		System.out.println("id is valid");
		return repo.create(dto);
	}
	System.out.println(("id is not valid"));
	
}
		return null;
	}
	
	public List<ChoclateDto> readAll() {
     return repo.readAll();
		
	}

	public ChoclateDto findByColorAndWeight(String color, double weight) {
if(color!=null && weight>=100) {
	System.out.println("color and weight is valid");
	return repo.findByColorAndWeight(color, weight);
}
System.out.println("invalid content for chioclate");
		return null;
	}

	public ChoclateDto findByPriceAndName(int price, String name) {
if(price>=250 && name.length()>=3 && name!=null) {
	System.out.println("name and price is validated");
	return repo.findByPriceAndName(price, name);
}
System.out.println("price and name is not found");
		return null;
	}

	public boolean updateWeightByNameAndColor(double weight, String name, String color) {
if(weight>=100 && name!=null && color!=null && name.length()>=3) {
	System.out.println("validated");
	return repo.updateWeightByNameAndColor(weight, name, color);
}
System.out.println("entred data is not valid");
		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, double weight) {
		if(name!=null && name.length()>=3 && id>0 && weight>=100) {
			System.out.println("Data has been validated");
			return repo.updateNameByIdAndWeight(name, id, weight);
		}
		System.out.println("data is not validated");
		return false;
	}

	public boolean deleteByNameAndColor(String name, String color) {
if(name!=null && color!=null && name.length()>=3) {
	System.out.println("data is validtaed");
	return repo.deleteByNameAndColor(name, color);

}
System.out.println("entered data is not valid");
		return false;
	}






	
}
