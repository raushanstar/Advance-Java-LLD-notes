package solid.l;

/*
 * Liskov substitution princple: if class B is subtype of class A, then
	we should be able to replace object of A with B without breaking
	 the behaviour of the program
 * 
 */
public interface Bike {

	void turnOnEngine();
	void accelerate();
	
}
