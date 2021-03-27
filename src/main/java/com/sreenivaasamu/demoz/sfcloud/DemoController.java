package com.sreenivaasamu.demoz.sfcloud;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sreenivaasamu.demoz.sfcloud.data.DemoData;

@RestController
public class DemoController {

	// @RequestMapping(method=RequestMethod.GET, path="/demo")
	@GetMapping(path = "/demo")
	public String process() {
		return "Om Ganeshaya Namaha";
	}

	@RequestMapping(method = RequestMethod.GET, path = "demobean")
	public DemoData processBean() {
		return new DemoData("Om Venkateshaya Namaha");
	}

	@GetMapping(path = "demobeanwithargs/{arg1}")
	public DemoData processBeanWithArgs(@PathVariable String arg1) {
		return new DemoData(String.format("God bless U, [%s]", arg1));
	}

	@GetMapping(path = "demomultiargs/{name}/{email}/{address}")
	public DemoData processBeanWithArgs(@PathVariable(required = false) Map<String, String> pv) {
		StringBuilder buffer = new StringBuilder("God bless U ");
		var pvkeys = pv.keySet();
		pvkeys.forEach(key -> buffer.append(String.format("[%1$s] -> [%2$s] %n", key, pv.get(key))));

		return new DemoData(String.format("[%s]", buffer.toString()));
	}

	@GetMapping(path = "demooptionalargs/{message}")
	public DemoData processBeanWithArgs(@PathVariable Optional<String> message) {
		StringBuilder buffer = new StringBuilder("God bless U ");
		if (message.isPresent()) {
			buffer.append(String.format("-> [%1$s]", message));
		}
		return new DemoData(buffer.toString());
	}
	
}
