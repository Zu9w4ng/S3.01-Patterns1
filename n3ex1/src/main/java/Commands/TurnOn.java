package Commands;

import Transports.Transport;

public class TurnOn implements Command
{
	public void execute(Transport transport)
	{
		transport.turnOn();
	}
}
