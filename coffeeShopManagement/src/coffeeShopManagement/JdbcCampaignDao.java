package coffeeShopManagement;

public class JdbcCampaignDao implements ICampaignDao {

	@Override
	public void add() {
		System.out.println("Kampanya JDBC kullanarak eklendi.");
		
	}

	@Override
	public void update() {
		System.out.println("Kampanya JDBC kullanarak gŁncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Kampanya JDBC kullanarak silindi.");
		
	}

}
