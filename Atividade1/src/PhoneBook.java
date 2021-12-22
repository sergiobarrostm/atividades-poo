import java.util.ArrayList;

public class PhoneBook extends Person{
	public ArrayList<Person> phonebook = new ArrayList<Person>();
	
	public void postPerson(Person person) {
		phonebook.add(person);
	}
	
	public void getPerson() {		
		for(int i = 0; i < phonebook.size(); i++) {
			phonebook.get(i).showPerson();
		}
	}
	
	public void deletePerson(Person person) {
		phonebook.remove(person);
	}
	

}
