package com.xworkz.electionsinfo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.electionsinfo.dto.ElectionsInfoDto;

public class ElectionsInfoRepoImpl implements ElectionsInfoRepo {

	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("ElectionsInfo-Records");
	private EntityManager em=emf.createEntityManager();
	
	@Override
	public boolean save(ElectionsInfoDto dto) {
		if(em!=null) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return true;
	}
return false;
}

	@Override
	public List<ElectionsInfoDto> readAll() {
		if(em!=null) {
			em.getTransaction().begin();
		Query query=em.createNamedQuery("readAll",ElectionsInfoDto.class);
	List<ElectionsInfoDto>	list=query.getResultList();
		return list;
		}
		return null;
	}
	
}
