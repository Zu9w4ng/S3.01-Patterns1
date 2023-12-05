package Transports;

public class Ship extends Transport
{
	@Override
	public void turnOn()
	{
		if (!started)
		{
			started = true;
			System.out.println("El vaixell ha arrencat el motor");
		}
		else
			System.out.println("Ja tenia el motor en marxa");
	}

	@Override
	public void turnOff()
	{
		if (started)
		{
			started = false;
			System.out.println("El vaixell ha parat completament");
		}
		else
			System.out.println("Ja tenia el motor aturat");
	}

	@Override
	public void accelerate()
	{
		if (!started)
		{
			System.out.println("El vaixell està aturat i ha d'arrencar primer");
		}
		else
		{
			stopping = false;
			accelerating = true;
			System.out.println("El vaixell està accelerant");
		}	
	}

	@Override
	public void stop()
	{
		if (!started)
		{
			System.out.println("El vaixell està aturat i ha d'arrencar primer");
		}
		else
		{
			stopping = true;
			accelerating = false;
			System.out.println("El vaixell està frenant");
		}
	}
}
