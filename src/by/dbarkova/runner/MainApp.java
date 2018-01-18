package by.dbarkova.runner;

import java.util.TreeSet;

import by.dbarkova.bean.Person;
import by.dbarkova.bean.PersonFirstNameComparator;
import by.dbarkova.bean.PersonNamesComparator;

public class MainApp {

	public static void main(String[] args) {
		
		PersonNamesComparator pcomp = new PersonNamesComparator();
		
		TreeSet<Person> set = new TreeSet<Person>(pcomp);
		set.add(new Person("Anna", "Kerr", 35));
		set.add(new Person("Helen", "Fox", 28));
		set.add(new Person("Trisha", "Banks", 28));
		set.add(new Person("anna", "Tompson", 39));
		set.add(new Person("ZACK", "Kerr", 25));
		set.add(new Person("Will", "Smith", 41));
		
		for(Person p :  set)
			System.out.println("Person: " + p.getFirstName() + " " + p.getLastName() + " " + p.getAge() );
		
		
		set.add(new Person("Lara", "Kroft", 28));
		set.add(new Person("Sam", "Kroft", 32));
		
		System.out.println();
		
		for(Person per :  set)
			System.out.println("Person: " + per.getFirstName() + " " + per.getLastName() + " " + per.getAge() );

	}

}
