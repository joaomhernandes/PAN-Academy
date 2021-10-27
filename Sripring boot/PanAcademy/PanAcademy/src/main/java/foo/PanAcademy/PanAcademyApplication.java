package foo.PanAcademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/saudacao")
@SpringBootApplication
@RestController

public class PanAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanAcademyApplication.class, args);
	}
	
	
	@GetMapping("/ola")
	public String ola() {
		return "Hello World!";
	}

}
