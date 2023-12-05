package Commands;

import Transports.Transport;

public class Accelerate implements Command
{
	public void execute(Transport transport)
	{
		transport.accelerate();
	}
}