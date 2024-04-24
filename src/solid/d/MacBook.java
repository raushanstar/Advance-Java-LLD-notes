package solid.d;

/*
 * Dependency Inversion  Principle: Class should depend on interfaces rather
 *  than concrete classes

 * according to this principle we have to make loose coupling our class not hard coupling 
 * 
 * here first commented class we can see in macBook class
 * we can only pass Wirekeyword and wireMouse only , if I want to use bluetooth keyword
 * we cant do in same class we have to change
 * but if I use intrface Keyword and interface Mouse 
 * then we can pass diff feature in same class
 */

//public class MacBook {
//	private WireKeyword keyword;
//	private WireMouse mouse;
	
//	public MacBook() {
//		keyword = new WireKeyword();
//		mouse = new WireMouse();
//	}
//}

public class MacBook {
	private Keyword keyword;
	private Mouse mouse;
	
	public MacBook() {
		this.keyword =  keyword;
		this.mouse = mouse;
	}
}
