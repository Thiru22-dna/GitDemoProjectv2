package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	
	@GetMapping(path="/{userID}")
	public String getUser(@PathVariable String userID)
	{
		return "http GET request was sent for userid:" +userID;
	}
	
	@GetMapping
	public String getUsers(@RequestParam(value ="page") int pageno, @RequestParam(value="limit") int limitno)
	{
		return "http GET request was sent forPage:" +pageno+ "and limit is:"+limitno;
	}
	
	@PostMapping
	public String createUsers()
	{
		return "http POST Request was sent";
	}
	
	@PutMapping
	public String updateUser()
	{
		return "http PUT Request was sent";
	}
	
	@DeleteMapping
	public String deleteUsers()
	{
		return "http DELETE Request was sent";
	}

}
