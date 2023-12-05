package S301.n2ex1;

public class SpanishDataFactory implements DataFactory
{
	@Override
	public Agenda createAgenda()
	{
		return new SpanishAgenda();
	}

	@Override
	public Telf createTelf(String telf)
	{
		return new SpanishTelf(telf);
	}

	@Override
	public Address createAddress(String address)
	{
		return new SpanishAddress(address);
	}

}
