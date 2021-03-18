package com.sreenivaasamu.demoz.sfcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	//@RequestMapping(method=RequestMethod.GET, path="/demo")
	@GetMapping(path="/demo")
	public String process() {
		return "Om Ganeshaya Namaha";
	}

}
