package S302.S302_n2ex1;

public class App 
{
    public static void main( String[] args )
    {
    	Shop shop = new Shop("Sabates Marc");
    	PaymentManager manager = new PaymentManager();
    	
    	manager.payment(shop, 54);
    }
}
