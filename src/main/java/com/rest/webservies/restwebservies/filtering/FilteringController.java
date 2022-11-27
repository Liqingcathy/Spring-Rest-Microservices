package com.rest.webservies.restwebservies.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		FtBean ftBean = new FtBean("value1", "value2", "value3");
		
		//A simple holder for the POJO to serialize
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(ftBean);
		
		//Simple {@link PropertyFilter} implementation that only uses property name
		//to determine whether to serialize property as is, or to filter it out.
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
		
		//FilterProvider: Interface for objects that providers instances of {@link PropertyFilter}
		//that match given ids.
		//SimpleFilterProvider: Simple {@link FilterProvider} implementation that just stores
		//direct id-to-filter mapping.
		FilterProvider filters = new SimpleFilterProvider().addFilter("FtBeanFilter", filter);
		
		mappingJacksonValue.setFilters(filters);
		
		return mappingJacksonValue;
	}
	
	@GetMapping("/filtering-list")
	public List<FtBean> filteringList() {
		return Arrays.asList(new FtBean("Calorie", "Fat", "Calcium"), 
				new FtBean("Calorie2", "Fat2", "Calcium2"));
	}

}
