package com.psja.CheckMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CheckController {

	@RequestMapping( value = "/check" )
	public ModelAndView check() {
		return new ModelAndView( "check" );
	}
}
