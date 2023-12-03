package com.spring.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hibernate.model.Video;
import com.spring.hibernate.service.VideoService;

@RestController
@RequestMapping("/api")
public class VideoController {
	
	@Autowired
	private VideoService videoService;
	
	@RequestMapping("/video")
	public List<Video> get() {
		return videoService.get();
	}

}
