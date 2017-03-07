package pl.kriss3.comp1451;

import java.util.ArrayList;

public class Employees 
{
	private ArrayList<Employee> emp;
	
	public Employees()
	{
		emp = new ArrayList<>();
		
		emp.add(new HockeyPlayer("Wayne Gretzky", 894));
		emp.add(new HockeyPlayer("Who Ever", 0));
		emp.add(new HockeyPlayer("Brent Gretzky", 1));
		emp.add(new HockeyPlayer("Pavel Bure",437));
		emp.add(new HockeyPlayer("Jason Harrison",0));

		emp.add(new Professor("Albert Einstein","Physics"));
		emp.add(new Professor("Jason Harrison",	"Computer Systems"));
		emp.add(new Professor("Richard Feynman","Physics"));
		emp.add(new Professor("BCIT Instructor","Computer Systems"));
		emp.add(new Professor("Kurt Godel","Logic"));

		emp.add(new Parent("Tiger Woods",1));
		emp.add(new Parent("Super Mom",168 ));
		emp.add(new Parent("Lazy Larry", 20));
		emp.add(new Parent("Ex Hausted",168));
		emp.add(new Parent("Super Dad",167));

		emp.add(new GasStationAttendant("Joe Smith", 10));
		emp.add(new GasStationAttendant("Tony Baloney", 100));
		emp.add(new GasStationAttendant("Benjamin Franklin", 100));
		emp.add(new GasStationAttendant("Mary Fairy", 101));
		emp.add(new GasStationAttendant("Bee See", 1));
	}
}
