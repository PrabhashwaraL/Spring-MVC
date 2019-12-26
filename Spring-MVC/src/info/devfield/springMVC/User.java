package info.devfield.springMVC;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull(message = "This field is required!")
	@Size(min=1, message = "This field is required!")
	private String name;
	
	public User() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
