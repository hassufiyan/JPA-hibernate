package com.xworkz.choclate.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.choclate.dto.ChoclateDto;

public class ChoclateRepoImpl implements ChoclateRepo {

	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("choclate-data");
	private EntityManager em=emf.createEntityManager();
	
	
	public ChoclateDto create(ChoclateDto dto) {
		if(em!=null) {		
		em.getTransaction().begin();
	em.persist(dto);
	em.getTransaction().commit();
		return dto;
		}
		return null;
	}

	public ChoclateDto findByColorAndWeight(String color, double weight) {
		if(em!=null) {		
			em.getTransaction().begin();
		TypedQuery<ChoclateDto>	query=em.createNamedQuery("findByColorAndWeight",ChoclateDto.class);
		 query.setParameter("clr", color);
		 query.setParameter("wt", weight);
		 return query.getSingleResult();		 
		}
		return null;
	}

	public ChoclateDto findByPriceAndName(int price, String name) {
		if(em!=null) {		
			em.getTransaction().begin();
		TypedQuery	query= em.createNamedQuery("findByPriceAndName",ChoclateDto.class);
		query.setParameter("pr", price);
		query.setParameter("nm", name);
		return (ChoclateDto) query.getSingleResult();
		}
		
		return null;
	}

	public boolean updateWeightByNameAndColor(double weight, String name, String color) {
		if(em!=null) {		
			em.getTransaction().begin();
		Query	query=em.createNamedQuery("updateWeightByNameAndColor");
		query.setParameter("wt",weight);
		query.setParameter("nm",name);
		query.setParameter("clr",color);
		query.executeUpdate();
		return true;
		}
		
		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, double weight) {
		if(em!=null) {		
			em.getTransaction().begin();
		Query	query=em.createNamedQuery("updateNameByIdAndWeight");
		query.setParameter("nm",name);
		query.setParameter("id",id);
		query.setParameter("wt",weight);
		query.executeUpdate();
		return true;
		}
		
		return false;
	}

	public boolean deleteByNameAndColor(String name, String color) {
		if(em!=null) {		
			em.getTransaction().begin();
		Query	query=em.createNamedQuery("deleteByNameAndColor");
		query.setParameter("nm",name);
		query.setParameter("clr",color);
		query.executeUpdate();
		return true;
		}
		return false;
	}

	public List<ChoclateDto> readAll() {
		if(em!=null) {		
			em.getTransaction().begin();
	TypedQuery<ChoclateDto>	query=em.createNamedQuery("readAll",ChoclateDto.class);
List	list=query.getResultList();
return list;
		}
return null;
	}

}
