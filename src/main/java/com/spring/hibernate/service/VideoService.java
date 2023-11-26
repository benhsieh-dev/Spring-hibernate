package com.spring.hibernate.service;

import java.util.List;

import com.spring.hibernate.model.Video;

public interface VideoService {
	
	List<Video> get();
	
	Video get(int id);
	
	void save(Video video);
	
	void delete(int id); 

}
