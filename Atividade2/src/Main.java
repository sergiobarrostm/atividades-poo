public class Main {

	public static void main(String[] args) {
		
		Company company = new Company();
		
		Department logitica = new Department("Logistica");
		Department atendimento = new Department("Atendimento");
		Department comercial = new Department("Comercial");
		Department mkt = new Department("Marketing");
		Department ti = new Department("Tecnologia da Informação");
		Department suporte = new Department("Suporte");
		Department qa = new Department("Qualidade");
		Department vendas = new Department("Vendas");
		Department design = new Department("Design");
		Department administracao = new Department("Design");
		
		company.postDepartment(logitica);
		company.postDepartment(atendimento);
		company.postDepartment(comercial);
		company.postDepartment(mkt);
		company.postDepartment(ti);
		company.postDepartment(suporte);
		company.postDepartment(qa);
		company.postDepartment(vendas);
		company.postDepartment(design);
		company.postDepartment(administracao);

		Address endereco1 = new Address("Rua Antero Amorim", "Palmeira dos Índios" , "Alagoas");

		Employee empl1 = new Receptionist();
		empl1.setName("Maria");
		empl1.setPhoneNumber("8299887766");
		empl1.setAddress(endereco1);
		
		Employee empl2 = new Driver();
		empl2.setName("João");
		empl2.setPhoneNumber("8298687766");
		empl2.setAddress(endereco1);
		
		Employee empl3 = new Doorman();
		empl3.setName("Euclides");
		empl3.setPhoneNumber("8238687766");
		empl3.setAddress(endereco1);
		
		atendimento.postEmployee(empl1);
		logitica.postEmployee(empl2);
		logitica.postEmployee(empl3);
		
		atendimento.showEmployee();
		logitica.showEmployee();
		
		logitica.deleteEmployee(empl2);
		logitica.showEmployee();
		mkt.postEmployee(empl2);
		mkt.showEmployee();
		
		company.showDepartment();


	}

}
