package com.xworkz.specs.service;

import java.util.List;

import com.xworkz.specs.dto.SpecsDto;
import com.xworkz.specs.repo.SpecsRepo;
import com.xworkz.specs.repo.SpecsRepoImpl;

public class SpecsServiceImpl implements  SpecsService {

	SpecsRepo repo=new SpecsRepoImpl();
	
	
	public SpecsDto create(SpecsDto dto) {
		if(dto!=null && dto.getId()>0) {
			System.out.println("id is valid");
			return repo.create(dto);	
		}
		System.out.println("id is not valid");
		return null;
	}

	public SpecsDto findById(int id) {
if(id>0) {
	System.out.println("id is valid");
	return repo.findById(id);
}
System.out.println("id is not valid");
		return null;
	}

	public List<SpecsDto> readAll() {
return repo.readAll();
	}

	public SpecsDto findByShapeAndPrice(String shape, int price) {
if(shape!=null && price>1500) {
	System.out.println("entered shape and price is valid");
	return repo.findByShapeAndPrice(shape,price);
}
System.out.println("entered shape and price is not valid");
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
if(price>1500 && name!=null && price<=10000 && name.length()>=2) {
	System.out.println("valid name and price");
	return repo.updatePriceByName(price,name);
}
System.out.println("entered data doesnot match");
		return false;
	}

	public boolean updateColorByShapeAndprice(String color,String shape, int price) {
if(shape!=null && color!=null) {
	if( price>1500 && price<=10000) {
	System.out.println("entered data is valid");
	return repo.updateColorByShapeAndprice(color,shape,price);
}
System.out.println("entered data is not valid");
		
}
return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
if(price>1500 && price <=10000) {
	if(color!=null) {
		System.out.println("price is in range");
		return repo.deleteByPriceAndColor(price,color);
	}
	System.out.println("Entered Price is not in range");
}
		return false;
	}

	public boolean deleteByNameAndId(String name, int id) {
		if(name!=null && name.length()>=2) {
			if(id>0) {
				System.out.println("valid name and id");
			return repo.deleteByNameAndId(name,id);
			}
			System.out.println("invalid name and id");
		}
		return false;
	}
 
}
