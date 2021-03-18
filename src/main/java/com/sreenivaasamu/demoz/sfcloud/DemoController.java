package com.sreenivaasamu.demoz.sfcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sreenivaasamu.demoz.sfcloud.data.DemoData;

@RestController
public class DemoController {
	
	//@RequestMapping(method=RequestMethod.GET, path="/demo")
	@GetMapping(path="/demo")
	public String process() {
		return "Om Ganeshaya Namaha";
	}

	@RequestMapping(method = RequestMethod.GET, path = "demobean")
	public DemoData processBean() {
		return new DemoData("Om Ganeshaya Namaha");
	}
	
}
