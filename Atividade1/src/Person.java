public class Person {
	
	private String enrollment, name, phoneNumber , email;
	
	
	public Person(String enrollment , String name, String phoneNumber, String email) {
		this.enrollment  = enrollment ;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public Person() {}
	
	public String getEnrollment () {
		return enrollment ;
	}
	
	public void setEnrollment (String enrollment ) {
		if ( enrollment.length() == 6 ) {
			this.enrollment  = enrollment ;

		} else {this.enrollment  = null;}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void showPerson() {
		System.out.println(
				"Nome: " + name + "\n" +
				"Matr�cula: " + enrollment + "\n" +
				"Telefone: " + phoneNumber + "\n" +
				"Email: " + email + "\n"
				);
	}
	
	
}
