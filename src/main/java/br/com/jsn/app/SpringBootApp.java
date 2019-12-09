package br.com.jsn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootApp {

	
	
	public static void main(String args[]){
		SpringApplication.run(SpringBootApp.class, args);
		
		
	}
	
	
	
}


@RestController
class Hello {

    @RequestMapping("/")
    String index() {
        return "Hello world";
    }
    
}
