package com.example.demo.service;

import com.example.demo.repository.Posts;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data//왜냐 읽고 쓰고 다 해야 되니까
public class PostsSaveRequestDto {

	String title;
	String content;
	String author;
	
	@Builder
	public PostsSaveRequestDto(String title, String content, String author) {
		super();
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public Posts toEntity() {
		return Posts.builder().title(title).content(content).author(author).build();
	}
	
}
