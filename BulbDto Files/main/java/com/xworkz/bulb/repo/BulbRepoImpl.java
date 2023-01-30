package com.xworkz.bulb.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.bulb.dto.BulbDto;

public class BulbRepoImpl implements BulbRepo {

	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("Bulb-data");
	private EntityManager em=emf.createEntityManager();
	
	
	public BulbDto create(BulbDto dto) {
		if(em!=null) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
			return dto;
	}
		return null;
	}

	public List<BulbDto> readAll() {
		if(em!=null) {
			em.getTransaction().begin();
		TypedQuery<BulbDto>	query=em.createQuery("SELECT dto from BulbDto dto", BulbDto.class);
		List	list=query.getResultList();
		em.getTransaction().commit();
		return list;
	}
		return null;
	}

	public BulbDto findById(int id) {
		if(em!=null) {
			em.getTransaction().begin();
		BulbDto	data=em.find(BulbDto.class,id);
		em.getTransaction().commit();
		return data;
	}
		return null;
	}

	public BulbDto findByBrandName(String name) {
		if(em!=null) {
			em.getTransaction().begin();
	Query query=em.createNamedQuery("findByBrandName",BulbDto.class );
	query.setParameter("find", name);
	em.getTransaction().commit();
			return (BulbDto) query.getSingleResult();
		
	}
		System.out.println("reached here");
return null;
}
}
