package com.javatunes.catalog.persist;

import com.javatunes.catalog.ItemDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaItemDAO implements ItemDAO {
	
	
	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public MusicItem get(Long id) {
		return em.find(MusicItem.class,id);
	}

}
