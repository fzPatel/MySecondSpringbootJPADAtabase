package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Data;
import com.example.service.DataService;


@RestController
public class MyServicesController {


@Autowired
private DataService dataservice;


	//------------------------------Services----------------------------------//

	@GetMapping("/data")
	@ResponseBody
		public List<Data> getdata() {
			return dataservice.getAlldata();
		}
		
	@GetMapping("/data/{id}")
	public Optional<Data> getdataById(@PathVariable int id) 
	{	
		return dataservice.getAlldataById(id);
	}

	@RequestMapping(method=RequestMethod.POST,value="/data")
	public void addData(@RequestBody Data data) 
	{
	dataservice.addData(data);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/data/{name}")
	public void updateData(@RequestBody Data data,@PathVariable String name) 
	{
		dataservice.updateData(name,data);	
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/data/{name}")
	public void deleteData(@PathVariable String name) 
	{
		dataservice.deleteData(name);	
	}

	//------------------------------Services----------------------------------



}
