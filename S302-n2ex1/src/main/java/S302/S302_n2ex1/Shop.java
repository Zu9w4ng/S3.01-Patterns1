package S302.S302_n2ex1;

public class Shop
{
	private String name;

	public Shop(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void transactionDone(int quantity, String method)
	{
		System.out.println("La botiga " + name + " ha venut productes per valor de "
				+ quantity + " euros, i tal quantitat s'ha pagat amb " + method);
	}
		
}
