package com.de.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.de.project.dto.ResponseDTO;

@ResponseController
@RequestMapping("todo")
public class TodoController {
	
	@GetMapping("/todoResponseEntity")
	public ResponseEntity<?> todoControllerResponseEntity() {
		List<String> list = new ArrayList<>();
		list.add("todo ResponseEntity");
		responseDTO<String> response = ResponseDTO.builder().<String>data(list).build();
		return ResponseEntity.badRequest().body(response);
	}


}
