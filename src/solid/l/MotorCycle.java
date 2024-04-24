package solid.l;

public class MotorCycle implements Bike{

	boolean isEngineOn;
	int speed;
	
	@Override
	public void turnOnEngine() {
		this.isEngineOn = isEngineOn;
	}

	@Override
	public void accelerate() {
		speed = speed +10;
		
	}

}
