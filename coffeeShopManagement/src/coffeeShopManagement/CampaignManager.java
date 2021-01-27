package coffeeShopManagement;

public class CampaignManager {
	
	ICampaignDao campaignDao;
	
	
	public CampaignManager(ICampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi");
		campaignDao.add();
	}
	
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi.");
		campaignDao.update();

	}
	
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi.");
		campaignDao.delete();

	}

}
