package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.repo.BulbRepo;
import com.xworkz.bulb.repo.BulbRepoImpl;

public class BulbServiceImpl implements BulbService {

	private BulbRepo repo=new BulbRepoImpl();
	
	public BulbDto create(BulbDto dto) {
		if(dto!=null) {
			if(dto.getId()>0) {
				System.out.println("Id is valid");
				return repo.create(dto);
			}
			System.out.println("Id is not valid");
		}
		return null;
	}

	public List<BulbDto> readAll() {
		return	repo.readAll();
	}

	public BulbDto findById(int id) {
if(id>0) {
	System.out.println("id is valid");
	return repo.findById(id);
}
else {
System.out.println("id is not valid");
}
return null;
	}

	public BulbDto findByBrandName(String name) {
		if(name.length()>=2) {
			return repo.findByBrandName(name);
		}
		System.out.println("name is not vlaid");
		return null;
	}

}
