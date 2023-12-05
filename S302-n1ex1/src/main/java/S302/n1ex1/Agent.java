package S302.n1ex1;

import java.util.ArrayList;
import java.util.Random;

public class Agent
{
	private String name;
	private ArrayList<Listener> subscribers = new ArrayList<Listener>();
	
	public Agent(String name)
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

	public ArrayList<Listener> getSubscribers()
	{
		return subscribers;
	}
	
	public void addSubscriber(Listener subscriber)
	{
		subscribers.add(subscriber);
	}
	
	public void removeSubscriber(Listener subscriber)
	{
		subscribers.removeIf(s -> s.getName().equals(getName())
				&& s.getLocation().equals(subscriber.getLocation()));
	}
	
	public void updateMarket()
	{
		Random rand = new Random();
		int num = rand.nextInt(10);
		
		if (num <= 1)
			notifySubscribers(false);
		else if (num >= 8)
			notifySubscribers(true);
		else
			System.out.println("No s'han produit canvis significatius a la borsa");
	}
	
	private void notifySubscribers(boolean b)
	{
		System.out.println("L'agent " + name + " ha comunicat a les agències els canvis en la borsa");
		subscribers.forEach(s -> s.update(b));
	}
	
}
