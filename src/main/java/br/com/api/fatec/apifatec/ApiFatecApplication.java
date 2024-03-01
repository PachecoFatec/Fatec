package br.com.api.fatec.apifatec;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class ApiFatecApplication {
	
	@RequestMapping("/")
	String home() {
		return "Hello world";
	}
	@RequestMapping("/hello")
	String home2() {
		return "hello world 2";
	}
	@RequestMapping("/numero")
	Integer homenumero() {
		return  2;
		
	}
	@RequestMapping("/numeroinput/{num}")
	Integer numero(@PathVariable Integer num) {
		return  num;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
	}

}
