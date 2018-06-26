package com.example.demo;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.example.model.Data;

public interface DataRepo extends CrudRepository<Data, String>
{
	Optional<Data> findById(int id);
}