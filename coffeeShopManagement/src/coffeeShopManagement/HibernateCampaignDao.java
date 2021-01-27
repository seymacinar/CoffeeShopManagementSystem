package coffeeShopManagement;

public class HibernateCampaignDao implements ICampaignDao {

	@Override
	public void add() {
		System.out.println("Kampanya Hibernate kullanarak eklendi.");
	}

	@Override
	public void update() {
		System.out.println("Kampanya Hibernate kullanarak güncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Kampanya Hibernate kullanarak silindi.");
		
	}

}
