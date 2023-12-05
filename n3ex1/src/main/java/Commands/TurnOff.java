package Commands;

import Transports.Transport;

public class TurnOff implements Command
{	
	public void execute(Transport transport)
	{
		transport.turnOff();
	}
}
