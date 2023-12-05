package Commands;

import Transports.Transport;

public class Stop implements Command
{
	public void execute(Transport transport)
	{
		transport.stop();
	}
}
