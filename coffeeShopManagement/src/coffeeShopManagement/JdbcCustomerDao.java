package coffeeShopManagement;

public class JdbcCustomerDao implements ICustomerDao{

	@Override
	public void add() {
		System.out.println("Müþteri JDBC kullanarak eklendi.");
	}

	@Override
	public void update() {
		System.out.println("Müþteri JDBC kullanarak güncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Müþteri JDBC kullanarak silindi.");
		
	}
	
	@Override
	public void verify() {
		System.out.println("Müþteri e-devlet üzerinden doðrulandý.");

	}	

}
