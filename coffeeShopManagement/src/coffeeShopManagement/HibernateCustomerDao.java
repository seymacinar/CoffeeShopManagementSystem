package coffeeShopManagement;

public class HibernateCustomerDao implements ICustomerDao {

	@Override
	public void add() {
		System.out.println("Müþteri Hibernate kullanarak eklendi.");
		
	}

	@Override
	public void update() {
		System.out.println("Müþteri Hibernate kullanarak güncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Müþteri Hibernate kullanarak silindi.");
		
	}

	@Override
	public void verify() {
		System.out.println("Müþteri e-devlet üzerinden doðrulandý.");

	}	

}
