package pl.kriss3.comp1451;

public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer>
{
	private int numberOfGoals;

	public HockeyPlayer(String name, int numberOfGoals) 
	{
		super(name);
		setNumberOfGoals(numberOfGoals);
	}

	public int getNumberOfGoals() 
	{
		return numberOfGoals;
	}
	
	public void setNumberOfGoals(int numberOfGoals) 
	{
		this.numberOfGoals = numberOfGoals;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfGoals;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (!(obj instanceof HockeyPlayer))
			return false;
		
		HockeyPlayer other = (HockeyPlayer) obj;
		
		if (numberOfGoals != other.numberOfGoals)
			return false;
		
		return true;
	}

	@Override
	public double getOverTimePayRate() 
	{
		return 0.0;
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
	public int compareTo(HockeyPlayer hp) 
	{
		return hp.numberOfGoals - this.numberOfGoals;
	}
	
	@Override
	public String toString()
	{
		return String.format("Name: %s  - Number of Goals: %s", super.getName(), numberOfGoals);
	}
}
