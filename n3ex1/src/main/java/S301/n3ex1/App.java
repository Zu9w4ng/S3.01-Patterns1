package S301.n3ex1;

import Commands.*;
import Transports.*;

public class App 
{
    public static void main( String[] args )
    {
    	Car car = new Car();
    	
    	TurnOn engager = new TurnOn();
    	TurnOff stopper = new TurnOff();
    	Accelerate accelerator = new Accelerate();
    	Stop brakes = new Stop();
    	
    	accelerator.execute(car);
    	engager.execute(car);
    	accelerator.execute(car);
    	brakes.execute(car);
    	stopper.execute(car);
    	
    	Ship ship = new Ship();
    	
    	engager.execute(ship);
    	accelerator.execute(ship);
    	brakes.execute(ship);
    	brakes.execute(ship);
    	
    	Plane plane = new Plane();
    	
    	Command on = (transport -> new TurnOn().execute(transport));
    	on.execute(plane);
    	
    	Command off = (new TurnOff()::execute);
    	off.execute(plane);
    }
}
