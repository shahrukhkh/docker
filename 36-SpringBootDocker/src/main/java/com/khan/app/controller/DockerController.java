package com.khan.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DockerController {

	
	
	@GetMapping("/")
	public String getDockerRes()
	{
		return "docker";
	}
}
