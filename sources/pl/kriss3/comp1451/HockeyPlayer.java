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
	public String getDressCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPaidSalary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getWorkVerb() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(HockeyPlayer hp) 
	{
		if(numberOfGoals==hp.numberOfGoals)  
			return 0;  
		else if(numberOfGoals>hp.numberOfGoals)  
			return 1;  
		else
			return -1;  
	}
}
