package Commands;

import Transports.Transport;

@FunctionalInterface
public interface Command
{
	public void execute(Transport transport);
}
