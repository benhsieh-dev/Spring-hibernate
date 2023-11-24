package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.model.Video;

public interface VideoDAO {
	
	List<Video> get();
	
	Video get(int id);
	
	void save(Video video);
	
	void delete(int id); 

}
