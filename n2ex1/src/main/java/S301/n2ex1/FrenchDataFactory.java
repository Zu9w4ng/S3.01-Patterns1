package S301.n2ex1;

public class FrenchDataFactory implements DataFactory
{
	@Override
	public Agenda createAgenda()
	{
		return new FrenchAgenda();
	}

	@Override
	public Telf createTelf(String telf)
	{
		return new FrenchTelf(telf);
	}

	@Override
	public Address createAddress(String address)
	{
		return new FrenchAddress(address);
	}

}
