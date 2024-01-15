package com.springboot.blog.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CommentDto {
	private long id;
	@NotEmpty(message = "Name should not be empty")
	private String name;
	@Email
	@NotEmpty(message="Email should not be empty")
	private String email;
	@NotEmpty()
	@Size(min = 10, message = "Comment must be minimum of 10 characters")
	private String body;

	public CommentDto(long id, String name, String email, String body) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.body = body;
	}

	public CommentDto() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
