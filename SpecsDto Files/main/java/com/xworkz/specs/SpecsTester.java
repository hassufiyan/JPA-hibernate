package com.xworkz.specs;

import java.util.List;

import com.xworkz.specs.dto.SpecsDto;
import com.xworkz.specs.service.SpecsService;
import com.xworkz.specs.service.SpecsServiceImpl;

public class SpecsTester {

	public static void main(String[] args) {

		SpecsService service=new SpecsServiceImpl();
		
		SpecsDto dto=new SpecsDto(1, "Crizal", "Blue", "Rectangular", 5890);
		SpecsDto dto1=new SpecsDto(2, "J&J", "White", "Rectangular", 1999);
		SpecsDto dto2=new SpecsDto(3, "RayBen", "Black", "Circular", 9999);
		SpecsDto dto3=new SpecsDto(4, "Vincent and chase", "Red", "Rounded", 3423);
		SpecsDto dto4=new SpecsDto(5, "imax", "Green Stripes", "Rectangular", 2898);
		SpecsDto dto5=new SpecsDto(6, "David Chase", "Yellow", "Round", 7654);

		
//		service.create(dto);
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto5);
		
		
//	SpecsDto data=service.findById(2);
//		System.out.println(data);
		
//	List<SpecsDto>	list=service.readAll();
//	for(SpecsDto data:list) {
//		System.out.println(data);
	
//SpecsDto	data=service.findByShapeAndPrice("Round", 7654);
//	System.out.println(data);
		
//	boolean	status=service.updatePriceByName(2589,"imax");
//	System.out.println(status);
		
//	boolean	status=service.updateColorByShapeAndprice("olive green", "Round", 7654);
//	System.out.println(status);
		
//	boolean	status=service.deleteByPriceAndColor(3423,"Red");
//	System.out.println(status);
		
	boolean	status=service.deleteByNameAndId("David Chase",6);
		System.out.println(status);
	}
		
	}


