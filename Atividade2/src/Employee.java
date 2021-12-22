public class Employee extends Person{
	
	private float salary;
	private String role;
	private Address address;
	
	public Employee(){
	}
		
	public Employee(String name, String phoneNumber, float salary, String role, Address address) {
		this.salary = salary;
		this.role = role;
		this.address = address;
	}
	
	public Employee(String name, String phoneNumber, float salary) {
		this.salary = salary;
	}
	
	public Employee(String name, String phoneNumber, Address address) {
		super();
		this.address = address;
	}
	
	public Employee(float salary, String role) {
		super();
		this.salary = salary;
		this.role = role;
	}
	
	public float getSalary() {
		return salary + 300;
	}
	
	public void setSalary(float salary) {
		if (salary >= 0){
			this.salary = salary;
		}
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}
