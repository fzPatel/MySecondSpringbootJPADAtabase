package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	@GetMapping("/show-users")
	public ModelAndView showusers(HttpServletRequest request){
		List<Data> d=ds.getAlldata();
		ModelAndView model=new ModelAndView("users");
		model.addObject("data",d);
		return model;
	}

	@GetMapping("/go")
	public ModelAndView go()
	{
		ModelAndView model=new ModelAndView("loginpage");
		return model;
	}
	
	
	@RequestMapping(value="/saveuser",method = RequestMethod.POST)
	public String saveusr(@RequestParam int id,@RequestParam String pass,@RequestParam String name,@RequestParam String address,@RequestParam String city ) 
	{
		Data d=new Data(id,pass,name,address,city);
		ds.addData(d);
	    return "index2";	
	}	


	
	@PostMapping("/login-user")
	public String loginUser(Data d, HttpServletRequest request) {
	
		System.out.println(d.getId());
		System.out.println(d.getPass());
		
		if(ds.findByUsernameAndPassword(d)!=null) {
			return "index2";
		}
		else {
				request.setAttribute("error", "Invalid Username or Password");
				request.setAttribute("mode", "MODE_LOGIN");
				return "loginpage";
		
	
	}
	
	}
	
}
