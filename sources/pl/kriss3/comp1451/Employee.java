package pl.kriss3.comp1451;

public abstract class Employee implements IEmployable
{
	private String name;

	public Employee(String name) 
	{
		setName(name);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public abstract double getOverTimePayRate();
}
