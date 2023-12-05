package S302.n1ex1;

public class App 
{
    public static void main( String[] args )
    {
    	Agent agent = new Agent("Juan");
    	
    	agent.addSubscriber(new Agency("Agència 1", "Barcelona"));
    	agent.addSubscriber(new Agency("Agència 2", "València"));
    	agent.addSubscriber(new Agency("Agència 3", "Barcelona"));
    	
    	for (int i = 0; i < 20; ++i)
    	{
    		agent.updateMarket();
    		System.out.println();
    	}
    		
    }
}
