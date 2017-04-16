package educational.entertainment.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "educational.entertainment.controllers")
@ComponentScan(basePackages = "educational.entertainment.models")

@SpringBootApplication
public class MainController {

	public static void main(String[] args) {
    
		System.out.println("\n\nhelllllllllllllllllllllllllllllllllllllllllllllllllllo\n\n");
		SpringApplication.run(MainController.class, args);
		
	}

}