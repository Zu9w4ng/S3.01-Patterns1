package S302.n1ex1;

public class Agency implements Listener
{
	private String agencyName;
	private String location;
	
	public Agency(String agencyName, String location)
	{
		this.agencyName = agencyName;
		this.location = location;
	}

	public String getName()
	{
		return agencyName;
	}

	public void setAgencyName(String agencyName)
	{
		this.agencyName = agencyName;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public void update(boolean b)
	{
		if (b)
			System.out.println(agencyName + " ha rebut la notícia que la borsa ha pujat");
		else
			System.out.println(agencyName + " ha rebut la notícia que la borsa ha baixat");
	}

}
