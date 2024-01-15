package com.springboot.blog.payload;

import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PostDto {
	private long id;
	@NotEmpty
	@Size(min = 2, message="Post title should have alteast 2 characters")
	private String title;
	@NotEmpty
	@Size(min = 10, message="Post description should have atleast 10 characters")
	private String description;
	@NotEmpty
	private String content;
	private Set<CommentDto> comments;

	public PostDto(long id, String title, String description, String content, Set<CommentDto> comments) {

		this.id = id;	
		this.title = title;
		this.description = description;
		this.content = content;
		this.comments = comments;
	}

	public PostDto() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<CommentDto> getComments() {
		return comments;
	}

	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}

}
