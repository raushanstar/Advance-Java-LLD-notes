package solid.s;
/*
 * single responsibility principle
 * this principle say that each class should have only one specific function
 * so that in future if I want to change in one function then other function
 * should not effect ,
 * so, we have to separate class for each function
 * 👇👇👇
 
class Marker {
	String name;
	String color;
	int year;
	int price;
	
	public Marker(String name, String color, int year, int price) {
		this.name=name;
		this.color= color;
		this.year = year;
		this.price = price;
	}	
}

public class Invoice{
	private Marker marker;
	private int quantity;
	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity=quantity;
	}
	public int CalculateTotal() {
		int price = marker.price * quantity;
		return price;
	}
	
	public void printInvoice() {
		// TODO print invoice
	}
	public void saveToDB() {
		//TODO save to DB
	}
}
*/
class Marker {
	
	String name;
	String color;
	int year;
	int price;
	
	public Marker(String name, String color, int year, int price) {
		this.name=name;
		this.color= color;
		this.year = year;
		this.price = price;
	}	
}

public class Invoice{
	private Marker marker;
	private int quantity;
	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity=quantity;
	}
	public int CalculateTotal() {
		int price = marker.price * quantity;
		return price;
	}	
}

class InvoiceDAO{
	Invoice invoice;
	public InvoiceDAO(Invoice invoice) {
		this.invoice = invoice;
	}
	public void saveTODB() {
		//TODO save to DB
	}
}

class InvoicePrinter{
	Invoice invoice;
	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void printInvoice() {
		//TODO print Invoice
	}
}



