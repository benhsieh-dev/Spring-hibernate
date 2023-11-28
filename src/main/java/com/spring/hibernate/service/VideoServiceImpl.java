package com.spring.hibernate.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.model.Video;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Transactional
	@Override
	public List<Video> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Video get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void save(Video video) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
