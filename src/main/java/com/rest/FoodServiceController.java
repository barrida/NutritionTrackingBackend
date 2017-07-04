package com.rest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Food;
import com.repository.IFoodRepository;

/**
 * 
 * RESTFull service that returns
 * 
 * @author suleyman.yildirim
 *
 */
@RestController
@RequestMapping(path = "/foods")
public class FoodServiceController {

	@Autowired
	private IFoodRepository foodRepository;

	/**
	 * Finds foods by name
	 * 
	 * GET: /foods?search={name} (e.g.: http://localhost:8080/foods?name=Oats)
	 * 
	 * @param origin
	 * @return a list of foods that matches the <code>name</code>
	 */
	@RequestMapping(method = RequestMethod.GET, params = { "search" }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Food>> getFoodByName(@RequestParam(value = "search", required = true) String name) {
		List<Food> foodByName = foodRepository.findByName(name);
		return new ResponseEntity<>(foodByName, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, params = {"macros"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Food>> getMacros(@RequestParam(value = "macros", required = true) String name){
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
