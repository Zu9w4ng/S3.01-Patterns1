package DavidS3.n1ex1;

import java.util.ArrayList;

public class Undo {
	
	private static Undo instance;
	private static ArrayList<String> commands = new ArrayList<String>();
	
	private Undo() {}
	
	public static Undo getInstance()
	{
		if(instance == null)
			instance = new Undo();
		
		return instance;
	}
	
	public static void addCommand(String command)
	{
		commands.add(command);
	}
	
	public static void printAllCommands()
	{
		commands.forEach(System.out::println);
	}
	
	public static String getCommand(int index) throws ArrayIndexOutOfBoundsException
	{
		if (index >= commands.size())
			throw new ArrayIndexOutOfBoundsException();
		
		return commands.get(index);
	}
	
	public static void removeCommand(int index)
	{
		commands.remove(index);
	}
	
	
}
