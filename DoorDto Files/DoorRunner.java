package com.xworkz.door;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.door.configuration.DoorConfiguration;
import com.xworkz.door.dto.DoorDto;

public class DoorRunner {

	public static void main(String[] args) {

		DoorDto dto = new DoorDto(1, "PVC", 12000, "Brown", 21);
		DoorDto dto1 = new DoorDto(2, "Wooden", 14000, "Brown", 23);
		DoorDto dto2 = new DoorDto(3, "Wooden", 16000, "White", 25);
		Session session = DoorConfiguration.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

		session.save(dto);
		session.save(dto1);
		session.save(dto2);

		Criteria criteria = session.createCriteria(DoorDto.class);

		List<DoorDto> data = criteria.list();
		for (DoorDto door : data) {
			System.out.println(door);
		}

		 DoorDto d1=session.get(DoorDto.class,2);
		 System.out.println(d1);
		transaction.commit();
		session.close();

	}

}
