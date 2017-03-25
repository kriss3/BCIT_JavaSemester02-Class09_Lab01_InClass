package pl.kriss3.comp1451;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Employees 
{
	private static List<Employee> emp;
	private static List<HockeyPlayer> hockeyPlayers;
	private static List<Professor> professors;
	private static List<Parent> parents;
	private static List<GasStationAttendant> gasStationAttendent;
	
	public Employees()
	{
		//createAllEmployees();
		createHockeyPlayers();
		System.out.println();
		createProfessors();
		System.out.println();
		createParents();
		System.out.println();
		createGasStationAttendants();
	}
	
	private static void createAllEmployees()
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

	private static void createHockeyPlayers()
	{
		hockeyPlayers = new ArrayList<HockeyPlayer>();
		
		hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky", 894));
		hockeyPlayers.add(new HockeyPlayer("Who Ever", 0));
		hockeyPlayers.add(new HockeyPlayer("Brent Gretzky", 1));
		hockeyPlayers.add(new HockeyPlayer("Pavel Bure",437));
		hockeyPlayers.add(new HockeyPlayer("Jason Harrison",0));
		
		System.out.println("Hockey Players before: ");
		for (Employee hPlayerBefore : hockeyPlayers) 
		{
			System.out.println(hPlayerBefore.toString());
		}
		
		Collections.sort(hockeyPlayers);
		
		System.out.println("Hockey Players after: ");
		for (Employee hPlayerAfter : hockeyPlayers) 
		{
			System.out.println(hPlayerAfter.toString());
		}
		
	}

	private static void createProfessors()
	{
		professors = new ArrayList<Professor>();
		
		professors.add(new Professor("Albert Einstein","Physics"));
		professors.add(new Professor("Jason Harrison",	"Computer Systems"));
		professors.add(new Professor("Richard Feynman","Physics"));
		professors.add(new Professor("BCIT Instructor","Computer Systems"));
		professors.add(new Professor("Kurt Godel","Logic"));
		professors.add(new Professor("John Doe","Anatomy"));
		
		System.out.println("Professors before: ");
		for (Employee profs : professors) 
		{
			System.out.println(profs.toString());
		}
		
		Collections.sort(professors);
		
		System.out.println("Professors after: ");
		for (Employee profs : professors) 
		{
			System.out.println(profs.toString());
		}
		
	}
	
	private static void createParents()
	{
		parents = new ArrayList<Parent>();
		
		parents.add(new Parent("Tiger Woods",1));
		parents.add(new Parent("Super Mom",168 ));
		parents.add(new Parent("Lazy Larry", 20));
		parents.add(new Parent("Ex Hausted",168));
		parents.add(new Parent("Super Dad",167));
		
		System.out.println("Parents before: ");
		for (Employee parent : parents) 
		{
			System.out.println(parent.toString());
		}
		
		Collections.sort(parents);
		
		System.out.println("Parents after: ");
		for (Employee parent : parents) 
		{
			System.out.println(parent.toString());
		}	
	}
	
	private static void createGasStationAttendants()
	{
		gasStationAttendent = new ArrayList<GasStationAttendant>();
		
		gasStationAttendent.add(new GasStationAttendant("Joe Smith", 10));
		gasStationAttendent.add(new GasStationAttendant("Tony Baloney", 100));
		gasStationAttendent.add(new GasStationAttendant("Benjamin Franklin", 100));
		gasStationAttendent.add(new GasStationAttendant("Mary Fairy", 101));
		gasStationAttendent.add(new GasStationAttendant("Bee See", 1));
		
		System.out.println("Gas station attendents before: ");
		for (Employee gsa : gasStationAttendent) 
		{
			System.out.println(gsa.toString());
		}
		
		Collections.sort(gasStationAttendent);
		
		System.out.println("Gas station attendents after: ");
		for (Employee gsa : gasStationAttendent) 
		{
			System.out.println(gsa.toString());
		}
		
	}
	
}
