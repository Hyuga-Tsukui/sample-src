package sample.jackson;

import java.time.LocalDateTime;

public class SampleObj {
	
	private int id;
	
	private String name;

	private LocalDateTime registrationDateTime;
	
	public SampleObj(int id, String name, LocalDateTime registrationDateTime) {
		this.id = id;
		this.name = name;
		this.registrationDateTime = registrationDateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getRegistrationDateTime() {
		return registrationDateTime;
	}

	public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
		this.registrationDateTime = registrationDateTime;
	}

	@Override
	public String toString() {
		return "SampleObj [id=" + id + ", name=" + name + ", registrationDateTime=" + registrationDateTime + "]";
	}
	
}
