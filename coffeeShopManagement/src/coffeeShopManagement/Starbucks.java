package coffeeShopManagement;

public class Starbucks {
	
	StarbucksCustomerManager starbucksCustomerManager;
	CoffeeShopManager coffeeShopManager;
	CampaignManager campaignManager;
	
	public Starbucks(StarbucksCustomerManager starbucksCustomerManager, CoffeeShopManager coffeeShopManager,
			CampaignManager campaignManager) {
		super();
		this.starbucksCustomerManager = starbucksCustomerManager;
		this.coffeeShopManager = coffeeShopManager;
		this.campaignManager = campaignManager;
	}
	
	
}
