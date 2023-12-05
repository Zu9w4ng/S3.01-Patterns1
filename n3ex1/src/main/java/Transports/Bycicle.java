package Transports;

public class Bycicle extends Transport
{
	@Override
	public void turnOn()
	{
		if (!started)
		{
			started = true;
			System.out.println("S'ha posat en moviment la bici");
		}
		else 
			System.out.println("Ja està en moviment la bici");
	}

	@Override
	public void turnOff()
	{
		if (!started)
		{
			System.out.println("La bici no estava en moviment");
		}
		else
		{
			started = false;
			accelerating = false;
			stopping = false;
			System.out.println("S'ha aturat completament la bici");
		}
	}

	@Override
	public void accelerate()
	{
		if (accelerating)
			System.out.println("Ja estava accelerant");
		else if (started)
		{
			stopping = false;
			accelerating = true;
			System.out.println("La bici ha començat a accelerar");
		}
		else
		{
			started = true;
			accelerating = true;
			System.out.println("La bici s'ha posat en marxa i està accelerant");
		}
	}

	@Override
	public void stop()
	{
		if (stopping)
			System.out.println("Ja estava frenant");
		else if (started)
		{
			accelerating = false;
			stopping = true;
			System.out.println("La bici ha començat a frenar");
		}
		else
			System.out.println("La bici no està en marxa");
	
	}
}
