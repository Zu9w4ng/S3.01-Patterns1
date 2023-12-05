package Transports;

public abstract class Transport
{
	protected boolean started = false;
	protected boolean accelerating = false;
	protected boolean stopping = false;
	
	public boolean isStarted() 
	{
		return started;
	}
	
	public boolean isAccelerating() 
	{
		return accelerating;
	}
	
	public boolean isStopping() 
	{
		return stopping;
	}
	
	public abstract void turnOn();
	
	public abstract void turnOff();
	
	public abstract void accelerate();
	
	public abstract void stop();
	
}
