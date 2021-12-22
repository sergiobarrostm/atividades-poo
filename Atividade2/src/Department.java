import java.util.ArrayList;
public class Department {
	
	private String nameDepartment;
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();

	public Department() {}

	public Department(String nameDepartment) {
		super();
		this.nameDepartment = nameDepartment;
	}
	
	
	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public void postEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void deleteEmployee(Employee employee) {
		employeeList.remove(employee);
	}
	
	public void showEmployee() {		
		for(int i = 0; i < employeeList.size(); i++) {
			System.out.println("Nome: " 	+ employeeList.get(i).getName());
			System.out.println("Cargo: " 	+ employeeList.get(i).getRole());
			System.out.println("Salário: " 	+ employeeList.get(i).getSalary());
			System.out.println("Endereço: " + employeeList.get(i).getAddress().getStreet() + ", "
											+ employeeList.get(i).getAddress().getCity()  + ", "
											+ employeeList.get(i).getAddress().getState());
		}
	}
	
}
