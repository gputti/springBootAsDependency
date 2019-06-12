
package com.testapp.test2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.test2.model.Test2Obj;
import com.testapp.test2.service.Test2ServiceImpl;


/**
 * @author Gopikrishna Putti
 * Apr 2, 2019
 *
 *
 */

@RestController
@RequestMapping("/api/test2")
public class TestController2 {

	@Autowired
	private Test2ServiceImpl test2service;

	int cntr = 0;
	@GetMapping("/")
	public String test() {		
		return "TestApp-2 , calling '/api/test2' service. call counter : " + cntr++ ;
	}

	@GetMapping("/obj/{id}")
	public String getObj(@PathVariable(name = "id") Long id) {
		Test2Obj sc = test2service.getObj(id);
		if(sc  == null ) {
			return "test2 - yeye still.... success. finally got from db - " + id; 
		} else {
			return "test2 - yeye.... success. finally got from db - " + sc.toString();
		}
	}
	
	@GetMapping("/save/obj")
	public String saveObj( ) {
		
		Test2Obj sc = Test2Obj.getMeAnObj();
		sc = test2service.saveObj(sc)  ;
		return sc.toString();
	}


}
