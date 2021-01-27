package coffeeShopManagement;

public class HibernateCustomerDao implements ICustomerDao {

	@Override
	public void add() {
		System.out.println("M��teri Hibernate kullanarak eklendi.");
		
	}

	@Override
	public void update() {
		System.out.println("M��teri Hibernate kullanarak g�ncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("M��teri Hibernate kullanarak silindi.");
		
	}

	@Override
	public void verify() {
		System.out.println("M��teri e-devlet �zerinden do�ruland�.");

	}	

}
