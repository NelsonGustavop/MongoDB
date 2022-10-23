package com.Slayer.db.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Slayer.db.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity< List<User>>findAll(){
		User maria = new  User("1", "Maria","maria@gmmail.com" );
		User eren = new  User("1", "eren","eren@gmmail.com" );
		User erwin = new  User("1", "erwin","erwin@gmmail.com" );
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,eren,erwin));
		return ResponseEntity.ok().body(list);
	}
}
