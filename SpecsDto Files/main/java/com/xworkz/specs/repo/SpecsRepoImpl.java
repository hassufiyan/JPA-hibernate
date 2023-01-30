package com.xworkz.specs.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.specs.dto.SpecsDto;

public class SpecsRepoImpl implements  SpecsRepo  {

	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("Specs-data");
	private EntityManager em=emf.createEntityManager();
	
	public SpecsDto create(SpecsDto dto) {
	if(em!=null) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return dto;
	}
		return null;
	}

	public SpecsDto findById(int id) {
		if(em!=null) {
			em.getTransaction().begin();
		SpecsDto	data=em.find(SpecsDto.class, id);
		return data;
	}
		return null;
	}

	public List<SpecsDto> readAll() {
		if(em!=null) {
			em.getTransaction().begin();
		TypedQuery<SpecsDto>	query=em.createNamedQuery("readAll", SpecsDto.class);
		List	list=query.getResultList();
		em.getTransaction().commit();
		return list;
		}
		return null;
	}

	public SpecsDto findByShapeAndPrice(String shape, int price) {
		if(em!=null) {
			em.getTransaction().begin();
		TypedQuery<SpecsDto>	query=em.createNamedQuery("findByShapeAndPrice", SpecsDto.class);
			query.setParameter("sh",shape );
			query.setParameter("pr", price);
			return query.getSingleResult();
		}
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
	if(em!=null) {
		em.getTransaction().begin();
	Query	query=em.createNamedQuery("updatePriceByName");
	query.setParameter("pr",price);
	query.setParameter("bnm", name);
	query.executeUpdate();
	em.getTransaction().commit();
	return true;
	}
	return false;
	}

	public boolean updateColorByShapeAndprice(String color,String shape, int price) {
		if(em!=null) {
			em.getTransaction().begin();
		Query	query=em.createNamedQuery("updateColorByShapeAndprice");
			query.setParameter("clr",color);
			query.setParameter("shp", shape);
			query.setParameter("prc", price);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if(em!=null) {
			em.getTransaction().begin();
		Query	query=em.createNamedQuery("deleteByPriceAndColor");
			query.setParameter("pr", price);
			query.setParameter("clr", color);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean deleteByNameAndId(String name, int id) {
		if(em!=null) {
			em.getTransaction().begin();
		Query	query=em.createNamedQuery("deleteByNameAndId");
		query.setParameter("brn", name);
		query.setParameter("id", id);
		query.executeUpdate();
		em.getTransaction().commit();
		return true;
		}
		
		return false;
	}

}
