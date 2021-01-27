package coffeeShopManagement;

public class CustomerManager {
	ICustomerDao customerDao;

	public CustomerManager(ICustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
	
	public void add (Customer customer) {
		System.out.println("M��teri eklendi.");
		customerDao.add();
	}
	
	public void update (Customer customer) {
		System.out.println("M��teri g�ncellendi.");
		customerDao.update();
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi.");
		customerDao.delete();
	}
	

}
