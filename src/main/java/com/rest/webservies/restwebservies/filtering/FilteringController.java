package com.rest.webservies.restwebservies.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public FtBean filtering() {
		return new FtBean("Calorie", "Fat", "Calcium");
	}
	
	@GetMapping("/filtering-list")
	public List<FtBean> filteringList() {
		return Arrays.asList(new FtBean("Calorie", "Fat", "Calcium"), 
				new FtBean("Calorie2", "Fat2", "Calcium2"));
	}

}
