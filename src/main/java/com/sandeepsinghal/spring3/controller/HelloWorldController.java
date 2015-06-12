package com.sandeepsinghal.spring3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ssinghal on 12/06/15.
 */
@Controller
public class HelloWorldController
{
	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		String sayHelloTo = "Sandeep Singhal";
		System.out.println("Came Here : " + sayHelloTo);
		return new ModelAndView("hello", "message", sayHelloTo);
	}
}
