package br.com.jsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SpringBootController {

	
	@RequestMapping(value="/ola")
	public @ResponseBody String teste() {
		
	
	return "TESTE SPRING BOOT ";
	}

}
