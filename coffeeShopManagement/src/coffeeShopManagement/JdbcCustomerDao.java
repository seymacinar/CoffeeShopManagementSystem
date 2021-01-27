package coffeeShopManagement;

public class JdbcCustomerDao implements ICustomerDao{

	@Override
	public void add() {
		System.out.println("M��teri JDBC kullanarak eklendi.");
	}

	@Override
	public void update() {
		System.out.println("M��teri JDBC kullanarak g�ncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("M��teri JDBC kullanarak silindi.");
		
	}
	
	@Override
	public void verify() {
		System.out.println("M��teri e-devlet �zerinden do�ruland�.");

	}	

}
