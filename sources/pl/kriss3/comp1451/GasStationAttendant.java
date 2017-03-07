package pl.kriss3.comp1451;

public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant>
{
	private double numberOfDollarsStolenPerDay;

	public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) 
	{
		super(name);
		setNumberOfDollarsStolenPerDay(numberOfDollarsStolenPerDay);
	}

	public double getNumberOfDollarsStolenPerDay() 
	{
		return numberOfDollarsStolenPerDay;
	}

	public void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) 
	{
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
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
		return 1.5;
	}

	@Override
	public int compareTo(GasStationAttendant gsa) 
	{
		if(numberOfDollarsStolenPerDay==gsa.numberOfDollarsStolenPerDay)  
			return 0;  
		else if(numberOfDollarsStolenPerDay > gsa.numberOfDollarsStolenPerDay)  
			return 1;  
		else
			return -1;  
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numberOfDollarsStolenPerDay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (!(obj instanceof GasStationAttendant))
			return false;
		
		GasStationAttendant other = (GasStationAttendant) obj;
		
		if (Double.doubleToLongBits(numberOfDollarsStolenPerDay) != Double
				.doubleToLongBits(other.numberOfDollarsStolenPerDay))
			return false;
		
		return true;
	}
}
