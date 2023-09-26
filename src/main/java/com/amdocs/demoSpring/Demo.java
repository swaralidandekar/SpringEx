package com.amdocs.demoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Demo {
	

	
		@GetMapping("/get")
	public String show() {
	
	return "Name- Swarali Dandekar "
			+ "Add-Panvel "+
			"Phone-9988776656";
	}
		

	}


