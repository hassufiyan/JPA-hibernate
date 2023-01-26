package com.xworkz.carrom;

import java.util.List;

import com.xworkz.carrom.dto.CarromDto;
import com.xworkz.carrom.service.CarromService;
import com.xworkz.carrom.service.CarromServiceImpl;

public class CarromTester {

	public static void main(String[] args) {

		CarromService service=new CarromServiceImpl();
		
		CarromDto dto=new CarromDto(1, "Rocket", 18, "pink", 2, "Game");
		CarromDto dto1=new CarromDto(2, "Slayer", 10, "blue", 3, "Papar");
		CarromDto dto2=new CarromDto(3, "V-board", 18, "brown", 4, "Game");
		CarromDto dto3=new CarromDto(4, "boat", 14, "Red", 2, "Game_long");
		CarromDto dto4=new CarromDto(5, "Popular", 18, "White", 4, "Game");
		
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
		
//	CarromDto	data=service.findById(2);
//System.out.println(data);
		
//	boolean	d1=service.updateBrandNameById("carromking", 4);
//	System.out.println(d1);
		
//		boolean data=service.deleteById(5);
//	System.out.println(data);
		
	List<CarromDto>	list=service.readAll();
	for(CarromDto data:list) {
		System.out.println(data);
	}
	}
	
	

}
