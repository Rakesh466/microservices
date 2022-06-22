package com.email;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@GetMapping("/email/{emailAddress}")
	String sendMail(@PathVariable("emailAddress") String emailAddress){
	System.out.println("EmailAddress:"+emailAddress);
	return "Sent success full";
	}
}
