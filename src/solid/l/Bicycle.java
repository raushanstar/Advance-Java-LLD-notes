package solid.l;

/*
 * in This principle we can see Bicycle have method 
 * turn on engine that is  breaking function
 * but in Bike method is working
 * 
 */

public class Bicycle implements Bike{

	@Override
	public void turnOnEngine() {
		throw new AssertionError("There is no engine");
		
	}

	@Override
	public void accelerate() {
		// TODO do something
		
	}

}
