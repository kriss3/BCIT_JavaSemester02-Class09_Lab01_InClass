package pl.kriss3.comp1451;

public class Professor extends Employee implements Comparable<Professor>
{
	private String teachingMajor;

	public Professor(String name, String teachingMajor) 
	{
		super(name);
		setTeachingMajor(teachingMajor);
	}

	public String getTeachingMajor() 
	{
		return teachingMajor;
	}

	public void setTeachingMajor(String teachingMajor) 
	{
		this.teachingMajor = teachingMajor;
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
		return 2.0;
	}

	@Override
	public int compareTo(Professor prof) 
	{
		//always start with what passing object/param has. Or compare with the required string/value;
		if(this.getTeachingMajor().equals("Computer Systems"))
			return -1;
		else return 1;

	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (!(obj instanceof Professor))
			return false;
		
		Professor other = (Professor) obj;
		
		if (teachingMajor == null) 
		{
			if (other.teachingMajor != null)
				return false;
		} else if (!teachingMajor.equals(other.teachingMajor))
			return false;
		
		if(this.getTeachingMajor().equalsIgnoreCase(other.getTeachingMajor()))
		{
			return true;
		}
		
		return false;
	}

	@Override
	public String toString()
	{
		return String.format("Name: %s - Major: %s", super.getName(), teachingMajor);
	}
}
