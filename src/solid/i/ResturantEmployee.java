package solid.i;


/*
 * 
 * Interface Segmented Principle: Interface should be such,
 *  that client should implement unnecessary functions they do not need
	according to this principle for each diff function we have to make diff interface
	so that in class not have implemented in unused method that is not irrelevant class
 */
public interface ResturantEmployee {

	void washDishes();
	void serveCustomers();
	void cookfood();
}
