
public class Main {

	public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
    	PhoneBook phoneBook = new PhoneBook();
        
    	p1.setName("Sergio");
    	p1.setEnrollment("201912");
    	p1.setEmail("sergio.barros@arapiraca.ufal.br");
        p1.setPhoneNumber("82 998024859");        
        phoneBook.postPerson(p1);

    	p2.setName("Victor");
    	p2.setEnrollment("2019213");
    	p2.setEmail("sergio.barros@gmail.com");
        p2.setPhoneNumber("82 991212112");        
        phoneBook.postPerson(p2);
        
        phoneBook.getPerson();
        phoneBook.deletePerson(p1);
        phoneBook.getPerson();

		
	}

}
