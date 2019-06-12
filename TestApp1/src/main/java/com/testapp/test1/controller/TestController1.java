
package com.testapp.test1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.test1.model.Test1Obj;
import com.testapp.test1.repository.Test1Repository;


@RestController
@RequestMapping("/api")
public class TestController1 {

	@Autowired
	Test1Repository test1Repository;

	int cntr = 0;	
	@GetMapping("/test1")
	public String test1( ) {		
		return "TestApp-1 , calling '/api/test1/' service. call counter : " + cntr++  + "<BR>\n";
	}

	@GetMapping("/test1/{firstname}")
	public String test11( @PathVariable(name = "firstname") String firstname ) {		
		return firstname + " - TestApp-1 , calling '/api/test1/' service. call counter : " + cntr++  + "<BR>\n";
	}


	@GetMapping("/test2/{firstname}")
	public String test21(@PathVariable(name= "firstname") String firstname ) {		
		return firstname + " - TestApp-1 , calling '/api/test2/' service. call counter : " + cntr++  + "<BR>\n";
	}

	@GetMapping("/test2")
	public String test2( ) {		
		return " - TestApp-1 , calling '/api/test2/' service. call counter : " + cntr++  + "<BR>\n";
	}


	@GetMapping("/obj/{id}")
	public String getscene( @PathVariable(name = "id") Long id ) {
		try {
			Optional<Test1Obj> optEmp = test1Repository.findById(id);
			if(optEmp != null && optEmp.isPresent() ) return optEmp.get().toString();
			else return "no object found.";			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "test1controller  - can't be ehre";

	}
	
	@GetMapping("/notusing")
	public String unusedmethod(  ) {
		return "test1controller  - can't be here";

	}

	@GetMapping("/save/obj")
	public String saveobj(  ) {
		try {
			Test1Obj obj = test1Repository.save(Test1Obj.getMeAnObj());
			if( obj == null ) return "got null after saving";
			else return obj.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "test1controller can't be here ";

	}


}
