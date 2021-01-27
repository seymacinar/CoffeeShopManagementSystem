package coffeeShopManagement;

public class Campaign {
	int id;
	String campaignName;
	
	
	public Campaign(int id, String campaignName) {
		super();
		this.id = id;
		this.campaignName = campaignName;
	}
	
	public Campaign() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return campaignName;
	}
	public void setName(String campaignName) {
		this.campaignName = campaignName;
	}
	

}
