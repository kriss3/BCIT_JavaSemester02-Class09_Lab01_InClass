package pl.kriss3.comp1451;

public class Parent extends Employee implements Comparable<Parent>
{
	private int numberOfHoursSpentPerWeekWithKids;

	public Parent(String name, int numberOfHoursSpentPerWeekWithKids) 
	{
		super(name);
		setNumberOfHoursSpentPerWeekWithKids(numberOfHoursSpentPerWeekWithKids);
	}

	public int getNumberOfHoursSpentPerWeekWithKids() 
	{
		return numberOfHoursSpentPerWeekWithKids;
	}

	public void setNumberOfHoursSpentPerWeekWithKids(int numberOfHoursSpentPerWeekWithKids) 
	{
		this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
	}

	@Override
	public String getDressCode() 
	{
		return null;
	}

	@Override
	public boolean isPaidSalary() 
	{
		return false;
	}

	@Override
	public boolean postSecondaryEducationRequired() 
	{
		return false;
	}

	@Override
	public String getWorkVerb() 
	{
		return null;
	}

	@Override
	public double getOverTimePayRate() 
	{
		return -2.0;
	}

	@Override
	public int compareTo(Parent parent) 
	{
		return  parent.getNumberOfHoursSpentPerWeekWithKids() - this.getNumberOfHoursSpentPerWeekWithKids();
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfHoursSpentPerWeekWithKids;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (!(obj instanceof Parent))
			return false;
		
		Parent other = (Parent) obj;
		
		if (numberOfHoursSpentPerWeekWithKids != other.numberOfHoursSpentPerWeekWithKids)
			return false;
		
		return true;
	}
	
	@Override
	public String toString()
	{
		return String.format("Name: %s  - Number of Hourst Spent With Kids: %s", super.getName(), numberOfHoursSpentPerWeekWithKids);
	}
}
