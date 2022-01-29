package com.de.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.de.project.dto.ResponseDTO;

@RestController
@RequestMapping("todo")
public class TodoController {
	
	@GetMapping("/todoResponseEntity")
	public ResponseEntity<?> todoControllerResponseEntity() {
		List<String> list = new ArrayList<>();
		list.add("todo ResponseEntity");
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.badRequest().body(response);
	}


}
