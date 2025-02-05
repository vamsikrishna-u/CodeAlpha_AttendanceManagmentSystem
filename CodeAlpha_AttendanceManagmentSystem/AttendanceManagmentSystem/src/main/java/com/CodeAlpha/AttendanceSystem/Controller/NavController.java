package com.CodeAlpha.AttendanceSystem.Controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NavController {
	
	@GetMapping
	public String test() {
		return"testing";
	}

}
