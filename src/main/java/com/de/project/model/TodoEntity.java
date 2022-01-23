package com.de.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {
	private String id;		// 이 오브젝트의 id
	private String userId;	// 이 오브젝트를 생성한 사용자의 id
	private String title; 	// Todo 타이틀
	private boolean done;	// true : todo를 완료한 상태(checked)
}
