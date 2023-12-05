package S301.n2ex1;

import java.util.HashMap;

public class SpanishAgenda implements Agenda
{
	private HashMap<Telf, Address> addresses = new HashMap<Telf, Address>();
	private static final String COUNTRY = "SPAIN";
	
	public HashMap<Telf, Address> getAddresses()
	{
		return addresses;
	}
	
	public String getCOUNTRY()
	{
		return COUNTRY;
	}

	public void showTelfs()
	{
		System.out.println(addresses.keySet());
	}

	public void showAddresses()
	{
		System.out.println(addresses.values());
	}

	@Override
	public void addValues(Telf telf, Address address)
	{
		addresses.put(telf, address);
	}
}