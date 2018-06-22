package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 页面跳转Controller
 * **/
@Controller
public class PageController {
	@RequestMapping("/")
	public String showIndex(){
		return "index";
		
	}
}
