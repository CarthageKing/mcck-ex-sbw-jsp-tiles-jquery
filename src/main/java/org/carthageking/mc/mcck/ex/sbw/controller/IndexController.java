package org.carthageking.mc.mcck.ex.sbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	public IndexController() {
		// noop
	}

	@GetMapping("/")
	public String goHome() {
		// must refer to a valid tiles definition id in our tiles-def.xml. In this case, it should refer to the home page
		return "home";
	}
}
