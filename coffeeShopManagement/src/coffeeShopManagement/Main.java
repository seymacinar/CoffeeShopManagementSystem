package coffeeShopManagement;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new NeroCustomer();
		customer.setFirstName("Beyzanur");
		customer.setLastName("��nar");
		customer.setId(2);
		customer.setTcNo("98745632145");
		customer.setBirthYear(2001);
		
		Nero nero = new Nero(new NeroCustomerManager(new HibernateCustomerDao()), new CoffeeShopManager(null), new CampaignManager(null));
		
		nero.neroCustomerManager.add(customer);
		nero.coffeeShopManager.toSell(customer);
		
		
		Customer customer2 = new StarbucksCustomer();
		customer2.setFirstName("�eyma");
		customer2.setLastName("��nar");
		customer2.setId(1);
		customer2.setTcNo("12345678912");
		customer2.setBirthYear(1999);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Y�ld�z Kampanyas� ");
		
		Starbucks starbucks = new Starbucks(new StarbucksCustomerManager(new HibernateCustomerDao()), new CoffeeShopManager(new StarCampaign()), new CampaignManager(new HibernateCampaignDao()));
		
		starbucks.starbucksCustomerManager.add(customer2);
		starbucks.starbucksCustomerManager.verify(customer2);
		starbucks.campaignManager.add(campaign);
		starbucks.coffeeShopManager.toSell(customer2, campaign);
		
		

	}

}
