package com.xworkz.cap;



import java.util.List;

import com.xworkz.cap.dto.CapDto;
import com.xworkz.cap.service.CapService;
import com.xworkz.cap.service.CapServiceImpl;

public class CapTester {

	public static void main(String[] args) {
			
		CapService service=new CapServiceImpl();
		CapDto dto=new CapDto(1, "Nike", "Blue", 350, "Half-Round");
		CapDto dto1=new CapDto(2, "Puma", "White", 450, "Half-Round");
		CapDto dto2=new CapDto(3, "US Polo", "red", 650, "Half");
		CapDto dto3=new CapDto(4, "Addidas", "Black", 850, "Half-Round");
		CapDto dto4=new CapDto(5, "Roadster", "Grey", 250, "Full");
		
//	service.save(dto);
//	service.save(dto1);
//	service.save(dto2);
//	service.save(dto3);
//	service.save(dto4);
		
//CapDto data=service.findById(5);	

//		CapDto data1=service.findById(3);
//		System.out.println(data);
//		System.out.println(data1);
		
//	boolean	data=service.updateBrandNameById("Slayer", 2);
//	System.out.println(data);
	
	
//boolean	d1=service.deleteById(4);
//	System.out.println(d1);
		
		List<CapDto>	data=service.readAll();
	for(CapDto d1:data) {
		System.out.println(d1);
	}
	
	
	}
	
	

}
