import java.util.ArrayList;

public class Company {
	
	private String nameCompany;
	private String CNPJ;
	private ArrayList<Department> departmentList = new ArrayList<Department>();
	
	public Company() {}

	public Company(String nameCompany, String cNPJ, ArrayList<Department> departmentList) {
		super();
		this.nameCompany = nameCompany;
		CNPJ = cNPJ;
		this.departmentList = departmentList;
	}
	
	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public ArrayList<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(ArrayList<Department> departmentList) {
		this.departmentList = departmentList;
	}
	
	
	public void postDepartment(Department department) {
		departmentList.add(department);
	}
	
	public void deleteDepartment(Department department) {
		departmentList.remove(department);
	}
	
	public void showDepartment() {
		System.out.println("Departamentos");
		for(int i = 0; i < departmentList.size(); i++) {
			System.out.println(departmentList.get(i).getNameDepartment());
		}
	}

}
