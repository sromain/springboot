package com.javamind.springboot;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorIwsController implements ErrorController {

	private static final String PATH = "/error";

	public String getErrorPath() {
		return PATH;
	}

	@RequestMapping(value = PATH)
	public String doGet() {
		return "errorIws";
	}
}
