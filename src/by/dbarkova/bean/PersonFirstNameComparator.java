package by.dbarkova.bean;

import java.util.Comparator;

public class PersonFirstNameComparator implements Comparator<Person>{
	
	public int compare(Person p1, Person p2) {
		
		return p1.getLastName().compareToIgnoreCase(p2.getLastName());
    }
}