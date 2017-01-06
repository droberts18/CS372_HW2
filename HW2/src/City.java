/**
 * @author Drew Roberts
 * @version 1.0
 */


import java.util.ArrayList;

public class City {

	public static void main(String[] args) {
		ArrayList<Person> citizens = new ArrayList<Person>();
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		// Adds citizens
		citizens.add(new Kid("Larry", 7, 5551230, "Butterfinger"));
		citizens.add(new Kid("Sam", 12, 5559180, "Twix"));
		citizens.add(new Teacher("Kim", 27, 5554678, 55000, 4, "Art"));
		citizens.add(new Teacher("Dave", 36, 5553029, 60000, 7, "Geography"));
		citizens.add(new Teacher("Tanner", 24, 5553089, 45000, 1, "Special Education"));
		citizens.add(new Police("Beth", 29, 5556374, Role.Captain, 80000));
		citizens.add(new Police("Shane", 38, 5559023, Role.Chief, 90000));
		citizens.add(new Police("Hannah", 23, 5553301, Role.Patrol, 60000));
		citizens.add(new Police("Richard", 29, 5554678, Role.Sargent, 70000));
		citizens.add(new Person("Rick", 22, 5559801));
		
		CityHall cityHall = new CityHall("City Hall", "123 1st Street");
		School school = new School("School", "456 2nd Street");
		Building donut = new Building ("Donut Shop", "124 1st Street");
		
		// Adds buildings
		buildings.add(cityHall);
		buildings.add(school);
		buildings.add(donut);
		
		// Outputs the name of all citizens
		System.out.printf("NAMES OF ALL CITIZENS\n");
		for(Person p : citizens){
			System.out.printf("%s\n", p.getName());
			
			if(p instanceof Kid)
				school.addOccupant(p);
			else if (p instanceof Teacher)
				school.addOccupant(p);
			else if (p instanceof Police)
				cityHall.addOccupant(p);
		}
		System.out.println();
		
		// Outputs the names of all buildings
		System.out.printf("NAMES OF ALL BUILDINGS\n");
		for(Building b : buildings){
			System.out.printf("%s\n", b.getName());
		}
		System.out.println();
		
		// Outputs the name of all kids and teachers in the school
		System.out.printf("KIDS AND TEACHERS IN SCHOOL\n");
		for(Person p : school.getCurrentOccupants()){
			System.out.printf("%s\n", p.getName());
		}
		System.out.println();
		
		// Outputs the name of all police in City Hall
		System.out.printf("POLICE IN CITY HALL\n");
		for(Person p : cityHall.getCurrentOccupants()){
			System.out.printf("%s\n", p.getName());
		}
		System.out.println();
		
		// Pays all employees
		System.out.printf("PAYING EMPLOYEES\n");
		for(Person p : citizens){
			if(p instanceof Employee)
				((Employee)p).getPaid();
		}
	}
}
