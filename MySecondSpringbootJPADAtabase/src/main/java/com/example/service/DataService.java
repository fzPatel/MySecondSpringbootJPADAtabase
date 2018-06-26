package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DataRepo;
import com.example.model.Data;

@Service
@Transactional
public class DataService 
{
	@Autowired
	private DataRepo rd;

	@Autowired
	private DataService ds;

public 	List<Data> getAlldata()
{
	List<Data> users=new ArrayList<Data>();
	rd.findAll().forEach(users::add);
	return users;
	
}

public Data findByUsernameAndPassword(Data d) {
	return ds.findByUsernameAndPassword(d);
}


public 	void addData(Data d)
{
	System.out.println("inside model");
	rd.save(d);
}

public 	Optional<Data> getAlldataById(String name)
{
return rd.findById(name);
}

public 	Optional<Data> getAlldataById(int id)
{
return rd.findById(id);
}


public 	void updateData(String name,Data da)
{		rd.save(da);
}

public 	void deleteData(String name)
{	
	rd.deleteById(name);
}
}
