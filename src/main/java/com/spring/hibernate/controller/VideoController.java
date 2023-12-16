package com.spring.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hibernate.model.Video;
import com.spring.hibernate.service.VideoService;

@RestController
@RequestMapping("/api")
public class VideoController {
	
	@Autowired
	private VideoService videoService;
	
	@GetMapping("/video")
	public List<Video> get() {
		return videoService.get();
	}

	@PostMapping("/video")
	public Video save(@RequestBody Video videoObj) {
		videoService.save(videoObj); 
		return videoObj; 
	}
	
	@GetMapping("/video/{id}")
	public Video get(@PathVariable int id) {
		return videoService.get(id);
	}
	
	@DeleteMapping("/video/{id}")
	public String delete(@PathVariable int id) {
		videoService.delete(id);
		return "Video has been deleted with id: " + id;
	}
	
}
