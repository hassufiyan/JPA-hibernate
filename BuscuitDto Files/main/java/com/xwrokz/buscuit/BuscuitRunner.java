package com.xwrokz.buscuit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xwrokz.buscuit.dto.BuscuitDto;

public class BuscuitRunner {

	public static void main(String[] args) {

		
		EntityManagerFactory entityManager=Persistence.createEntityManagerFactory("databaseProperties");
		
		EntityManager entity=entityManager.createEntityManager();
		
		entity.getTransaction().begin();
	
		BuscuitDto dto=new BuscuitDto(1, "Britannia", 12, "Sweet", 10, "Round");
		BuscuitDto dto1=new BuscuitDto(2, "Milk Bikis", 14, "Milk", 10, "Square");
		BuscuitDto dto2=new BuscuitDto(3, "Sunfeast", 13, "Sweet", 8, "Square");
		BuscuitDto dto3=new BuscuitDto(4, "Sweet and salt", 35, "Sweet an salt", 20, "Round");
		BuscuitDto dto4=new BuscuitDto(5, "Cocunut", 30, "Sweet", 12, "Round");
		BuscuitDto dto5=new BuscuitDto(6, "Rusk", 50, "Sweet", 10, "elongated");
		BuscuitDto dto6=new BuscuitDto(7, "Jim Jam", 18, "Sweet jam", 10, "Round");									
		BuscuitDto dto7=new BuscuitDto(8, "Moms Magic", 10, "Sweet", 10, "Round");				
		BuscuitDto dto8=new BuscuitDto(9, "Tiger", 10, "Sweet", 10, "Rectangle");									
		BuscuitDto dto9=new BuscuitDto(10, "Bounce", 10, "Cream", 10, "Round");	
	
		
entity.persist(dto);
entity.persist(dto1);
entity.persist(dto2);
entity.persist(dto3);
entity.persist(dto4);
entity.persist(dto5);
entity.persist(dto6);
entity.persist(dto7);
entity.persist(dto8);
entity.persist(dto9);


//BuscuitDto data=entity.find(BuscuitDto.class, 3);
//System.out.println(data);
//
//BuscuitDto data1=entity.find(BuscuitDto.class, 4);
//System.out.println(data1);

//dto.setName("Orio");
//dto1.setPrice(29);
//dto2.setName("ITC");
//BuscuitDto d1=entity.merge(dto);
//		System.out.println(d1);
	
//	entity.remove(dto1);
	entity.remove(dto8);
	
entity.getTransaction().commit();
entity.close();



	}

}
