package coffeeShopManagement;

public class CoffeeShopManager {
	
	ICampaign campaign;

	public CoffeeShopManager(ICampaign campaign) {
		super();
		this.campaign = campaign;
	}
	
	public void toSell(Customer customer) {
		System.out.println("Müþteriye satýþ yapýldý: " + customer.getFirstName() + " " + customer.getLastName());
	}
	
	public void toSell(Customer customer, Campaign campaign) {
		System.out.println("Müþteriye satýþ yapýldý : " + customer.getFirstName() + " " + customer.getLastName());
		System.out.println("Kampanya: " + campaign.getName());
	}

}
