package com.xworkz.choclate;

import java.util.List;

import com.xworkz.choclate.dto.ChoclateDto;
import com.xworkz.choclate.service.ChoclateService;
import com.xworkz.choclate.service.ChoclateServiceImpl;

public class ChoclateTester {

	private static ChoclateService choclateService;

	public static void main(String[] args) {

		ChoclateService service=new ChoclateServiceImpl();

		ChoclateDto dto=new ChoclateDto(1, "Cadbury Dairy Milk", "Brwon",390, 125.34);
		ChoclateDto dto1=new ChoclateDto(2, "Candyman", "yellow",350, 230.45);
		ChoclateDto dto2=new ChoclateDto(3, "5 Star", "Brown",378, 196.34);
		ChoclateDto dto3=new ChoclateDto(4, " nestley Munch", "Brwon",456, 178.34);
		ChoclateDto dto4=new ChoclateDto(5, "Sneakers", "Black",456, 176.34);
		ChoclateDto dto5=new ChoclateDto(6, "Milki Bites", "White",600, 456.87);
		
		
//		service.create(dto);
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto5);
		
//		ChoclateDto data= service.findByColorAndWeight("Brwon", 178.34);
//		System.out.println(data);
		
//	ChoclateDto	data=service.findByPriceAndName(600, "Milki Bites");
//		System.out.println(data);
		
//	boolean	status=service.updateNameByIdAndWeight("Blue Hearts", 6, 456.87);
//	System.out.println(status);
		
//	boolean status=service.updateWeightByNameAndColor(165.65, "Sneakers","Black");
//	System.out.println(status);
		
//	boolean	status=service.deleteByNameAndColor(" nestley Munch","Brwon");
//	System.out.println(status);
		
	List<ChoclateDto>	list=service.readAll();
for(ChoclateDto data:list) {
	System.out.println(data);
}
	
	}
	
	

}
