package com.xworkz.bulb;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.service.BulbService;
import com.xworkz.bulb.service.BulbServiceImpl;

public class BulbTester {

	public static void main(String[] args) {
		
		BulbService service=new BulbServiceImpl();
		
		BulbDto dto=new BulbDto(1, "Havells",10, "White", "led bulb");
		BulbDto dto1=new BulbDto(2, "LG",20, "Yellow", "Fluorescent light bulbs");
		BulbDto dto2=new BulbDto(3, "Thompson",50, "Blue", "Compact fluorescent bulbs");
		BulbDto dto3=new BulbDto(4, "Bright",100, "Green", "Incandescent light bulbs");
		BulbDto dto4=new BulbDto(5, "Surya",150, "Red", "Halogen incandescent light bulbs");
	
		
//		service.create(dto);
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
		
//	BulbDto	data=service.findById(2);
//		System.out.println(data);
		
//	BulbDto	data=service.findByBrandName("LG");
//	System.out.println(data);

List<BulbDto>	data=service.readAll();
for(BulbDto list:data) {
	System.out.println(list);
}
		
	}

}
