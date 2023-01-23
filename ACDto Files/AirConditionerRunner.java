package com.xworkz.airconditioner;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.airconditioner.configuration.AirConditionerConfig;
import com.xworkz.airconditioner.dto.AirConditionerDto;

public class AirConditionerRunner {
	public static void main(String[] args) {
		
		
		AirConditionerDto dto=new AirConditionerDto(1, "LG", 30000, "white", 4);
		AirConditionerDto dto1=new AirConditionerDto(2, "Whirlpool", 24000, "Red", 3);
		AirConditionerDto dto2=new AirConditionerDto(3, "Samsung", 34000, "white", 2);
		AirConditionerDto dto3=new AirConditionerDto(4, "IFB", 10000, "Black", 3);
		AirConditionerDto dto4=new AirConditionerDto(5, "Sony", 37000, "white", 5);
		
		Session session=AirConditionerConfig.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(dto);
		session.save(dto1);
		session.save(dto2);
		session.save(dto3);
		session.save(dto4);
	
		
		
	AirConditionerDto	data1=session.get(AirConditionerDto.class,2);
		System.out.println(data1);
		
	Criteria data=session.createCriteria(AirConditionerDto.class);
	
List<AirConditionerDto>	list=data.list();
for(AirConditionerDto listData:list) {
	System.out.println(listData);
}
	
		transaction.commit();
		session.close();
		
		
		
		
		
		
		
	}

}
