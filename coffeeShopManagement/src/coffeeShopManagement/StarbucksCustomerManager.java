package coffeeShopManagement;

public class StarbucksCustomerManager extends CustomerManager {

	public StarbucksCustomerManager(ICustomerDao customerDao) {
		super(customerDao);
	}
	
	public void verify(Customer customer) {
		System.out.println("�sim: " + customer.getFirstName() + ", Soyisim: " + customer.getLastName() 
							+ ", TC No: " + customer.getTcNo() + ", Do�um Y�l�: " + customer.getBirthYear());
		System.out.println("M��terinin bilgileriyle e-devlet �zerinden do�rulama yap�ld�.");
		customerDao.verify();
		
	}

}
