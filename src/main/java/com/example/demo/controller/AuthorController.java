package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

	@RequestMapping(path = "/lms/author/{authorId}")
	public String getAuthorId(@PathVariable(value = "authorId") int authorId) {
		return "Hello author "+authorId;
	}
}
