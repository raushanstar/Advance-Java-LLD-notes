package solid.o;

import solid.s.Invoice;
/*
 * Open for extension but closed for modification
 * 
 * This principle say that in if any extra function want to add then we have not add in already
 * existing class for new function we have to add in new class
 * so means for modification its ok to modify in existing function
 * but in extension function we have add in new class

*/
//class InvoiceDAO{
//	Invoice invoice;
//	public InvoiceDAO(Invoice invoice) {
//		this.invoice = invoice;
//	}
//	
//	public void saveToDB() {
//		//TODO save invoice to db
//	}
//	public void saveToFile() {
//		//TODO save to file
//	}
//}

public class DatabaseInvoiceDao implements InvoiceDaoInfercae{

	@Override
	public void save(Invoice invoice) {
		//TODO save to db
		
	}

	
	
}
