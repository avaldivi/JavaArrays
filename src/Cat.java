/* Adrianna Valdivia */

public class Cat implements Comparable<Cat>
{
	private String name;
	private String breed;
	private int numberOfLegs;
	private int yearBorn;

	public Cat()
	{
		this.name = "default";
		this.breed = "default";
		this.numberOfLegs = 0;
		this.yearBorn = 0;
	}

	public Cat(String name, String breed, int numberOfLegs, int yearBorn)
	{
		this.name = name;
		this.breed = breed;
		this.numberOfLegs = numberOfLegs;
		this.yearBorn = yearBorn;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getBreed()
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public int getNumberOfLegs()
	{
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs)
	{
		this.numberOfLegs = numberOfLegs;
	}

	public int getYearBorn()
	{
		return yearBorn;
	}

	public void setYearBorn(int yearBorn)
	{
		this.yearBorn = yearBorn;
	}

	@Override
	public String toString()
	{
		return "Cat [Name = " + getName() + ", Breed = " + getBreed()
				+ ", Number Of Legs = " + getNumberOfLegs()
				+ ", Year Born = " + getYearBorn() + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Cat c)
	{
		if (this.name.compareTo(c.name) < 0)
		{
			return -1;
		}
		else if (this.name.compareTo(c.name) > 0)
		{
			return 1;
		}
		if (this.name.equals(c.name))
		{
			if (this.numberOfLegs < c.numberOfLegs)
			{
				return -1;
			}
			else if (this.numberOfLegs == c.numberOfLegs)
			{
				return 0;
			}
			return 1;
		}
		return 0;
	}
	
	//SHORT way to Compare the cats name, look below
	/*public int compareTo(Cat c)
	{
		return this.name.compareTo(c.name);
		
	}*/

	//Compare the cats name, look below
	/*@Override
	public int compareTo(Cat c)
	{
		if (this.name.compareTo(c.name) < 0)
		{
			return -1;
		}
		else if (this.name.equals(c.name))
		{
			return 0;
		}
		return 1;
	}*/

	
	// Compare year born, look at the last sys.out in tester to understand
	// only each compareTo method can be used, one at a time.
	/*@Override
	public int compareTo(Cat c)
	{
		if (this.yearBorn < c.yearBorn)
		{
			return -1;
		}
		else if (this.yearBorn > c.yearBorn)
		{
			return 1;
		}
		return 0;
	}*/

}
