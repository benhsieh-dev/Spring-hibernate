package com.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.dao.VideoDAO;
import com.spring.hibernate.model.Video;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Autowired
	private VideoDAO videoDAO;
	
	@Transactional
	@Override
	public List<Video> get() {
		return videoDAO.get();
	}

	@Transactional
	@Override
	public Video get(int id) {
		return videoDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Video video) {
		videoDAO.save(video);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
