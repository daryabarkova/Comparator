package by.dbarkova.bean;

import java.util.Comparator;

public class PersonNamesComparator implements Comparator<Person> {
	
	public int compare(Person p1, Person p2) {
		if (p1.getLastName().compareToIgnoreCase(p2.getLastName()) == 0){
			return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
		}else {
			return p1.getLastName().compareToIgnoreCase(p2.getLastName());
		}
	}

}
