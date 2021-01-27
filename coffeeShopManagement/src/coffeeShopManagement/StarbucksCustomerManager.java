package coffeeShopManagement;

public class StarbucksCustomerManager extends CustomerManager {

	public StarbucksCustomerManager(ICustomerDao customerDao) {
		super(customerDao);
	}
	
	public void verify(Customer customer) {
		System.out.println("Ýsim: " + customer.getFirstName() + ", Soyisim: " + customer.getLastName() 
							+ ", TC No: " + customer.getTcNo() + ", Doðum Yýlý: " + customer.getBirthYear());
		System.out.println("Müþterinin bilgileriyle e-devlet üzerinden doðrulama yapýldý.");
		customerDao.verify();
		
	}

}
