package com.spring.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.hibernate.model.Video;

@Repository
public class VideoDAOImpl implements VideoDAO{
	
	@Autowired
	private EntityManager entityManager; 

	@Override
	public List<Video> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Video> query = currentSession.createQuery("From Video", Video.class);
		query.getResultList();
		List<Video> list = query.getResultList();
		return list; 
	}

	@Override
	public Video get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Video video) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
