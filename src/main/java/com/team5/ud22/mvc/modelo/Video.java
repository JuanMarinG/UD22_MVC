package com.team5.ud22.mvc.modelo;

public class Video {

	private String id;
	private String title;
	private String director;
	private int cli_id;
	
	public Video() {}
	
	public Video(String id, String title, String director, int cli_id) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.cli_id = cli_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getCli_id() {
		return cli_id;
	}

	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", title=" + title + ", director=" + director + ", cli_id=" + cli_id + "]";
	}
	
	
}
