package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Data;
import com.example.service.DataService;

@Controller 
public class MyFirstController {

	@Autowired
	private DataService ds;

	
	@RequestMapping("/")
	public String first() 
	{
		return "index";
	}	

	@RequestMapping("/go")
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginpage");
		return modelAndView;
	}
	

	@RequestMapping(value="/saveuser",method = RequestMethod.POST)
	public String saveusr(@RequestParam int id,@RequestParam String pass,@RequestParam String name,@RequestParam String address,@RequestParam String city ) 
	{
	Data d=new Data(id,pass,name,address,city);

	ds.addData(d);
	
    return "index2";	
	}	


	
	
	
	
	
	@RequestMapping(value="/logincheck",method = RequestMethod.POST)
	public ModelAndView login3(@RequestParam String id,@RequestParam String pass) 
	{
		ModelAndView mv=null;
     System.out.println(id+"  "+pass);	
  
     
    return mv;	
	}	
	


}
