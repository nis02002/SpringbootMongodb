package com.ning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class UserController {

	@RequestMapping("/")
	public String home()
	{
		return "hello world";
	}

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUser(){
		return ResponseEntity.ok().body(userService.getAllUser());
	}
	
	@RequestMapping("/create")
	public String create(@RequestParam String name, @RequestParam String email, @RequestParam String password){
		User u = userService.create(name, email, password);
		return u.toString();
	}
	
	/*
	@RequestMapping("/get")
	public User getUser(@RequestParam String name) {
		return userService.getUserByName(name);
	}
	
	/*
	
	@RequestMapping("/getAll")
	public ResponseEntity<List<User>> getAll(){
		return ResponseEntity.ok().body(userService.getAll());
	}
	
	@RequestMapping("/get")
	public User getUser(@RequestParam String name){
		return userService.getByUsername(name);
	}
	*/
	
	/*
	@PostMapping("/users")
	public ResponseEntity<User> createProduct(@RequestBody User tour){
		return ResponseEntity.ok().body(this.userService.create(tour));
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateTour(@PathVariable long id, @RequestBody User tour){
		tour.setId(id);
		return ResponseEntity.ok().body(this.userService.updateUser(tour));
	}

	@DeleteMapping("/users/{id}")
	public HttpStatus deleteProduct(@PathVariable long id){
		this.userService.delete(id);
		return HttpStatus.OK;
	}
	*/
}
